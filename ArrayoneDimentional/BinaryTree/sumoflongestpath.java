import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class sumoflongestpath {
    static int max=0;
    static int maxsize=0;
    public static void helper(node root,int size,int currsum){
        if(root==null) return ;
        currsum=currsum+root.val;
        if(root.left==null&&root.right==null){
            if(size>=maxsize){
                max=currsum;
                maxsize=size;
            }
        }
        helper(root.left,size+1,currsum);
        helper(root.right,size+1,currsum);

    }
    public static void main(String[] args) {
        node root=new node(1);
        node a1=new node(2);
        root.right=a1;
        node a2=new node(8);
        a1.right=a2;
        node a3=new node(6);
        a2.left=a3;
        node a4=new node(3);
        a3.left=a4;
        node a5=new node(7);
        a3.right=a5;
        helper(root,1,0);
        System.out.print(max);
        
    //1 N 2 N 8 6 N 3 7
    //     4        
    //     / \       
    //    2   5      
    //   / \ / \     
    //  7  1 2  3    
    //    /
    //   6
    }
}
