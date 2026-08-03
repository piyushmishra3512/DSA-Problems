/*Given an array nums where each integer in nums appears thrice except one. Find out the number that has appeared only once. */
public class single_number_2 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int BitIndex = 0 ; BitIndex<32;BitIndex++){
            int cnt = 0;
            for(int i = 0 ; i<n ; i++ ){
                if((nums[i] & (1<<BitIndex))!=0) cnt++;
            }
            if(cnt%3!=0){
                ans = ans| (1<<BitIndex);
            }
            
        }
        return ans;
    }
    
}
