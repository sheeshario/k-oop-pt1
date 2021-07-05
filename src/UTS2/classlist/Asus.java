package UTS2.classlist;

public class Asus extends Laptop {

    private String Warna, Spesifikasi;
    private int Harga;

    public Asus(String type) {
        super("Asus", type);
    }

    public void setWarna(String warna) {
        this.Warna = warna;
    }

    public String getWarna() {
        return Warna;
    }

    public void setSpesifikasi(String spek) {
        this.Spesifikasi = spek;
    }

    public String getSpesifikasi() {
        return Spesifikasi;
    }

    public void setHarga(int harga) {
        this.Harga = harga;
    }

    public int getHarga() {
        return Harga;
    }

    public String toString() {
        return String.format("%-12s%-12s%-12s%-16s%-8s", getMerk(), getType(), getWarna(), getSpesifikasi(), getHarga());

    }
}
