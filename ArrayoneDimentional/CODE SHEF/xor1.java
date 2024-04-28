import java.util.*;
public class xor1 {
    public static void main(String[] args) {
        int X=5;
        int diff=Integer.MAX_VALUE;
        int a=-1;
        int b=-1;
        for(int i=0;i<X-1;i++){
            for(int j=i+1;j<X;j++){
                int res=j^i;
                if(res>X) continue;
                if(j-i<diff){
                    diff=j-i;
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println(a+" "+b);
    }
}
