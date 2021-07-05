package classlist;
public class Pegawai {
    
    public static final String DEFAULT_STRING = "None";
    public static final int DEFAULT_INT = 0;

    private int nip;
    private String nama;
    private String jabatan;
    private String noHP;
    private Date tanggalLahir;
    private double gajiPokok;

    public Pegawai(){
        this(DEFAULT_INT, DEFAULT_STRING, DEFAULT_STRING, DEFAULT_STRING, null, DEFAULT_INT);
    }

    public Pegawai(int nip, String nama, String jabatan, String noHP){
        this(nip, nama, jabatan, noHP, null, DEFAULT_INT);
    }

    public Pegawai(int nip, String nama, String jabatan, String noHP, Date tglLahir, double gajiPokok){
        setPegawai(nip, nama, jabatan, noHP, tglLahir, gajiPokok);
    }

    public void setNip(int nip){
        if(nip >= 0){
            this.nip = nip;
        }   
    }

    public void setNama(String nama){
        if(nama.equals("")){
            System.out.println("Nama harus diisi.");
        } else {
            this.nama = nama;
        }
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public void setNoHP(String noHP){
        this.noHP = noHP;
    }

    public void setTglLahir(Date tglLahir){
        this.tanggalLahir = tglLahir;
    }

    public void setPegawai(int nip, String nama, String jabatan, String noHP, Date tglLahir, double gajiPokok){
        setNip(nip);
        setNama(nama);
        setJabatan(jabatan);
        setNoHP(noHP);
        setTglLahir(tglLahir);
        setGajiPokok(gajiPokok);
    }

    public void setGajiPokok(double gajiPokok){
        if (gajiPokok > 0){
            this.gajiPokok = gajiPokok;
        } else {
            this.gajiPokok = 0;
        }
    }

    public int getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getJabatan(){
        return this.jabatan;
    }

    public String getNoHP(){
        return this.noHP;
    }

    public Date getTglLahir(){
        return this.tanggalLahir;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public double getGajiTotal(){
        return getGajiPokok();
    }

    public String toString(){
        return this.nip + " - " +this.nama + " - " +this.gajiPokok;
    }

    public String pegawaiInfo(){
        return this.nip + " - " +this.nama +" - " +this.jabatan +" - " +this.noHP +" - " +this.tanggalLahir +" - " +this.gajiPokok;
    }

    // public Pegawai upJabatan(){

    //     System.out.println("\nMemproses...");

    //     switch (this.jabatan) {
    //         case "A":
    //             System.out.println("Jabatan " +this.nama +" sudah paling atas");
    //             break;
    //         case "B":
    //             this.jabatan = "A";
    //             System.out.println("Sukses...");
    //             break;
    //         case "C":
    //             this.jabatan = "B";
    //             System.out.println("Sukses...");
    //             break;
    //         default:
    //             System.out.println("error, jabatan tidak tersedia");
    //             break;
    //     }
    //     return this;
    // }
}