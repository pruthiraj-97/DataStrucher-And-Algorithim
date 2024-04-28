import java.util.*;
public class palindrompartion4 {
    static int mod=(int)(Math.pow(10,9)+7);
    public static int f(int n,String s){
        if(s.length()==n){
            return 1;
        }
        int count=0;
        if(s.length()%2==0){
            for(int i=0;i<=8;i=i+2){
                count+=(f(n,s+i))%mod;
            }
        }else{
            for(int j=2;j<=7;j=j+2){
                if(j==4) j--;
                count+=(f(n,s+j))%mod;
            }
        }
        return count%mod;
    }
    public static void main(String[] args) {
        System.out.println(f(10,""));
    }
}
