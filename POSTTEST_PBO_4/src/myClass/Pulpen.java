package myClass;

public class Pulpen extends Barang {
    private boolean refillable; // Changed to boolean

    public Pulpen(int id, String nama, int stok, double harga, boolean refillable) {
        super(id, nama, stok, harga);
        this.refillable = refillable;
    }

    public boolean isRefillable() {
        return refillable;
    }

    public void setRefillable(boolean refillable) {
        this.refillable = refillable;
    }

    @Override
    public String toString() {
        return super.toString() + " | Refillable: " + refillable;
    }
}