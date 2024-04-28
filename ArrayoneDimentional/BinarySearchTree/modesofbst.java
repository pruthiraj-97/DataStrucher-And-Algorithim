import java.util.*;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}

public class modesofbst {
     public static void mode(node root,TreeMap<Integer,Integer> mp){
        if(root==null) return ;
         mode(root.left,mp);
         if(mp.containsKey(root.val)){
             mp.put(root.val,mp.get(root.val)+1);
         }else{
             mp.put(root.val,1);
         }
         mode( root.right,mp);
    }
     public static void main(String[] args) {
        node root=new node(4);
        node a1=new node(2);
        node a2=new node(5);
        root.right=a2;
        root.left=a1;
        node a3=new node(2);
        node a4=new node(3);
        a1.left=a3;
        a1.right=a4;
        node b1=new node(5);
        node b2=new node(5);
        b1.right=b2;
        a2.right=b1;
         TreeMap<Integer,Integer> mp=new TreeMap<>();
        mode(root,mp);
        ArrayList<Integer> arr=new ArrayList<>();
        for(var v:mp.entrySet()){
            if(arr.size()==0){
                arr.add(v.getValue());
            }else if(v.getValue()>arr.get(arr.size()-1)){
                arr.clear();
                arr.add(v.getKey());
            }else if(v.getValue()==arr.get(arr.size()-1)){
                arr.add(v.getKey());
            }
        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size()-1;i++){
            ans[i]=arr.get(i);
        }
        System.out.println(arr.toString());
     }
    
}
