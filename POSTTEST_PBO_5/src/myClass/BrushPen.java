package myClass;

public class BrushPen extends Barang {
    private boolean blend;

    public BrushPen(int id, String nama, int stok, double harga, boolean blend) {
        super(id, nama, stok, harga);
        this.blend = blend;
    }

    public void setBlend(boolean blend) {
        this.blend = blend;
    }

    @Override
    public String getDeskripsi() {
        return "BrushPen (blend: " + blend + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " | Blend: " + blend;
    }
}
