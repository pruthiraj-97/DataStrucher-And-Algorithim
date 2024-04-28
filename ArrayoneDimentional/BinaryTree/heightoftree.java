import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class heightoftree {
    static node base;
    public static int height(node root){
        if(root==null||root.left==null&&root.right==null){
              return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public static void search(node root,int t){
        if(root==null) return;
        if(root.val==t){
            base=root;
            return ;
        }
        search(root.left,t);
        search(root.right,t);
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
        node b3=new node(7);
        b1.right=b2;
        b2.right=b3;
        base=null;
        search(root,5);
        System.out.println(base.val);

       
    }
    
}
