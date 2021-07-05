package abstractClass;

public class ManajerConc extends PegawaiAbs{
    
    private double tunjangan;

    public ManajerConc(int nip, String nama, String email){
        super(nip, nama, email);
    }

    public ManajerConc(int nip, String nama, String email, double gajiPokok, double tunjangan){
        super(nip, nama, email, gajiPokok);
        setTunjangan(tunjangan);
    }

    public void setTunjangan(double tunjangan){
        if (tunjangan > 0){
            this.tunjangan = tunjangan;
        } else {
            this.tunjangan = 0;
        }
    }

    public double getTunjangan(){
        return this.tunjangan;
    }

    public void setManajer(int nip, String nama, String email, double gajiPokok, double tunjangan){
        super.setPegawai(nip, nama, email, gajiPokok);
        setTunjangan(tunjangan);
    }

    public double getGajiTotal(){
        return getGajiPokok() + this.tunjangan;
    }

    public String toString(){
        return String.format("%s  :  %s  :  %-7s  :  %18s%-18s  :  %s\n", getNip(), getNama(),
        "Manajer", getTunjangan(), "", getGajiTotal()) + "\n";
    }

}
