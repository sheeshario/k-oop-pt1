package abstractClass;

public class PegawaiIT extends PegawaiAbs {
    
    private double fungsional;

    public PegawaiIT(int nip, String nama, String email){
        super(nip, nama, email);
    }

    public PegawaiIT(int nip, String nama, String email, double gajiPokok, double fungsional){
        super(nip, nama, email, gajiPokok);
        setFungsional(fungsional);
    }

    public void setFungsional(double fungsional){
        if (fungsional > 0){
            this.fungsional = fungsional;
        } else {
            this.fungsional = 0;
        }
    }

    public double getFungsional(){
        return this.fungsional;
    }

    public void setPegawaiIT(int nip, String nama, String email, double gajiPokok, double fungsional){
        super.setPegawai(nip, nama, email, gajiPokok);
        setFungsional(fungsional);
    }

    public double getGajiTotal(){
        return getGajiPokok() + this.fungsional;
    }

    public String toString(){
        return String.format("%s  :  %s  :  %-7s  :  %18s%-18s  :  %s\n", getNip(), getNama(),
        "Pgw IT", getFungsional(), "", getGajiTotal()) + "\n";
    }

}