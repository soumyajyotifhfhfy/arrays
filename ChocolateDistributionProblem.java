/*Let's apply the Chocolate Distribution Problem approach to the given array [3,4,1,9,56,7,9,12] with m=5.
1.	Sort the array in non-decreasing order:
Sorted Array: [1,3,4,7,9,9,12,56]
2.	Iterate through all possible windows of size m=5 and calculate the difference between the maximum and minimum elements in each window:
•	Window 1: [1,3,4,7,9] → Difference = 9−1=8
•	Window 2: [3,4,7,9,9] → Difference = 9−3=6
•	Window 3: [4,7,9,9,12] → Difference = 12−4=8
•	Window 4: [7,9,9,12,56] → Difference = 56−7=49
3.	Return the minimum difference among all windows:
The minimum difference is 6 (from Window 2).
So, the minimum difference after distributing m=5 chocolates is 6.
*/

import java.util.*;
 
class ChocolateDistributionProblem {
 
    
    static int findMinDiff(int arr[], int n, int m)
    {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;
 
       
        Arrays.sort(arr);
 
        // Number of students cannot be
        // more than number of packets
        if (n < m)
            return -1;
 
        
        int min_diff = Integer.MAX_VALUE;
 

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
 

    public static void main(String[] args)
    {
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                      40, 28, 42, 30, 44, 48, 43, 50 };
 
        int m = 7; // Number of students
 
        int n = arr.length;
        System.out.println("Minimum difference is "
                           + findMinDiff(arr, n, m));
    }
}