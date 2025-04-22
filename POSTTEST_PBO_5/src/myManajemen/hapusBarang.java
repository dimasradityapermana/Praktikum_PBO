package myManajemen;

import java.util.ArrayList;
import java.util.Scanner;
import myClass.Barang;

public class hapusBarang {
    private final ArrayList<Barang> daftarBarang;
    private final Scanner scanner;

    public hapusBarang(ArrayList<Barang> daftarBarang, Scanner scanner) {
        this.daftarBarang = daftarBarang;
        this.scanner = scanner;
    }

    public void hapusBarang() {
        System.out.print("Masukkan ID barang yang ingin dihapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Barang barang : daftarBarang) {
            if (barang.getId() == id) {
                daftarBarang.remove(barang);
                System.out.println("Barang berhasil dihapus!");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }
}