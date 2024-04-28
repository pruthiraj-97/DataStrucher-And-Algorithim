import java.util.*;
public class practice4 {
    public static String helper(String str,int k){
        int j=0;
        int count=0;
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        String temp="";
        int max=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            int asci=(int)str.charAt(i);
            if(asci-48==1){
                count++;
            }
        
            while(j<=i&&count>=k){
                //if(max>=i-j+1){
                max=Math.min(max,i-j+1);
                 ans[0]=j;
                 ans[1]=i;
                String st=str.substring(ans[0], ans[1]+1);
               // long x=(long)Integer.parseInt(st);
                if(count==k){
                     ans[0]=j;
                    ans[1]=i;
                    String sr=str.substring(ans[0],ans[1]+1);
                    System.out.print(sr+" ");

                    if(temp==""){
                        temp=str.substring(ans[0], ans[1]+1);
                    }else{
                        if(sr.compareTo(temp)<0&&sr.length()<=temp.length()){
                            temp=sr;
                        }
                    }
                    //temp=str.substring(ans[0], ans[1]+1);
                    System.out.print(temp+" ");
                    System.out.println();
                }
             //   }
                int asci1=(int)str.charAt(j);
                if(asci1-48==1){
                    count--;
                }
                j++;
            
        }
    }
        
      //  System.out.println(ans[0]+" "+ans[1]);
   //System.out.println(max);
    // r//eturn temp;
    String rrr="";
        int t=0;
        while(temp.charAt(t)=='0') t++;
        while(t<temp.length()){
            rrr=rrr+temp.charAt(t);
            t++;
        }

   if(ans[0]==-1||ans[1]==-1) return "";
        String s=str.substring(ans[0],ans[1]+1);
       // return temp;
        //int t=0;
       // while(temp.charAt(t)=='0') t++;
       return rrr;
    }
    
    public static void main(String[] args) {
       String str1="11101011011011";
       String str2="10101101101111";
       if(str1.compareTo(str2)<0){
        System.out.println(str1);
    }else{
        System.out.println(str2);
    }

    }
}