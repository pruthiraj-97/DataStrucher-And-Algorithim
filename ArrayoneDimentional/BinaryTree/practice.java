import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class practice {
    public static void parent(node root,Map<node,node> mp) {
            if(root==null||root.left==null&&root.right==null){
                return ;
            }
            if(root.left!=null) mp.put(root.left,root);
            if(root.right!=null) mp.put(root.right,root);
            parent(root.left,mp);
            parent(root.right,mp);
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
        Map<node,node> mp=new HashMap<>();
        parent(root,mp);
        for(var v:mp.entrySet()){
            System.out.println(v.getKey().val+" "+v.getValue().val);
        }
        Deque<Integer> dq=new ArrayDeque<>();
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> an=a;
        an.add(4);
        System.out.println(an);

      }
}
