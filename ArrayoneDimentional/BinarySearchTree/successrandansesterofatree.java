class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class successrandansesterofatree {
    static int sus=-1;
    static int pred=-1;
    static node temp=null;
    static boolean flag=false;
    public static void test(node root,int val){
        if(root==null){
            return ;
        }
        test(root.left,val);
        if(root.val<val){
            temp=root;
        }else if(root.val==val){
            flag=true;
            pred=temp.val;
        }else if(root.val>val&&flag==true){
            sus=root.val;
            flag=false;
        }
        test(root.right,val);
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
        test(root,8);
        System.out.println(pred+" "+sus);
    }
    
}
