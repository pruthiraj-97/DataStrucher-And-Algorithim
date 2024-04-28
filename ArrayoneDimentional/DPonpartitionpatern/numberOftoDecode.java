 import java.util.*;
public class numberOftoDecode {
    public static int f(String str,int i){
        if(i>=str.length()) return 1;
        if(str.charAt(i)=='0') return 0;
        int part1=0;
        String s=str.substring(i,i+1);
        if(Integer.parseInt(s)<=26){
            part1=f(str,i+1);
        }
        int part2=0;
        if(i+2<=str.length()){
        String s2=str.substring(i,i+2);
        if(Integer.parseInt(s2)<=26){
            part2=f(str,i+2);
        }
        }
        return part1+part2;
        // return count;
    }
    public static void main(String[] args) {
        String str="123";
        System.out.println(f(str,0));
    }
}

