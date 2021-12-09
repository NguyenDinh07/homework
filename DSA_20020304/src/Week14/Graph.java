package Week14;

import java.util.ArrayList;

public class Graph {
    private final int V;
    private ArrayList<ArrayList<Integer>> adj;

    public Graph(int v) {
        V = v;
        adj =  new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.set(i,new ArrayList<>());
        }
    }

    //them canh.
    public void addEdge(int v, int w){ //cho trc 2 ver
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    //xoa canh.
    public void delEdge(int v, int w) {
        adj.get(v).remove(w);
        adj.get(w).remove(v);
    }

    //them dinh?.
    public void addVer(int v) {
        for(int i = 0; i < V; i++) {
            if (!adj.get(i).equals(v)) {
                adj.set(v, new ArrayList());
            }
        }
    }

    //xoa dinh?.
    public void delVer(int v) {
        for(int i = 0; i < V; i++) {
            if(adj.get(i).equals(v)) {
                adj.remove(adj.get(v));
            }
        }
        for(int i = 0; i < V; i++) {
            for(int j : adj.get(i)) {
                if(j == v ) {
                    adj.get(i).remove(j);
                }
            }
        }
    }

    //co lien thong voi nhau ko
    public boolean isConnected(int v, int w) {
        for(int i = 0 ; i < adj.get(v).size(); i++) {
            if (adj.get(v).get(i) != w) {
                return false;
            }
        }
        return true;
    }

    //tim cac dinh ke cua 1 dinh
    //idea : tim danh sach v2 cua dinh v cho trc roi tra ve
    public void getADJ(int v) {
        for(int i = 0; i < adj.get(v).size(); i++) {
            System.out.println(adj.get(v).get(i));
        }
    }
}
