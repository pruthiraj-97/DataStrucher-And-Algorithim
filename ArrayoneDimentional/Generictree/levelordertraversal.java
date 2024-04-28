import java.util.*;
class node{
    int val; 
  List<node> child;
  node(int val){
    this.val=val;
    child=new ArrayList<>();
  }

}
public class levelordertraversal {
    public static void helper(node root,ArrayList<ArrayList<Integer>> ans){
        Queue<node> q=new ArrayDeque<>();
        q.add(root);
        boolean flag=true;
        while(q.size()>0){
            int n=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            while(n>0){
                node temp=q.poll();
                for(int i=0;i<temp.child.size();i++){
                    q.add(temp.child.get(i));
                }
                arr.add(temp.val);
                n--;
            }
            if(flag==true){
                 ans.add(arr);

            }else{
                //reverse(arr);
                Collections.reverse(arr);
                ans.add(arr);
            }
            flag=!flag;
        }
    }
    public static void levelorder(node root){
        Queue<node> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0){
            node temp=q.poll();
            for(int i=0;i<temp.child.size();i++){
                q.add(temp.child.get(i));
            }
            System.out.print(temp.val+" ");
        }
    }
   public static void main(String args[]){
         node root=new node(10);
         root.child.add(new node(3));
         root.child.add(new node(4));
         root.child.add(new node(5));
         root.child.get(0).child.add(new node(11));
         root.child.get(0).child.add(new node(12));
         root.child.get(1).child.add(new node(13));
         levelorder(root);
         System.out.println();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        helper(root,arr);
        System.out.println(arr);

   }
}
