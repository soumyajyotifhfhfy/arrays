//Copied from leetcode
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays; 

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }

        return false; // No duplicate found
    }
    public static void main(String args[]) {
        int a[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(Arrays.toString(a));
        System.out.println(containsDuplicate(a));
    }
}
/*Done by me in leetcode
import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int c = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            c++;
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        // No duplicates found
        return false;
    }
}*/