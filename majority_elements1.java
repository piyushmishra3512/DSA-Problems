//Given an integer array nums of size n, return the majority element of the array.
//The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

public class majority_elements1 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt =0;
        int el = 0;
        for(int i = 0 ; i < n ; i++){
            if(cnt ==0){
                cnt=1;
                el = nums[i];
            }
            else if(el== nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int number = 0;
        for(int  i = 0 ; i< n ; i++){
            if(nums[i]==el){
                number++;
            }
        }
        if(number>n/2){
            return el;
        }
        return-1;
    }

    
}
