package abstractClass;

import interfaceClass.BerGaji;
import interfaceClass.BerEmail;

abstract public class PegawaiAbs implements BerGaji, BerEmail{
    
    private int nip;
    private String nama;
    private double gajiPokok;
    private String email;

    public PegawaiAbs(int nip, String nama, String email){
        this(nip, nama, email, 0);
    }

    public PegawaiAbs(int nip, String nama, String email, double gajiPokok){
        setPegawai(nip, nama, email, gajiPokok);
    }

    public void setNip(int nip){
        if(nip >= 0){
            this.nip = nip;
        }   
    }

    public int getNip(){
        return this.nip;
    }

    public void setNama(String nama){
        if(nama.equals("")){
            this.nama = "Unknown";
        } else {
            this.nama = nama;
        }
    }

    public String getNama(){
        return this.nama;
    }

    public void setGajiPokok(double gajiPokok){
        if (gajiPokok > 0){
            this.gajiPokok = gajiPokok;
        } else {
            this.gajiPokok = 0;
        }
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setPegawai(int nip, String nama, String email, double gajiPokok){
        setNip(nip);
        setNama(nama);
        setEmail(email);
        setGajiPokok(gajiPokok);
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    abstract public double getGajiTotal();
    abstract public String toString();
}
