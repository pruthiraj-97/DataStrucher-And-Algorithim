import java.util.*;
public class stringcompression {
    public static void main(String[] args) {
        String str[]=new String[2];
        str[0]="pruthi";
        str[1]="raj";
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        str[0]="";
        System.out.println();
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        int intValue = 3;

        // Convert int to char
        char charValue = (char) (intValue + '0'); // Assuming you want to convert to the corresponding digit character

        // Create an array and store the character
        System.out.println(charValue);

        // Print the result
       ; 
    }
}
