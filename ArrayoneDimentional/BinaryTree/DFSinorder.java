import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class DFSinorder {
    public static void inorder(node root){
        Stack<node> st=new Stack<>();
      
            st.push(root);
            while(st.size()>0){
                node temp=st.peek();
                if(st.peek().left!=null){
                    st.push(st.peek().left);
                    temp.left=null;
                }else{
                    node t=st.pop();
                    System.out.print(t.val+" ");
                    if(t.right!=null){
                        st.push(t.right);
                    }
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
        //inorder(root);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.remove(arr.size()-1);
        System.out.println(arr);
    }
    
}
