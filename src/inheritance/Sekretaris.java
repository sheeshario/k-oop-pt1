package inheritance;
import classlist.Pegawai;
import classlist.Date;

public class Sekretaris extends Pegawai{
    
    public Sekretaris(){
        super();
    }

    public Sekretaris(int nip, String nama, String jabatan, String noHP, Date tglLahir, int gajiPokok){
        super(nip, nama, jabatan, noHP, tglLahir, gajiPokok);
    }

    public double getGajiTotal(){
        return getGajiPokok();
    }

    public String toString(){
        return getNip() +" - " +getNama() +" - " +getJabatan() +" - " +getGajiTotal();
    }
}
