import java.util.*;
public class MinimumCoststringConvert {
     public static void main(String[] args) {
        int arr[][]=new int[26][26];
        char ori[] = {'a','b','c','c','e','d'};
        char chang[] = {'b','c','b','e','b','e'};
        int cost[] = {2,5,5,1,2,20};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=(int)(1e9);
                if(i==j) arr[i][j]=0;
            }
        }
        for(int i=0;i<ori.length;i++){
                int s=ori[i]-'a';
                int e=chang[i]-'a';
                arr[s][e]=cost[i];
        }
        //
        for(int k=0;k<arr.length;k++){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==(int)(1e9))  arr[i][j]=-1;
            }
        }
        //  for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        String src="abcd";
        String des="acbe";
        long ans=0;
        for(int i=0;i<src.length();i++){
            int s=src.charAt(i)-'a';
            int e=des.charAt(i)-'a';
           System.out.print(arr[s][e]+" ");
           ans+=arr[s][e];
        }
        System.out.println(ans);
     }
}
