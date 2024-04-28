import java.util.*;
class DisjointSet{
    List<Integer> size=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<n;i++){
            size.add(1);
            parent.add(i);
        }
    }
    public int findUpar(int node){
        if(node==parent.get(node)){
            return node;
        }
        int upar=findUpar(parent.get(node));
        parent.set(node,upar);
        return upar;
    }

    public void unionBySize(int u,int v){
        int upar_u=findUpar(u);
        int upar_v=findUpar(v);
        if(upar_u==upar_v) return ;
        if(size.get(upar_u)>size.get(upar_v)){
            parent.set(upar_v,upar_u);
            int s=size.get(upar_u)+size.get(upar_v);
            size.set(upar_u,s);
        }else{
            parent.set(upar_u,upar_v);
            int s=size.get(upar_u)+size.get(upar_v);
            size.set(upar_v,s);
        }
    }
}
public class disjointset {
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);
        // if (ds.findUpar(3) == ds.findUpar(7)) {
        //     System.out.println("Same");
        // } else
        //     System.out.println("Not Same");
    }
}
