import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class DFSpreorder {
    public static void preorder(node root){
        Stack<node> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            node temp=st.peek();
            System.out.print(temp.val+" ");
            if(temp.left!=null){
                st.push(temp.left);
                temp.left=null;
            }else{
                st.pop();
                if(temp.right!=null){
                    st.push(temp.right);
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
        preorder(root);
    }
}
