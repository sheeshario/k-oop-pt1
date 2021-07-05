package UAS.classlist;

public class Pelanggan {
    
    private int nomor;
    private String nama;

    public Pelanggan(){
        this(0,"");
    }
    /**
     * @param nomor
     * @param nama
     */
    public Pelanggan(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }
    /**
     * @return the nomor
     */
    public int getNomor() {
        return nomor;
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }
    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * @param nomor the nomor to set
     */
    public void setNomer(int nomor) {
        if(nomor < 1 || nomor > 200){
            this.nomor = 159;
        } else {
            this.nomor = nomor;
        }
    }

    public String toString(){
        return "Bp/Ibu/Sdr " +nama +" -- No. Member : " +nomor;
    }
}
