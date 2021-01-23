//Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.

package codingproblems;

public class KadensAlgo {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}
	public static int maxSubArraySum(int arr[]) {
		int max_so_far = 0;
        int max_ending_here=0;
        for (int i =0;i<arr.length;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far<max_ending_here)
            {
                max_so_far = max_ending_here;
            }
            if(max_ending_here <0)
            {
                max_ending_here = 0;
            }
        }
        
        return max_so_far;
	}

}
