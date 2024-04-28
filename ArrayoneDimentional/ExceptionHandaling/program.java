import java.util.*;
public class program {
    public static void main(String[] args) {
       int a=9;
       int b=0;
       try{
         int ans=a/b;
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
       }
       catch(ArithmeticException e){
        System.out.println(e);
       }
       catch(Exception ex){
        System.out.print(ex);
       }
      
    }
}
