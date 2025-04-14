package myClass;

public class Supplier {
    private final int id;
    private final String nama;
    private final String alamat;
    private final String telepon;

    public Supplier(int id, String nama, String alamat, String telepon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nama: " + nama + " | Alamat: " + alamat + " | Telepon: " + telepon;
    }
}