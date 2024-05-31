/*
Algorithm:
The steps are as follows:
1.	Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this: low will point to the first index, and high will point to the last index.
2.	Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
         mid = (low+high) // 2 ( ‘//’ refers to integer division)
3.	Check if arr[mid] == target: If it is, return the index mid.
4.	Identify the sorted half, check where the target is located, and then eliminate one half accordingly:
    1.	If arr[low] <= arr[mid]: This condition ensures that the left part is sorted.
        1.	If arr[low] <= target && target <= arr[mid]: It signifies that the target is in this sorted half. So, we will eliminate the right half (high = mid-1).
        2.	Otherwise, the target does not exist in the sorted half. So, we will eliminate this left half by doing low = mid+1.
    2.	Otherwise, if the right half is sorted:
        1.	If arr[mid] <= target && target <= arr[high]: It signifies that the target is in this sorted right half. So, we will eliminate the left half (low = mid+1).
        2.	Otherwise, the target does not exist in this sorted half. So, we will eliminate this right half by doing high = mid-1.
5.	Once, the ‘mid’ points to the target, the index will be returned.
6.	This process will be inside a loop and the loop will continue until low crosses high. If no index is found, we will return -1.
*/
import java.util.*;
class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found, return the index
            }

            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Search in the left sorted half
                } else {
                    left = mid + 1; // Search in the right half
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Search in the right sorted half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
        }

        return -1; // Target not found
    }
    public static void main(String args[]) {
        int a[] = {4,5,6,7,0,1,2};
        System.out.println(Arrays.toString(a));
        System.out.println(search(a, 5));
    }
}
