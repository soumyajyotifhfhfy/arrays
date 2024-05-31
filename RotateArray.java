/*
 * There are 2 ways to solve the problem:-
 * Ist way:- nick white video
 * Input: {1, 2, 3 ,4, 5, 6, 7} & k = 3
 * Output:{5, 6, 7, 1, 2, 3, 4}
 * Algorithm:-
 * step 1: Original list                    : 1, 2, 3 ,4, 5, 6, 7
 * step 2: After reversing all numbers      : 7  6  5  4  3  2  1 
 * step 3: After reversing first k numbers  : 5  6  7  4  3  2  1
 * step 4: After reversing last n-k numbers : 5  6  7  1  2  3  4
 */
class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
      k=k%n;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void reverse(int [] arr, int start, int end){
        while (start < end) 
        { 
            int temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }  
        
    }
}