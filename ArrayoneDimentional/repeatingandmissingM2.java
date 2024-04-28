import java.util.*;
public class repeatingandmissingM2 {
    public static void main(String[] args) {
        int arr[]={4,3,1,2,1,6};
        int n=6;
        int sumTilln=n*(n+1)/2;
        int squareTilln=n*(n+1)*(2*n+1)/6;
        int sumarr=0;
        int squarearr=0;
        for(int i=0;i<arr.length;i++){
            sumarr=sumarr+arr[i];
            squarearr=squarearr+arr[i]*arr[i];
        }
        int diff=sumarr-sumTilln;
        int square=squarearr-squareTilln;
        int sum=square/diff;
        int repeating=(sum+diff)/2;
        int missing=sum-repeating;
        System.out.print(repeating+" "+missing);

        
    }
}
