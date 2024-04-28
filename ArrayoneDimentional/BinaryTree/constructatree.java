import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class constructatree {
    public static void show(node root){
        Queue<node> q=new ArrayDeque<>();
        if(root!=null){
            q.add(root);
            while(q.size()>0){
                node temp=q.poll();
                if(temp.left!=null){
                  q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                System.out.print(temp.val+" ");
            }
        }
    }
    public static void main(String[] args) {
        String[] str={"1","2","3","4","5","","6","","7","","","8","","","","9",""};
        Queue<node> q=new ArrayDeque<>();
          if(!str[0].equals("null")){
            node head=new node(Integer.parseInt(str[0]));
            q.add(head);
            head.left=null;
            head.right=null;
        for(int i=1;i<str.length-1;i=i+2){
            node root=q.poll();
           if(str[i].equals("")){
            root.left=null;
           }else{
            node l=new node(Integer.parseInt(str[i]));
                root.left=l;
                q.add(l);
           }
           if(str[i+1].equals("")){
            root.right=null;
           }else{
            node r=new node(Integer.parseInt(str[i+1]));
            root.right=r;
            q.add(r);
           }
        }
        show(head);
    }
    }
}
