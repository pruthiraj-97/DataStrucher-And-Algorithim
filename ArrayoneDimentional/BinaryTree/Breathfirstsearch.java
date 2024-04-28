import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class Breathfirstsearch {
    public static void bfs(node root){
        Queue<node> q=new ArrayDeque<>();
        if(root!=null){
         q.add(root);
        while(q.size()>0){
           if(q.peek().left!=null) q.add(q.peek().left);
           if(q.peek().right!=null) q.add(q.peek().right);
            System.out.print(q.peek().val+" ");
            q.poll();
        }
    }
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
        bfs(root);
    }
    
}
