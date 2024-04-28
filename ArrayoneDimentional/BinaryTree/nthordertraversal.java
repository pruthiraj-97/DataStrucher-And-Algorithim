import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class nthordertraversal {
    public static void nthorder(node root,int n){
        if(root==null) return ;
        if(n==1){
            System.out.print(root.val+" ");
        }
        nthorder(root.left,n-1);
        nthorder(root.right,n-1);

    }
    public static void nthorder2(node root,int n){
        if(root==null) return ;
        if(n==1){
            System.out.print(root.val+" ");
        }
        nthorder(root.right,n-1);
         nthorder(root.left,n-1);

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
        nthorder(root,3);
        System.out.println();
        nthorder2(root,3);

    }
    
}
