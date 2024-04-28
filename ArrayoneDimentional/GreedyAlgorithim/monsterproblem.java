import java.util.*;
public class monsterproblem {
    public static void main(String[] args) {
        int dist[]={1,3,4};
        int speed[]={1,1,1};
        float arr[]=new float[dist.length];
        for(int i=0;i<dist.length;i++){
            arr[i]=(float)dist[i]/speed[i];
        }
        Arrays.sort(arr);
        int cout=1;
        float curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr+=arr[i]-arr[i-1]-1;
            if(arr[i]-curr<1) break;
            cout++;
        }
        System.out.println(cout);
    }
}
