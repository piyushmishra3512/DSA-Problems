/*Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6 */
public class max_subarray {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        long sum = 0 ; 
        long maxSum = Integer.MIN_VALUE;
        for(int  i = 0 ; i< n ; i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return (int) maxSum;
        
    }
}