/*
1.	Initialize two pointers, left and right, at the beginning and end of the array, respectively.
2.	Initialize variables maxLeft and maxRight to keep track of the maximum height encountered so far from the left and right, respectively.
3.	Use a while loop to iterate through the array until left is less than or equal to right.
4.	Inside the loop:
•	If the height at left is less than or equal to the height at right, process the left side.
•	If the height at left is greater than or equal to maxLeft, update maxLeft. Otherwise, add the trapped water to the result.
•	Move the left pointer to the next building.
•	If the height at right is less than the height at left, process the right side.
•	If the height at right is greater than or equal to maxRight, update maxRight. Otherwise, add the trapped water to the result.
•	Move the right pointer to the previous building.
5.	Continue the process until left is greater than right.
6.	Return the total trapped water stored in the variable res.
*/

import java.util.*;
class TrappingRainWater2 {
    public static int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;

        // While there are buildings to consider
        while (left <= right) {
            // If the height of the building at 'left' is less than or equal to the height at 'right'
            if (height[left] <= height[right]) {
                // Check if the height at 'left' is greater than or equal to the maxLeft
                if (height[left] >= maxLeft) {
                    // Update maxLeft
                    maxLeft = height[left];
                } else {
                    // Add the trapped water to the result
                    res += maxLeft - height[left];
                }
                // Move the 'left' pointer to the next building
                left++;
            }
            // If the height of the building at 'right' is less than the height at 'left'
            else {
                // Check if the height at 'right' is greater than or equal to the maxRight
                if (height[right] >= maxRight) {
                    // Update maxRight
                    maxRight = height[right];
                } else {
                    // Add the trapped water to the result
                    res += maxRight - height[right];
                }
                // Move the 'right' pointer to the previous building
                right--;
            }
        }
        // Return the total trapped water
        return res;
    }

    public static void main(String args[]) {
        int a[] = {4,2,0,3,2,5};
        System.out.println(Arrays.toString(a));
        System.out.println(trap(a));
    }
}