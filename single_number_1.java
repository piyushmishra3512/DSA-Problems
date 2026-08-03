/*Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array. */
public class single_number_1 {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int num = 0;
        for(int i = 0 ; i<n ; i++ ){
            num = num^nums[i];

        }
        return num;
        
    }
    
}
