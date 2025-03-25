package myClass;

public class Barang {
    // properti
    private final int id;
    private String nama;
    private int stok;
    private double harga;

    public Barang(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nama: " + nama + " | Stok: " + stok + " | Harga: Rp " + harga;
    }
}
