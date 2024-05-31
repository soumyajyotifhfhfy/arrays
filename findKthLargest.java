import java.util.PriorityQueue;

class findKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (pq.peek() < nums[i]) {
                pq.poll(); // Corrected from pq.pop()
                pq.add(nums[i]); // Corrected from pr.add()
            }
        }
        return pq.peek();
    }
    public static void main(String[] args)
    {
        int arr[] = {3,2,1,5,6,4};
        System.out.println(findKthLargest(arr, 2));
    }
    
}