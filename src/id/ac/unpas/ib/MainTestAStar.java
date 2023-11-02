package id.ac.unpas.ib;

import id.ac.unpas.ib.astar.AStarSearch;
import id.ac.unpas.ib.astar.Node;

public class MainTestAStar {
    public static void main(String[] args) {
        // Membuat objek Node yang mewakili kota-kota
        Node cimahi = new Node("Cimahi", 7, 8);
        Node padalarang = new Node("Padalarang", 22, 7);
        Node gadobangkong = new Node("Gadobangkong", 12, 8);
        Node cikalong = new Node("Cikalong", 15, 13);
        Node purwakarta = new Node("Purwakarta", 6, 7);
        Node sawit = new Node("Sawit", 5, 2);
        Node puteran = new Node("Puteran", 6, 9);

        // Menambahkan tetangga-tetangga kota
        gadobangkong.addNeighbor(cimahi);
        gadobangkong.addNeighbor(padalarang);
        cikalong.addNeighbor(purwakarta);
        cikalong.addNeighbor(sawit);
        cikalong.addNeighbor(puteran);
        sawit.addNeighbor(puteran);
        sawit.addNeighbor(cikalong);
        puteran.addNeighbor(cikalong);

        // Membuat objek AStarSearch
        AStarSearch astar = new AStarSearch();

        // Menjalankan algoritma A* untuk mencari rute dari gadongbangong ke sawit
        astar.search(gadobangkong, sawit);
        astar.printPath(sawit);
    }
}
