package myManajemen;

import java.util.ArrayList;
import myClass.Barang;

public final class lihatBarang {
    private final ArrayList<Barang> daftarBarang;

    public lihatBarang(ArrayList<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    public void lihatBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada barang yang terdaftar.");
            return;
        }
        System.out.println("\n=== Daftar Barang ===");
        for (Barang barang : daftarBarang) {
            System.out.println(barang);
        }
    }
}