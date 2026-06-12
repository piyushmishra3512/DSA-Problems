/*Given an array nums and an integer k. Return true if there exist subsequences such that the sum of all elements in subsequences is equal to k else false.
Example 1

Input : nums = [1, 2, 3, 4, 5] , k = 8

Output : Yes

Explanation : The subsequences like [1, 2, 5] , [1, 3, 4] , [3, 5] sum up to 8. */
public class check_if_there_exist_subsequence {
    public boolean checksubsequenceSum(int [] nums , int k){
        int n = nums.length;
        return solve_problem(nums , n , k , 0);
    }
    public boolean solve_problem(int [] nums , int n , int k , int i){
        if(k==0) return true; // k gets reduced everytime a element gets accepted (k-nums[i])
        if(k<0) return false;
        if(i==n) return k==0;
        return (solve_problem(nums, n, k-nums[i], i+1)|| solve_problem(nums, n, k, i+1));
        // above statement means either the element will get accepted or its not accepted. 
    }
    
}
