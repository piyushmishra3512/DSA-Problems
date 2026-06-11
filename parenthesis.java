/*Given an integer n.Generate all possible combinations of well-formed parentheses of length 2 x N.

Example 1

Input : n = 3

Output : [ "((()))" , "(()())" , "(())()" , "()(())" , "()()()" ] */

import java.util.ArrayList;
import java.util.List;

public class parenthesis {
    public List<String> parenthesisGen(int  n){
        List<String> result = new ArrayList<>();
        parenthesisFormation("",0,0,result , n);
        return result;
    }
    public void parenthesisFormation(String s , int open , int close , List<String> result  , int  n){
        if(open==close && open+close==2*n){
            result.add(s);
            return;
        }
        if(open<n){
            parenthesisFormation(s+"(", open+1, close, result, n);
        }
        if(close<open){
            parenthesisFormation(s+")", open, close+1, result, n);
        }
    }
    
}
