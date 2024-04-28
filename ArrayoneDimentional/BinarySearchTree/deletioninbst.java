import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class deletioninbst {
    public static  void delete(node root,int val){
        if(root==null) return ;
        if(root.left!=null&&root.left.val==val){
            root.left=null;
        }
        if(root.right!=null&&root.right.val==val){
            root.right=null;
        }
        if(root.val>val){
            delete(root.left,val);
        }else{
            delete(root.right,val);
        }
    }
    public static void preorder(node root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
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
        delete(root,8);
        preorder(root);
    }
    
}
