import java.util.*;
public class prog2 {
    public static int f(int arr[][],int time,int i,int dp[][]){
        if(i>=arr.length) return 0;
        if(time<dp[0].length){
        if(dp[i][time]!=-1) return dp[i][time];
        }
        int pick=Integer.MIN_VALUE;
        if(arr[i][0]>=time){
              pick=arr[i][1]+f(arr,time+1,i+1,dp);
        }
        int nottake=f(arr,time,i+1,dp);
        return dp[i][time]=Math.max(pick,nottake);
    }
    public static int count(int arr[][],int time,int i){
        if(i>=arr.length) return 0;
        int pick=Integer.MIN_VALUE;
        if(arr[i][0]>=time){
              pick=1+count(arr,time+1,i+1);
        }
        int nottake=count(arr,time,i+1);
        return Math.max(pick,nottake);
    }
    public static void main(String[] args) {
        Comparator<int[]> com=new Comparator<int[]>() {
            public int compare(int a[],int b[]){
                if(a[0]>b[0]) return 1;
                else if(a[0]<b[0]) return -1;
                else{
                    if(a[1]<b[1]) return 1;
                    else return -1;
                }
            }
        };
        int arr[][]={{2 ,100},{1 ,19},{2,27},{1 ,25},{1 ,15}};
        Arrays.sort(arr,com);
    // int time=1;
    // int profit=0;
    // int count=0;
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i][0]>=time){
    //         profit+=arr[i][1];
    //         time++;
    //         count++;
    //     }
    // }
    int x=arr.length-1;
    int max=arr[x][0];
    System.out.println(max+1);
    int dp1[][]=new int[5][max+1];
    int dp2[][]=new int[5][max+1];
    for(int i=0;i<dp1.length;i++){
        for(int j=0;j<dp1[0].length;j++){
            dp1[i][j]=-1;
            dp2[i][j]=-1;
        }
    }
     System.out.println(f(arr,1,0,dp1));
    // System.out.println(count(arr,1,0,dp2));
    // int ans[]=new int[2];
    // ans[0]=count;
    // ans[1]=profit;
    // System.out.println(ans[0]+" "+ans[1]);
    // 1 2 100 2 1 19 3 2 27 4 1 25 5 1 15
    }
}

 