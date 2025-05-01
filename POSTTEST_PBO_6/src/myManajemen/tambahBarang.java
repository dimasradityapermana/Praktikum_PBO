package myManajemen;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
        try {
            System.out.println("Pilih jenis barang:");
            System.out.println("1. Barang Umum");
            System.out.println("2. Brush Pen");
            System.out.println("3. Pulpen");
            System.out.print("Pilihan: ");
            int jenis = scanner.nextInt();
            scanner.nextLine();

            if (jenis < 1 || jenis > 3) {
                throw new IllegalArgumentException("Pilihan jenis barang tidak valid.");
            }

            System.out.print("Masukkan nama barang: ");
            String nama = scanner.nextLine();
            if (nama.isEmpty()) {
                throw new IllegalArgumentException("Nama barang tidak boleh kosong.");
            }

            System.out.print("Masukkan stok barang: ");
            int stok = scanner.nextInt();
            if (stok < 0) {
                throw new IllegalArgumentException("Stok barang tidak boleh negatif.");
            }

            System.out.print("Masukkan harga barang: ");
            double harga = scanner.nextDouble();
            if (harga < 0) {
                throw new IllegalArgumentException("Harga barang tidak boleh negatif.");
            }
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
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan data dengan format yang benar.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}