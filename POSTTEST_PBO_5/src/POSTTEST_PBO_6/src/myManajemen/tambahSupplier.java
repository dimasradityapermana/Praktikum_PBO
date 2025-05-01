package myManajemen;

import java.util.ArrayList;
import java.util.Scanner;
import myClass.Supplier;

public class tambahSupplier {
    private final ArrayList<Supplier> daftarSupplier;
    private final Scanner scanner;
    private int supplierIdCounter;

    public tambahSupplier(ArrayList<Supplier> daftarSupplier, Scanner scanner, int supplierIdCounter) {
        this.daftarSupplier = daftarSupplier;
        this.scanner = scanner;
        this.supplierIdCounter = supplierIdCounter;
    }

    public void tambahSupplier() {
        try {
            System.out.print("Masukkan nama supplier: ");
            String nama = scanner.nextLine();
            if (nama.isEmpty()) {
                throw new IllegalArgumentException("Nama supplier tidak boleh kosong.");
            }

            System.out.print("Masukkan alamat supplier: ");
            String alamat = scanner.nextLine();
            if (alamat.isEmpty()) {
                throw new IllegalArgumentException("Alamat supplier tidak boleh kosong.");
            }

            System.out.print("Masukkan telepon supplier: ");
            String telepon = scanner.nextLine();
            if (telepon.isEmpty()) {
                throw new IllegalArgumentException("Telepon supplier tidak boleh kosong.");
            }
            if (!telepon.matches("\\d+")) {
                throw new IllegalArgumentException("Telepon supplier harus berupa angka.");
            }

            Supplier supplier = new Supplier(supplierIdCounter++, nama, alamat, telepon);
            daftarSupplier.add(supplier);
            System.out.println("Supplier berhasil ditambahkan!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}