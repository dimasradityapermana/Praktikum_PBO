import java.util.ArrayList;
import java.util.Scanner;
import myClass.Barang;
import myClass.BrushPen;
import myClass.Pulpen;
import myClass.Supplier;
import myClass.BarangUmum;

class App {
    private static final ArrayList<Barang> daftarBarang = new ArrayList<>();
    private static final ArrayList<Supplier> daftarSupplier = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;
    private static int supplierIdCounter = 1;

    public static void main(String[] args) {
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
                case 1 -> tambahBarang();
                case 2 -> lihatBarang();
                case 3 -> ubahBarang();
                case 4 -> hapusBarang();
                case 5 -> tambahSupplier();
                case 6 -> lihatSupplier();
                case 7 -> {
                    System.out.println("Program selesai. Terima kasih!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    // create
    private static void tambahBarang() {
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
            default -> barang = new BarangUmum(idCounter++, nama, stok, harga); // FIXED
        }

        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan!");
    }


    // read
    private static void lihatBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada barang yang terdaftar.");
            return;
        }
        System.out.println("\n=== Daftar Barang ===");
        for (Barang barang : daftarBarang) {
            System.out.println(barang);
        }
    }

    // update
    private static void ubahBarang() {
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

                System.out.println("Barang berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }

    // delete
    private static void hapusBarang() {
        System.out.print("Masukkan ID barang yang ingin dihapus: ");
        int id = scanner.nextInt();

        for (Barang barang : daftarBarang) {
            if (barang.getId() == id) {
                daftarBarang.remove(barang);
                System.out.println("Barang berhasil dihapus!");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }

    private static void tambahSupplier(Supplier supplier) {
        daftarSupplier.add(supplier);
        System.out.println("Supplier berhasil ditambahkan!");
    }

    private static void tambahSupplier() {
        System.out.print("Masukkan nama supplier: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat supplier: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan telepon supplier: ");
        String telepon = scanner.nextLine();

        Supplier supplier = new Supplier(supplierIdCounter++, nama, alamat, telepon);
        tambahSupplier(supplier);
    }

    private static void lihatSupplier() {
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