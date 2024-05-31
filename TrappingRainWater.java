// Done by me after seeing aman bhaiya video soln.
// take u forward ka kuch samajh nahi aya
// Algorithm
/*1)construct keft array of maximum height building in left al[]
2)construct right array of maximum height building in right ar[]
3) water trapped in at[i]=min(al[i],ar[i])-height[i]
4) total water stored = summation of all elements inat[]*/
import java.util.*;
class TrappingRainWater {
    public static int trap(int[] height) {
        
        int l=height.length;
        int al[]=new int[l];
        int ar[]=new int[l];
        //int at[]=new int[l];
        int sum=0;
        int dummy_left=0;
        int dummy_right=0;
        dummy_left=height[0];
        for(int i=0;i<l;i++)
        {
            dummy_left=Math.max(dummy_left,height[i]);
            al[i]=dummy_left;
        }
        for(int i=l-1;i>=0;i--)
        {
            dummy_right=Math.max(dummy_right,height[i]);
            ar[i]=dummy_right;
        }
        for(int i=0;i<l;i++)
        {
            //at[i]=Math.min(al[i],ar[i])-height[i];
            sum+=Math.min(al[i],ar[i])-height[i];
        }
        return sum;
        
    }
    public static void main(String args[]) {
        int a[] = {4,2,0,3,2,5};
        System.out.println(Arrays.toString(a));
        System.out.println(trap(a));
    }
}