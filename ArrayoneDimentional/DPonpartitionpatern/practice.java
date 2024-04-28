public class practice {
    public static int f(int num1,int num2){
        String s1=Integer.toString(num1);
        String s2=Integer.toString(num2);
        int count=0;
        int i=0;
        int j=0;
        while(i<s1.length()&&j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                count++;
                i++;
                j++;
            }else{
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[]={1,10,100};
        int arr2[]={1000};
        int max=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                max=Math.max(max,f(arr1[i],arr2[j]));
            }
        }
        String s="j";
        s.substring(0,s.length()-1);
        System.out.println(max);
    }
}
