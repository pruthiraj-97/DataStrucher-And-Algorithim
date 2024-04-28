import java.util.*;

class Disjointset {
    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public Disjointset(int n) {
        for (int i = 0; i <=n; i++) {
            size.add(1);
            parent.add(i);
        }
    }

    public int findUpar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int upar = findUpar(parent.get(node));
        parent.set(node, upar);
        return upar;
    }

    public void unionBySize(int u, int v) {
        int upar_u = findUpar(u);
        int upar_v = findUpar(v);
        if (upar_u == upar_v)
            return;
        if (size.get(upar_u) > size.get(upar_v)) {
            parent.set(upar_v, upar_u);
            int s = size.get(upar_u) + size.get(upar_v);
            size.set(upar_u, s);
        } else {
            parent.set(upar_u, upar_v);
            int s = size.get(upar_u) + size.get(upar_v);
            size.set(upar_v, s);
        }
    }
}

public class DisjointsetMain {
    public static void main(String[] args) {
        Disjointset ds = new Disjointset(7);
        ds.unionBySize(0, 1);
        ds.unionBySize(0, 2);
        // ds.unionBySize(0, 2);
        if (ds.findUpar(1) == ds.findUpar(2)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        // Comparator<pair> com=new Comparator<pair>() {
        //     public int compare(pair p1,pair p2){
        //         return p1.dis-p2.dis;
        //     }
        // };
    }
}

