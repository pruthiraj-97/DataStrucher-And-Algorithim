import java.util.*;
public class bottomviewoftree {
     public static int leftorder(node root){
        if(root==null) return 0;
        return 1+leftorder(root.left);
    }
    public static int rightorder(node root){
        if(root==null) return 0;
        return 1+leftorder(root.right);
    }
    public static void bottom(node root,int level,Map<Integer,Integer> mp){
          if(root==null) return ;
          if(mp.containsKey(level)){
            mp.remove(level);
            mp.put(level, root.val);
          }else{
             mp.put(level, root.val);
          }
          bottom(root.right,level+1,mp);
          bottom(root.left,level-1,mp);
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
        Map<Integer,Integer> mp=new HashMap<>();
        bottom(root,0,mp);
        System.out.println(mp);
        int left=leftorder(root);
        int right=rightorder(root.right);
        for(int i=1-left;i<=right;i++){
            System.out.println(mp.get(i));
        }
    }
    
}
