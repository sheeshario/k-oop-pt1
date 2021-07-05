package UAS.classlist;

public class SparePart implements Tagihan{
    
    private String kodePart;
    private double harga;
    private double jumlah;
    /**
     * @param kodePart
     * @param harga
     * @param jumlah
     */
    public SparePart(String kodePart, double harga, double jumlah) {
        this.kodePart = kodePart;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    /**
     * @return the kodePart
     */
    public String getKodePart() {
        return kodePart;
    }
    /**
     * @return the jumlah
     */
    public double getJumlah() {
        return jumlah;
    }
    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }
    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
    /**
     * @param kodePart the kodePart to set
     */
    public void setKodePart(String kodePart) {
        this.kodePart = kodePart;
    }
    @Override
    public double getTagihan() {
        return harga * jumlah;
    }

    public String toString(){
        String temp = "";
        temp = temp + String.format("%-16sRp.%-12s*%-12s buah %-15s Rp.%-4s\n",kodePart, harga, jumlah, "=", getTagihan());
        return temp;
    }

}
