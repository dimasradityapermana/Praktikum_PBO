package myClass;

public class Pulpen extends Barang {
    private boolean refillable;

    public Pulpen(int id, String nama, int stok, double harga, boolean refillable) {
        super(id, nama, stok, harga);
        this.refillable = refillable;
    }

    public void setRefillable(boolean refillable) {
        this.refillable = refillable;
    }

    @Override
    public String getDeskripsi() {
        return "Pulpen (refillable: " + refillable + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " | Refillable: " + refillable;
    }
}
