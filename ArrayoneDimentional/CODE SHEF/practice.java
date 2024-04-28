import java.util.*;
public class practice {
    public static int f(String str[],int N){
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length;i++){
            if(mp.containsKey(str[i])) mp.put(str[i],i);
            else mp.put(str[i],i);
        }
        
        int count = 0;
        for (int i = 0; i < str.length; ) {
            Integer x = mp.get(str[i]); // Use Integer to handle null values
            // System.out.println("===");
            int j = i;
            while (x != null&& x < N && j <= x) {
                x = mp.get(str[j]); // Update x inside the loop
                j++;
            }
            i = j;
            System.out.println(i);
            count++;
        }
        // return count;
        return count-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]={"abc","def","abc","aieh"};
        System.out.println(f(str,str.length));
    }
}
