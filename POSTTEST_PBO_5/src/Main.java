import java.util.ArrayList;
import java.util.Scanner;
import myClass.Barang;
import myClass.Supplier;

import myManajemen.tambahSupplier;
import myManajemen.lihatSupplier;
import myManajemen.tambahBarang;
import myManajemen.lihatBarang;
import myManajemen.ubahBarang;
import myManajemen.hapusBarang;

class App {
    private static final ArrayList<Barang> daftarBarang = new ArrayList<>();
    private static final ArrayList<Supplier> daftarSupplier = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final int idCounter = 1;
    private static final int supplierIdCounter = 1;

    private static final tambahSupplier supplierManager = new tambahSupplier(daftarSupplier, scanner, supplierIdCounter);
    private static final lihatSupplier supplierViewer = new lihatSupplier(daftarSupplier);
    private static final tambahBarang barangManager = new tambahBarang(daftarBarang, scanner, idCounter);
    private static final lihatBarang barangViewer = new lihatBarang(daftarBarang);
    private static final ubahBarang barangUpdater = new ubahBarang(daftarBarang, scanner);
    private static final hapusBarang barangDeleter = new hapusBarang(daftarBarang, scanner);

    public static final void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Penjualan & Stok Toko Stationery ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Ubah Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Tambah Supplier");
            System.out.println("6. Lihat Supplier");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> barangManager.tambahBarang();
                case 2 -> barangViewer.lihatBarang();
                case 3 -> barangUpdater.ubahBarang();
                case 4 -> barangDeleter.hapusBarang();
                case 5 -> supplierManager.tambahSupplier();
                case 6 -> supplierViewer.lihatSupplier();
                case 7 -> {
                    System.out.println("Program selesai. Terima kasih!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}