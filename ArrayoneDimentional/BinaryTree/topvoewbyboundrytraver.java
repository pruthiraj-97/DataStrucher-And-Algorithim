import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class topvoewbyboundrytraver {
    public static void left(node root,ArrayList<Integer> arr){
        if(root==null) return ;
        if(root.left!=null){
            left(root.left,arr);
        }
            arr.add(root.val);
            return ;
    }
    public static void right(node root,ArrayList<Integer> arr){
         if(root==null) return ;
         arr.add(root.val);
         if(root.right!=null) right(root.right,arr);
          return ;
    }
    public static void main(String[] args) {
        node root=new node(10);
        node a1=new node(20);
        node b1=new node(30);
        root.left=a1;
        root.right=b1;
        node a3=new node(40);
        node a4=new node(60);
        a1.left=a3;
        a1.right=a4;
        node b3=new node(90);
        node b4=new node(100);
        b1.left=b3;
        b1.right=b4;
        node a5=new node(85);
        a3.right=a5;
        ArrayList<Integer> arr=new ArrayList<>();
        left(root,arr);
        right(root.right,arr);
        System.out.println(arr);

    }
    
}
