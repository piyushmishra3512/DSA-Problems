//Given a 2-D array mat where the elements of each row are sorted in non-decreasing order, and the first element of a row is greater than the last element of the previous 
// row (if it exists), and an integer target, determine if the target exists in the given mat or not.
public class search_in_2d_matrix {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length ; 
        int m = mat[0].length;
        int  low = 0 ;
        int high = n*m-1;
        while(low<= high){
            int mid = low+((high-low)/2);
            int row = mid/m;
            int column = mid%m;
            if(target == mat[row][column]){
                return true;

            }
            else if(target < mat[row][column]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;

    }
    
    
}
 // Important formula  
 // If i is index , m = no. of columns in the matrix then row = i/m and column = i%m