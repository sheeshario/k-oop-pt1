package abstractClass;

public class SalesConc extends PegawaiAbs {

    public static final int KOMISI_BARANG = 10000;
    private int jumBarang;

    public SalesConc(int nip, String nama, String email){
        super(nip, nama, email);
    }

    public SalesConc(int nip, String nama, String email, double gajiPokok, int jumBarang){
        super(nip, nama, email, gajiPokok);
        setJumBarang(jumBarang);
    }

    public void setJumBarang(int jumBarang){
        if(jumBarang >= 0){
            this.jumBarang = jumBarang;
        }
    }

    public int getJumBarang(){
        return this.jumBarang;
    }

    public void setSales(int nip, String nama, String email, double gajiPokok, int jumBarang){
        super.setPegawai(nip, nama, email, gajiPokok);
        setJumBarang(jumBarang);
    }
    
    public double getGajiTotal(){
        return getGajiPokok() + (this.jumBarang * KOMISI_BARANG);
    }

    public String toString(){
        return String.format("%s  :  %s  :  %-7s  :  %18s%-18s  :  %s\n", getNip(), getNama(),
        "Sales", getJumBarang(), "", getGajiTotal()) +"\n";
    }

}
