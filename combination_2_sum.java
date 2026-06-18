import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_2_sum {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>  result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        solveProblem(candidates, target , 0 , candidates.length, result , temp);
        return result;
    }
    public void solveProblem(int[] candidates, int k , int i , int len , List<List<Integer>>  result, List<Integer> temp ){
        //base case 1
        if(k==0){
            result.add(new ArrayList<>(temp));
            return;
        } 
        //base case 2
        if(k<0 || i==len){
            return;
        }
        // take
        temp.add(candidates[i]);
        solveProblem(candidates, k-candidates[i],i+1,len,result,temp);
        temp.remove(temp.size()-1);
        // Not take
        for(int j = i+1 ; j<candidates.length; j++){
            if(candidates[j]!=candidates[i]){
                solveProblem(candidates,k,j,len,result,temp);
                break;
            }
        }

    }
    
}
