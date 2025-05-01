package myManajemen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import myClass.Barang;
import myClass.BrushPen;
import myClass.Pulpen;

public class ubahBarang {
    private final ArrayList<Barang> daftarBarang;
    private final Scanner scanner;

    public ubahBarang(ArrayList<Barang> daftarBarang, Scanner scanner) {
        this.daftarBarang = daftarBarang;
        this.scanner = scanner;
    }

    public void ubahBarang() {
        try {
            System.out.print("Masukkan ID barang yang ingin diubah: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            for (Barang barang : daftarBarang) {
                if (barang.getId() == id) {
                    System.out.print("Masukkan nama baru: ");
                    String nama = scanner.nextLine();
                    if (nama.isEmpty()) {
                        throw new IllegalArgumentException("Nama barang tidak boleh kosong.");
                    }
                    barang.setNama(nama);

                    System.out.print("Masukkan stok baru: ");
                    int stok = scanner.nextInt();
                    if (stok < 0) {
                        throw new IllegalArgumentException("Stok barang tidak boleh negatif.");
                    }
                    barang.setStok(stok);

                    System.out.print("Masukkan harga baru: ");
                    double harga = scanner.nextDouble();
                    if (harga < 0) {
                        throw new IllegalArgumentException("Harga barang tidak boleh negatif.");
                    }
                    barang.setHarga(harga);
                    scanner.nextLine();

                    if (barang instanceof BrushPen) {
                        System.out.print("Masukkan jenis brushpen blend baru (true or false): ");
                        boolean blend = Boolean.parseBoolean(scanner.nextLine());
                        ((BrushPen) barang).setBlend(blend);
                    } else if (barang instanceof Pulpen) {
                        System.out.print("Masukkan jenis pulpen refillable baru (true or false): ");
                        boolean refillable = Boolean.parseBoolean(scanner.nextLine());
                        ((Pulpen) barang).setRefillable(refillable);
                    }

                    System.out.println("Barang berhasil diperbarui!");
                    return;
                }
            }
            System.out.println("Barang dengan ID tersebut tidak ditemukan.");
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan data dengan format yang benar.");
            scanner.nextLine(); // Clear invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}