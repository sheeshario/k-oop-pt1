package classlist;

import interfaceClass.BerEmail;

public class Mahasiswa implements BerEmail{
    
    private String nim;
    private String nama;
    private String email;
    private Dosen pembimbing;
    private Date tanggalLahir;

    public Mahasiswa(String no, String nm, String email){
        nim = no;
        nama = nm;
        this.email = email;
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Dosen getPembimbing(){
        return pembimbing;
    }

    public void setPembimbing(Dosen pbb){
        pembimbing = pbb;
    }

    //tambahan
    public void setTglLahir(Date tglLahir){
        tanggalLahir = tglLahir;
    }

    public Date getTglLahir(){
        return tanggalLahir;
    }

    public String toString(){
        return "Nim: " +getNim() +"\nNama: " +this.nama +"\nEmail: " +getEmail() +"\nTanggal Lahir: " +this.tanggalLahir +"\n\nPembimbing: \n" +this.pembimbing;
    }
}