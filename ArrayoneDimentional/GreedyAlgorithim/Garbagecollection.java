import java.util.*;
public class Garbagecollection {
    public static int f(String str[],int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        int m=0;
        int g=0;
        int p=0;
        int amount=0;
        for(int i=0;i<str.length;i++){
            int cm=0,cg=0,cp=0;
            for(int j=0;j<str[i].length();j++){
                if(str[i].charAt(j)=='M') cm++;
               else if(str[i].charAt(j)=='G') cg++;
              else  if(str[i].charAt(j)=='P') cp++;
            }
            if(cm!=0){
                if(i!=0){
                    if(m!=0){
                        amount+=arr[i-1]-arr[m-1];
                        m=i;
                    }else{
                        amount+=arr[i-1];
                        m=i;
                    }
                }
               amount=amount+cm;
            }
            if(cg!=0){
                  if(i!=0){
                    if(g!=0){
                        amount+=arr[i-1]-arr[g-1];
                        g=i;
                    }else{
                        amount+=arr[i-1];
                        g=i;
                    }
                }
                amount=amount+cg;
            }    
            if(cp!=0){
                 if(i!=0){
                    if(p!=0){
                        amount+=arr[i-1]-arr[p-1];
                        p=i;
                    }else{
                        amount+=arr[i-1];
                        p=i;
                    }
                }
                amount=amount+cp;
            }
            System.out.println(p+" "+g+" "+m+" ");
        }
        System.out.println();
        return amount;
    }
    public static void main(String[] args) {
        String str[]={"PPMPGPGG","GP","PGGMMGMP","GM","PGMMMGMG"};
        int arr[]={3,4,2,2};
        System.out.println(f(str,arr));
    }
}
