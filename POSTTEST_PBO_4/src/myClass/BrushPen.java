package myClass;

public class BrushPen extends Barang {
    private boolean blend; // Retained property

    public BrushPen(int id, String nama, int stok, double harga, boolean blend) {
        super(id, nama, stok, harga);
        this.blend = blend;
    }

    // Constructor tanpa parameter blend (default blend = false)
    public BrushPen(int id, String nama, int stok, double harga) {
        this(id, nama, stok, harga, false); // Default blend false
    }

    public boolean isBlend() {
        return blend;
    }

    public void setBlend(boolean blend) {
        this.blend = blend;
    }

    @Override
    public String toString() {
        return super.toString() + " | Blend: " + blend;
    }
}