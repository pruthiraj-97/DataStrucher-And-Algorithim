import java.util.*;
public class stringequal {
    public static int f(String str){
        int curr=2;
        int number=1;
        int cost=1;
        int total=0;
        for(int i=0;i<str.length();i++){
            if(curr==10){
                curr=3;
                if(total>=25){
                    cost=4;
                }
                else if(number>=17){
                    cost=3;
                }else{
                    cost=2;
                }
                total+=cost;
            }else{
                curr++;
                total+=cost;
            }
            number++;
        }
        return total;
    }
    public static void main(String[] args) {
      System.out.println(f("xycdefghij"));
      System.out.println("acolkxjbizfmhnrdq".length());

    }
}
