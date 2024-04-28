import java.util.*;
public class powerofnumber {
    public static double power(double a,int b){
        if(b==-1) return a;
        double result=power(a,b/2);
        double finalresult=(result*result);
        if(b%2==0) return 1/finalresult;
        else return 1/(finalresult*a);
    }
      public static void main(String[] args) {
         System.out.println(power(2,-2));
      }
}
