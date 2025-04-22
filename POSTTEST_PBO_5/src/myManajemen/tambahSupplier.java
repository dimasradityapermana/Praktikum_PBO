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
        System.out.print("Masukkan nama supplier: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat supplier: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan telepon supplier: ");
        String telepon = scanner.nextLine();

        Supplier supplier = new Supplier(supplierIdCounter++, nama, alamat, telepon);
        daftarSupplier.add(supplier);
        System.out.println("Supplier berhasil ditambahkan!");
    }
}