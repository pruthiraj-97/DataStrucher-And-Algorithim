import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class medianofBST {
    static int x=0;
    static int y=0;
    public static void helper(node root){
          if(root==null) return ;
          helper(root.left);
          x++;
          helper(root.right);
    }
    public static void median(node root,float arr[]){
         if(root==null) return ;
         median(root.left,arr);
         if(x%2!=0){
             if(y==x/2) arr[0]=root.val;
         }else{
             if(y==x/2) {
                arr[0]=root.val;
                System.out.println(root.val);
             }
             if(y==x/2-1) {
                arr[1]=root.val;
                System.out.println(root.val);
             }
         }
         y++;
         median(root.right,arr);
    }
    public static void main(String[] args) {
        node root=new node(6);
        node a1=new node(4);
        node b1=new node(7);
        root.left=a1;
        root.right=b1;
        node a3=new node(1);
        node a4=new node(5);
        a1.left=a3;
        a1.right=a4;
        node b2=new node(8);
        b1.right=b2;
        helper(root);
        System.out.println(x);
         float arr[]=new float[2];
        y++;
        median(root,arr);
        System.out.println(arr[0]+" "+arr[1]);
        if(x%2!=0){
            System.out.println(arr[0]);
        }
        float x=arr[0];
        float y=arr[1];
        float z=(x+y)/2;
        System.out.println(z);

    }
    
}
