import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class verticallevelordertraversal {
     public static int leftorder(node root){
        if(root==null) return 0;
        return 1+leftorder(root.left);
    }
    public static int rightorder(node root){
        if(root==null) return 0;
        return 1+leftorder(root.right);
    }
    public static void vertialorder(node root,int giorder,int currorder){
        if(root==null) return;
        if(giorder==currorder&&root.left==null&&root.right==null){
          System.out.print(root.val+" ");
        }
        vertialorder(root.left,giorder,currorder-1);
        vertialorder(root.right,giorder,currorder+1);
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
        int left=leftorder(root);
        int right=rightorder(root.right);
        for(int i=1-left;i<=right;i++){
             vertialorder(root,i,0);
             System.out.println();
        }

    }
    
}
