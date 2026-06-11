//Implement the power function pow(x, n) , which calculates the x raised to n i.e. xn.
//Note : In output print 4 digits places after decimal point.

public class myPow {
    public double myPowCreator(double x  , int n ){
        long num = n; // To avoid overflow
        if(num<0) {
            x = 1/x;
            num = -num;
        }
        return myPowHelper(x, num);

    }
    public double myPowHelper(double x  , long n ){
        if(n==0) return 1;
        if (n==1) return x;
        if(n%2==0) {
            return myPowHelper(x*x , n/2);
        }
        else {
            return x*myPowHelper(x*x , n/2);
        }

    }
    
}
