package myManajemen;

import java.util.ArrayList;
import myClass.Supplier;

public class lihatSupplier {
    private final ArrayList<Supplier> daftarSupplier;

    public lihatSupplier(ArrayList<Supplier> daftarSupplier) {
        this.daftarSupplier = daftarSupplier;
    }

    public void lihatSupplier() {
        if (daftarSupplier.isEmpty()) {
            System.out.println("Belum ada supplier yang terdaftar.");
            return;
        }
        System.out.println("\n=== Daftar Supplier ===");
        for (Supplier supplier : daftarSupplier) {
            System.out.println(supplier);
        }
    }
}