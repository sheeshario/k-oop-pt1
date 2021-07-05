package inheritance;
import classlist.Pegawai;
import classlist.Date;

public class Sales extends Pegawai{
    
    public static final int KOMISI_BARANG = 10000;
    private int jumBarang;

    public Sales(){
        super();
    }

    public Sales(int nip, String nama, String jabatan, String noHP, Date tglLahir, double gaji, int jumBarang){
        setPegawai(nip, nama, jabatan, noHP, tglLahir, gaji, jumBarang);
    }

    public void setJumBarang(int jumBarang){
        this.jumBarang = jumBarang;
    }

    public int getJumBarang(){
        return this.jumBarang;
    }

    public void setPegawai(int nip, String nama, String jabatan, String noHP, Date tglLahir, double gajiPokok, int jumBarang){
        super.setPegawai(nip, nama, jabatan, noHP, tglLahir, gajiPokok);
        setJumBarang(jumBarang);
    }

    public double getGajiTotal(){
        return getGajiPokok() + (this.jumBarang * KOMISI_BARANG);
    }

    public String toString(){
        return getNip() +" - " +getNama() +" - " +getJabatan() +" - " +getGajiTotal();
    }
}
