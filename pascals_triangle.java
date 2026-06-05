import java.util.ArrayList;
import java.util.List;

public class pascals_triangle {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            result.add(pascalTriangleII(i));

        }
        return result;

    }
    public List<Integer> pascalTriangleII(int n) {
        List<Integer> triangle = new ArrayList<>();
        int answer = 1;
        triangle.add(answer);

        for(int col = 1; col<n ; col++){
            answer = answer * (n-col);
            answer = answer / col;
            triangle.add(answer);
        }
        return triangle;
    }
    
    
}
