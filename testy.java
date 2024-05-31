import java.util.*;
class testy {
    public static void main(String args[]) {
        int [] prices={7,6,4,3,1};
        int l=prices.length;
        int min=Integer.MIN_VALUE;
        int aux[]=new int[l];
        int res=0;
        for(int i=l-1;i>=0;i--){
            min=Math.max(prices[i],min);
            aux[l-1-i]=min;
        }
        for(int i=0;i<l;i++){
            res=Math.max(aux[i]-prices[i], res);
        }
        System.out.println(Arrays.toString(aux));
    }
    
}