import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class morristraversalalgorithim {
    public static void morris(node root){
        node curr=root;
        while(curr!=null){
            if(curr.left!=null){
               node pred=curr.left;
               while(pred.right!=null&&pred.right!=curr){
                pred=pred.right;
               }
               if(pred.right==null){
                pred.right=curr;
                curr=curr.left;
               }else{
                System.out.print(curr.val+" ");
                pred.right=null;
                curr=curr.right;
               }
            }else{
                System.out.print(curr.val+" ");
                curr=curr.right;
            }
        }
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
        morris(root);
    }
    
}
