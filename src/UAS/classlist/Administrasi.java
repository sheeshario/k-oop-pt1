package UAS.classlist;

public class Administrasi extends Karyawan {
    
    private String sertifikatKomputer;
    
    public Administrasi(){
        sertifikatKomputer = "";
    }

    public void setSertifikatKomputer(String sertifikat){
        sertifikatKomputer = sertifikat;
    }

    public String getSertifikatKomputer(){
        return sertifikatKomputer;
    }

}
