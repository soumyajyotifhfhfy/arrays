import java.util.*;
class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int minsofar=Integer.MAX_VALUE, maxprofit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(prices[i],minsofar);
            maxprofit=Math.max(maxprofit, (prices[i]-minsofar));
        }
        return maxprofit;
        
    }
    public static void main(String args[]) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(Arrays.toString(a));
        System.out.println(maxProfit(a));
    }
}