package myManajemen;

import java.util.ArrayList;
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
        System.out.print("Masukkan ID barang yang ingin diubah: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Barang barang : daftarBarang) {
            if (barang.getId() == id) {
                System.out.print("Masukkan nama baru: ");
                barang.setNama(scanner.nextLine());
                System.out.print("Masukkan stok baru: ");
                barang.setStok(scanner.nextInt());
                System.out.print("Masukkan harga baru: ");
                barang.setHarga(scanner.nextDouble());
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
    }
}