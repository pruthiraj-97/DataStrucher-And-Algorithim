import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class Binartreepath {
    // public static List<String> path(node root,List<String> ll){
    //     if(root==null) {
    //         ll.add("");
    //         return ll;
    //     }
    //     if(root.left==null&&root.right==null){
    //         ll.add("root.val");

    //     }

    // }
    public static void main(String[] args){
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
        String s="";
        char ch=(char)(97+root.val);
        System.out.println(ch);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        Queue<Node> q=new Array
    }
    
}
