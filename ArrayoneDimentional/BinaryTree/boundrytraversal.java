import java.util.*;

import javax.swing.tree.TreeNode;
import javax.xml.transform.Source;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
    }
}
public class boundrytraversal {
    public static void leftboundry(node root,ArrayList<Integer> arr){
		if(root==null) return;
		if(root.left==null&&root.right==null) return ;
		arr.add(root.data);
		if(root.left!=null);
		if(root.left!=null) leftboundry( root.left, arr);
		else leftboundry(root.right,arr);
	} 
	public static void bottom(node root,ArrayList<Integer> arr){
		if(root==null) return ;
		if(root.left==null&&root.right==null) arr.add(root.data);
		bottom(root.left,arr);
		bottom(root.right,arr);
	}
	public static void rightboundry(node root,ArrayList<Integer> arr){
		if(root==null) return ;
		if(root.left==null&&root.right==null) return ;
		if(root.right!=null);
		if(root.right!=null) rightboundry( root.right, arr);
		else rightboundry(root.left, arr);
		arr.add(root.data);
	}
     public static void  traverseBoundary(node root){
	    ArrayList<Integer> arr=new ArrayList<>();
		leftboundry(root,arr);
		bottom(root,arr);
		rightboundry(root.right,arr);
        System.out.println(arr);
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
        traverseBoundary(root);
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(4);
		int temp=arr.get(0);
		arr.remove(0);
		arr.add(9+temp);
		System.out.println(arr);

    }
    
}
