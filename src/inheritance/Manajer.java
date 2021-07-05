package inheritance;
import classlist.Pegawai;
import classlist.Date;

public class Manajer extends Pegawai{
    
    private double tunjangan;

    public Manajer(){
        super();
    }

    public Manajer(int nip, String nama, String jabatan, String noHP, Date tglLahir, int gaji, double tunjangan){
        setPegawai(nip, nama, jabatan, noHP, tglLahir, gaji, tunjangan);
    }

    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }

    public double getTunjangan(){
        return this.tunjangan;
    }

    public void setPegawai(int nip, String nama, String jabatan, String noHP, Date tglLahir, double gajiPokok, double tunjangan){
        super.setPegawai(nip, nama, jabatan, noHP, tglLahir, gajiPokok);
        setTunjangan(tunjangan);
    }

    public double getGajiTotal(){
        return getGajiPokok() + this.tunjangan;
    }

    public String toString(){
        return getNip() +" - " +getNama() +" - " +getJabatan() +" - " +getGajiTotal();
    }
}
