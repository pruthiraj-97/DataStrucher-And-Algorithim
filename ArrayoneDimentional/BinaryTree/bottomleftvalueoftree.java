import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class bottomleftvalueoftree {
    public static int height(node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void bottom(node root,int n){
        if(root==null) return ;
        if(n==1){
            System.out.print(root.val+" ");
            return ;
        }
        bottom(root.left,n-1);
        bottom(root.right,n-1);
    }
    public static void main(String[] args) {
        node root=new node(1);
        node a1=new node(2);
        node b1=new node(3);
        root.left=a1;
        root.right=b1;
        node a3=new node(4);
        node a4=new node(5);
        a1.left=a3;
        a1.right=a4;
        node b2=new node(6);
        b1.right=b2;
        int height=height(root);
        System.out.println(height);
        bottom(root,height);
    }
    
}
