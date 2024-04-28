import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}

public class deletenodehaving1chind {
     public static  void delete(node root,int val){
        if(root==null) return ;
        if(root.left!=null&&root.left.val==val){
            node t=root.left;
            if(t.left==null&&t.right==null){
                root.left=null;
            }
            else if(t.left!=null){
                root.left=t.left;
            }else{
                root.left=t.right;
            }
        }
         if(root.right!=null&&root.right.val==val){
            node t=root.right;
            if(t.left==null&&t.right==null){
                root.right=null;
            }
            else if(t.left!=null){
                root.right=t.left;
            }else{
                root.right=t.right;
            }
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
        node b3=new node(9);
        b2.right=b3;
        b1.right=b2;
        delete(root,7);
        preorder(root);
    }
    
}
