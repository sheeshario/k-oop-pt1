package classlist;

public class Dosen {
    
    private String nip;
    private String nama;
    private String email;
    private Date tanggalLahir;

    public Dosen(String no, String nm){
        nip = no;
        nama = nm;
    }

    public String getNip(){
        return nip;
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

    //tambahan
    public Date getTglLahir(){
        return this.tanggalLahir;
    }

    public void setTglLahir(Date tglLahir){
        tanggalLahir = tglLahir;
    }

    public String toString(){
        return "Nip: " +this.nip +"\nNama: " +this.nama +"\nEmail: " +this.email +"\nTanggal Lahir: " +this.tanggalLahir;
    }

}
