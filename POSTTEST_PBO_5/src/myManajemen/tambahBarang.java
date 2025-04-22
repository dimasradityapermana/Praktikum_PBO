package myManajemen;

import java.util.ArrayList;
import java.util.Scanner;
import myClass.Barang;
import myClass.BrushPen;
import myClass.Pulpen;
import myClass.BarangUmum;

public class tambahBarang {
    private final ArrayList<Barang> daftarBarang;
    private final Scanner scanner;
    private int idCounter;

    public tambahBarang(ArrayList<Barang> daftarBarang, Scanner scanner, int idCounter) {
        this.daftarBarang = daftarBarang;
        this.scanner = scanner;
        this.idCounter = idCounter;
    }

    public void tambahBarang() {
        System.out.println("Pilih jenis barang:");
        System.out.println("1. Barang Umum");
        System.out.println("2. BrushPen");
        System.out.println("3. Pulpen");
        System.out.print("Pilihan: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan stok barang: ");
        int stok = scanner.nextInt();
        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        Barang barang;
        switch (jenis) {
            case 2 -> {
                System.out.print("Masukkan jenis brushpen blend (true or false): ");
                boolean blend = Boolean.parseBoolean(scanner.nextLine());
                barang = new BrushPen(idCounter++, nama, stok, harga, blend);
            }
            case 3 -> {
                System.out.print("Masukkan jenis pulpen refillable (true or false): ");
                boolean refillable = Boolean.parseBoolean(scanner.nextLine());
                barang = new Pulpen(idCounter++, nama, stok, harga, refillable);
            }
            default -> barang = new BarangUmum(idCounter++, nama, stok, harga);
        }

        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan!");
    }
}