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

    public void hapusBarang(int id) {
        for (Barang barang : daftarBarang) {
            if (barang.getId() == id) {
                daftarBarang.remove(barang);
                System.out.println("Barang dengan ID " + id + " berhasil dihapus!");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }

    public void hapusBarang(String nama) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equalsIgnoreCase(nama)) {
                daftarBarang.remove(barang);
                System.out.println("Barang dengan nama \"" + nama + "\" berhasil dihapus!");
                return;
            }
        }
        System.out.println("Barang dengan nama tersebut tidak ditemukan.");
    }

    public void hapusBarang() {
        System.out.println("Pilih metode penghapusan barang:");
        System.out.println("1. Hapus berdasarkan ID");
        System.out.println("2. Hapus berdasarkan Nama");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan ID barang yang ingin dihapus: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                hapusBarang(id);
            }
            case 2 -> {
                System.out.print("Masukkan nama barang yang ingin dihapus: ");
                String nama = scanner.nextLine();
                hapusBarang(nama);
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }
}