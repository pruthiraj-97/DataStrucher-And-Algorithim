import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
class pair{
    node root;
    int lev;
    pair(node root,int lev){
        this.root=root;
        this.lev=lev;
    }
}
public class practice {
    public static int maxWidth(node root){
        int max=0;
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(root,1));
        while(q.size()>0){
            int first=0;
            int last=0;
            int n=q.size();
            pair p=q.peek();
            int min=p.lev;
            for(int i=1;i<=n;i++){
                pair pq=q.poll();
                node temp=pq.root;
                int lev=p.lev;
                if(i==1) first=lev;
                if(i==n) last=lev;
                if(temp.left!=null){
                    q.add(new pair(temp.left,2*(lev-min)+1));
                }
                if(temp.right!=null){
                    q.add(new pair(temp.right,2*(lev-min)+2));
                }
            }
            max=Math.max(max,last-first);
        }
        
        return max;
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
        System.out.println(maxWidth(root));
    }
}
