package myClass;

public class BarangUmum extends Barang {
    public BarangUmum(int id, String nama, int stok, double harga) {
        super(id, nama, stok, harga);
    }

    @Override
    public String getDeskripsi() {
        return "Barang Umum (tanpa atribut khusus)";
    }
}
