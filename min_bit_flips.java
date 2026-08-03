/*Given two integers start and goal. Flip the minimum number of bits of start integer to convert it into goal integer.
A bits flip in the number val is to choose any bit in binary representation of val and flipping it from either 0 to 1 or 1 to 0. */

public class min_bit_flips {
    public int minBitsFlip(int start, int goal) {
        int XORresult = start^goal;
        return countSet(XORresult);

        //your code goes here
    }
    public int countSet(int n ){
        int cnt = 0;
        while(n>0){
            cnt+=(n&1);
            n=n>>1;
        }
        return cnt;
    }
    
}
