import java.util.*;
public class WordBreak {
    public static boolean f(int i,int j,String str,ArrayList<String> arr){
        if(i==str.length()){
            return true;
        }
        if(j>=arr.size()){
            return false;
        }
        boolean flag1=false;
        if(i+arr.get(j).length()<=str.length()){
            String s=str.substring(i,i+arr.get(j).length());
            if(s.equals(arr.get(j))){
                flag1=f(i+s.length(),j+1,str,arr);
            }
        }
        boolean flag2=f(i,j+1,str,arr);
        return flag1||flag2;
    }
    public static void main(String[] args) {
        String str="ilikesamsung";
        // direct add somne sting in list
        ArrayList<String> arr=new ArrayList<>();
        arr.add("i");
        arr.add("mobile");
        arr.add("sam");
        arr.add("sung");
        System.out.println(f(0,0,"ilikesamsung",arr));
    }
}
