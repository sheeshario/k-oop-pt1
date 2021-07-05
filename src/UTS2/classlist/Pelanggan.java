package UTS2.classlist;

public class Pelanggan implements BerEmail{

    private String nama;
    private String email;
    private int jumBeli;

    public Pelanggan(String nama, String email, int jumBeli) {
        setPelanggan(nama, email, jumBeli);
    }

    public void setNama(String nama){
        if (nama.equals("")) {
            System.out.println("Dilarang Mengosongkan Nama!");
        } else {
            this.nama = nama;
        }
    }

    public String getNama(){
        return nama;
    }

    public void setEmail(String email){
        if (email.equals("")) {
            System.out.println("Dilarang Mengosongkan Email!");
        } else {
            this.email = email;
        }
    }

    public String getEmail(){
        return this.email;
    }

    public void setJumBeli(int jumBeli){
        if (jumBeli < 0) {
            System.out.println("Jumlah beli tidak boleh kurang dari 0!");
        } else {
            this.jumBeli = jumBeli;
        }
    }
    
    public int getJumBeli(){
        return jumBeli;
    }

    public void setPelanggan(String nama, String email, int jumBeli){
        setNama(nama);
        setEmail(email);
        setJumBeli(jumBeli);
    }

    public String toString(){
        return String.format("%-16s%-20s%-14s", nama, email, jumBeli);
    }

}
