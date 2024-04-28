import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class sumoftree {
    public static int sumtree(node root){
        if(root==null){
            return 0;
        }
        return root.val+sumtree(root.left)+sumtree(root.right);
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
        System.out.println(sumtree(root));
        
    }
    
}
