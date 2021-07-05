package UAS.classlist;

public class Mekanik extends Karyawan{
    
    private String sertifikatMekanik;

    
    /**
     * @param NIK
     * @param sertifikatMekanik
     */
    public Mekanik(String NIK, String sertifikatMekanik) {
        super(NIK);
        this.sertifikatMekanik = sertifikatMekanik;
    }

    /**
     * @return the sertifikatMekanik
     */
    public String getSertifikatMekanik() {
        return sertifikatMekanik;
    }

    /**
     * @param sertifikatMekanik the sertifikatMekanik to set
     */
    public void setSertifikatMekanik(String sertifikatMekanik) {
        this.sertifikatMekanik = sertifikatMekanik;
    }

}
