import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class inordertraversal {
     public static void traverse(node root,LinkedList<Integer> lt){
           if(root==null||root==null){
            return ;
           }
            traverse(root.left,lt);
            lt.add(root.val);
            traverse(root.right,lt);
          
    }

    public static LinkedList<Integer> preorder(node root){
        LinkedList<Integer> l1=new LinkedList<>();
        traverse(root,l1);
        
        return l1;
    }
    public static void main(String[] args) {
         node root=new node(1);
        node a1=new node(2);
        node a2=new node(3);
        root.left=a1;
        root.right=a2;
        node a3=new node(4);
        node a4=new node(5);
        a1.left=a3;
        a1.right=a4;
        node a6=new node(6);
        node a7=new node(7);
        a2.left=a6;
        a2.right=a7;
        LinkedList<Integer> lt=preorder(root);
        System.out.println(lt);

        
    }
    
}
