import java.util.*;
class findallduplicatesinanarray {
    public List<Integer> findDuplicates(int[] nums) {
     List<Integer> out=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            //if index is negative add because the nymber has been found once
            if(nums[index]<0)
                out.add(index+1);
            nums[index]=-nums[index];
        }
        return out;
    }
}