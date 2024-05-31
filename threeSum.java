import java.util.*;
class threeSum {
 public static List<List<Integer>> threeSum(int[] nums) {
    // Step 1: Initialize a HashSet to store unique triplets
    Set<List<Integer>> res = new HashSet<>();

    // Step 2: Check if the array is empty, return an empty ArrayList if true
    if (nums.length == 0) return new ArrayList<>(res);

    // Step 3: Sort the array in ascending order
    Arrays.sort(nums);

    // Step 4: Iterate through the array up to the third-to-last element
    for (int i = 0; i < nums.length - 2; i++) {
        // Step 5: Initialize pointers j and k
        int j = i + 1;
        int k = nums.length - 1;

        // Step 6: Use a while loop to find triplets
        while (j < k) {
            // Step 7: Calculate the sum of the current triplet
            int sum = nums[j] + nums[k];

            // Step 8: Check if the sum is equal to the negation of the current element (nums[i])
            if (sum == -nums[i]) {
                // Step 9: If true, add the triplet to the HashSet
                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                // Move pointers to explore other possible triplets
                j++;
                k--;
            } else if (sum > -nums[i]) {
                // Step 10: If the sum is greater, decrement k to reduce the sum
                k--;
            } else if (sum < -nums[i]) {
                // Step 11: If the sum is smaller, increment j to increase the sum
                j++;
            }
        }
    }
    

    // Step 12: Convert the HashSet to an ArrayList and return the result
    return new ArrayList<>(res);
    }


    public static void main (String[] args){
        int [] a={-1,0,1,2,-1,-4};
        System.out.println(threeSum(a));
    }
}
