/*Given an array nums and an integer k.Return the number of non-empty subsequences of nums such that the sum of all elements in the subsequence is equal to k.
Example 1
Input : nums = [4, 9, 2, 5, 1] , k = 10
Output : 2

Explanation : The possible subsets with sum k are [9, 1] , [4, 5, 1]. */
import java.util.ArrayList;
import java.util.List;

public class Count_all_subsequences_with_sum_K {
    public int countSubsequenceWithTargetSum(int[] nums, int k){
        int  n = nums.length ; 
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsequenceCounter(nums, k , n , 0 , result, temp);
        return result.size();
    }
    public void subsequenceCounter(int[] nums , int k , int n , int i ,List<List<Integer>> result , List<Integer> temp){
        if(i==n){
            if(k==0){
                result.add(new ArrayList<>(temp));
                return;
            }
        }
        // Take
        temp.add(nums[i]);
        subsequenceCounter(nums, k-nums[i], n, i+1, result, temp);
        temp.remove(temp.size()-1);
        // Not take
        subsequenceCounter(nums, k, n, i+1, result, temp);

    }
    
}
/*Time Complexity of the recursive approach is O(2^N), where n is the number of elements in the array. 
This is because each element has two choices (to include or exclude), leading to an exponential number of possible subsets.

Space Complexity is O(N), where n is the maximum depth of the recursion stack. 
This depth corresponds to the number of elements in the array being considered at any given time. */
