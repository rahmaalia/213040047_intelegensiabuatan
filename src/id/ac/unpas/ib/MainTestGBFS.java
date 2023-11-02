package id.ac.unpas.ib;

import id.ac.unpas.ib.greedybfs.GreedyBestFirstSearch;
import id.ac.unpas.ib.greedybfs.Kota;

public class MainTestGBFS {
    public static void main(String[] args) {
        Kota cimahi = new Kota("cimahi", 6, 7);
        Kota padalarang = new Kota("padalarang", 2, 6);
        Kota gadobangkong = new Kota("gadobangkong", 9, 5);
        Kota cikalong = new Kota("cikalong", 12, 10);
        Kota purwakarta = new Kota("purwakarta", 5, 4);
        Kota sawit = new Kota("sawit", 6, 3);
        Kota puteran = new Kota("puteran", 5, 8);

        cimahi.addTetangga(padalarang);
        cimahi.addTetangga(sawit);
        padalarang.addTetangga(cimahi);
        padalarang.addTetangga(sawit);
        padalarang.addTetangga(purwakarta);
        gadobangkong.addTetangga(purwakarta);
        gadobangkong.addTetangga(sawit);
        cikalong.addTetangga(puteran);

        GreedyBestFirstSearch gbfs = new GreedyBestFirstSearch();
        gbfs.search(cimahi, cikalong);
        gbfs.printPath();
    }
}
