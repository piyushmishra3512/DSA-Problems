import java.util.ArrayList;
import java.util.List;

public class combinationSumProblem {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();

        for(int candidate: candidates){
            v.add(candidate);
        }
        solve_combinationSum(v, v.size()-1, v2, target,result);
        return result;

    }
    public void solve_combinationSum(List<Integer> v, int  i,List<Integer> v2,int target,List<List<Integer>> result ){
        if(target == 0){
            result.add(new ArrayList<>(v2));
            return;

        }
        if(i<0 || target<0){
            return;
        }
        v2.add(v.get(i));
        solve_combinationSum(v, i ,v2, target-v.get(i), result );
        v2.remove(v2.size()-1);
        solve_combinationSum(v, i-1,v2, target, result);

    }
    
}
