class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class reverseofmorristraversal {
    public static void morris(node root){
        node curr=root;
        while(curr!=null){
            if(curr.right!=null){
                node pred=curr.right;
                while(pred.left!=null&&pred.left!=curr){
                    pred=pred.left;
                }
                if(pred.left==null){
                    pred.left=curr;
                    curr=curr.right;
                }else if(pred.left==curr){
                    System.out.print(curr.val+" ");
                    pred.left=null;
                    curr=curr.left;
                }
            }else{
                System.out.print(curr.val+" ");
                curr=curr.left;
            }
        }
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
        morris(root);
    }
    
}
