import java.util.*;
public class practice {
    public static int Answar(String str){
        Map<String,Integer> mp=new HashMap<>();
        int j=0;
        int i;
        int maxi=0;
        for( i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(j)){
                String s=str.substring(j,i);
                maxi=Math.max(maxi,s.length());
                if(mp.containsKey(s)){
                    mp.put(s,mp.get(s)+1);
                }else{
                    mp.put(s,1);
                }
                j=i;
            }
        }
        
        String s=str.substring(j,i);
                if(mp.containsKey(s)){
                    mp.put(s,mp.get(s)+1);
                }else{
                    mp.put(s,1);
                }
        maxi=Math.max(maxi,s.length());
        System.out.println(mp);
        int max=0;
        int fre=0;
        for(var v:mp.entrySet()){
              if(v.getValue()>1&&v.getKey().length()>=max){
                max=v.getKey().length();
                fre=v.getValue();
              }
        }
        System.out.println(maxi);
        if(max!=maxi){
            return maxi-1;
        }
        return max;
    }
    public static void main(String[] args) {
        String str="acbccbdddddcaacbcdcdabb";
    
        System.out.println(Answar(str));
        
        }
}
