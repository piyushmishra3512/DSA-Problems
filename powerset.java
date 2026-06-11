import java.util.ArrayList;
import java.util.List;

public class powerset {
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        powerSetgen(0 , result, temp ,nums, nums.length);
        return result;
        
    }
    public void powerSetgen(int index ,List<List<Integer>> result,List<Integer> temp, int[] nums , int n  ){
        if(index==n){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        powerSetgen(index+1, result , temp,nums,n);
        temp.remove(temp.size()-1);
        powerSetgen(index+1 , result, temp , nums , n);
    }
    
}
