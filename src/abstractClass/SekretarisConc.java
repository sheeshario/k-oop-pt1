package abstractClass;

public class SekretarisConc extends PegawaiAbs{
    
    public SekretarisConc(int nip, String nama, String email){
        super(nip, nama, email);
    }

    public SekretarisConc(int nip, String nama, String email, double gajiPokok){
        super(nip, nama, email, gajiPokok);
    }

    public double getGajiTotal(){
        return getGajiPokok();
    }

    public void setSekretaris(int nip, String nama, String email, double gajiPokok){
        super.setPegawai(nip, nama, email, gajiPokok);
    }

    public String toString(){
        return String.format("%s  :  %s  :  %-7s  :  %18s%-18s  :  %s\n", getNip(), getNama(),
        "Sekre", "None", "", getGajiTotal()) + "\n";
    }

}
