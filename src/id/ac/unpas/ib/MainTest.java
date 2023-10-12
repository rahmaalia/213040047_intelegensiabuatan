package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

public class MainTest {
    public static void main(String[] args) {
        // Inisialisasi PC-PC (sebagai node) yang digunakan dalam simulasi.
        Node pcUtama = new Node("PC utama");
        Node pc1 = new Node("PC 1");
        Node pc2 = new Node("PC 2");

        // Menyambungkan PC Utama dengan PC 1 dan 2 (membentuk graph).
        pcUtama.addTetangga(pc1);
        pcUtama.addTetangga(pc2);

        // Mencoba metode Breadth First Search (BFS) untuk mencari jalur dari PC Utama ke PC 2.
        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(pcUtama, pc2);
        System.out.println();

        // Mencoba metode Depth Limited Search (DLS) dengan batas kedalaman 1 untuk mencari jalur dari PC Utama ke PC 2.
        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(1);
        dls.search(pcUtama, pc2);
        System.out.println();

        // Membuat objek NodeUCS yang berisi data waktu untuk mencapai setiap PC.
        NodeUCS pcUtamaUCS = new NodeUCS(pcUtama, 0);  // waktu tempuh dari PC Utama ke dirinya sendiri adalah 0.
        NodeUCS pc1UCS = new NodeUCS(pc1, 5); // Misalnya waktu tempuh dari PC Utama ke PC 1 adalah 5.
        NodeUCS pc2UCS = new NodeUCS(pc2, 10); // Misalnya waktu tempuh dari PC Utama ke PC 2 adalah 10.

        // Menghubungkan objek NodeUCS, sama seperti yang dilakukan dengan objek Node di atas.
        pcUtamaUCS.addTetangga(pc1UCS);
        pcUtamaUCS.addTetangga(pc2UCS);

        // Mencoba metode Uniform Cost Search (UCS) untuk mencari jalur dengan waktu tercepat dari PC Utama ke PC 2.
        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(pcUtamaUCS, pc2UCS);
        System.out.println(); 
        
    }
}
