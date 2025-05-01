package myClass;

public abstract class Barang implements Printable {
    private int id;
    private String nama;
    private int stok;
    private double harga;

    private static int totalBarang = 0;

    public Barang(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        setStok(stok);
        setHarga(harga);
        this.nama = nama;
        totalBarang++;
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setStok(int stok) {
        try {
            if (stok < 0) {
                throw new IllegalArgumentException("Stok tidak boleh negatif.");
            }
            this.stok = stok;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setHarga(double harga) {
        try {
            if (harga < 0) {
                throw new IllegalArgumentException("Harga tidak boleh negatif.");
            }
            this.harga = harga;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getTotalBarang() {
        return totalBarang;
    }

    public abstract String getDeskripsi();

    @Override
    public String toString() {
        return "ID: " + id + " | Nama: " + nama + " | Stok: " + stok + " | Harga: " + harga;
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }
}
