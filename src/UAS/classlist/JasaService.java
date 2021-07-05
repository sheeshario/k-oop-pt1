package UAS.classlist;

public class JasaService implements Tagihan{
    
    private Mekanik mekanik;
    private String jenisService;
    private double harga;
    /**
     * @param mekanik
     * @param jenisService
     * @param harga
     */
    public JasaService(Mekanik mekanik, String jenisService, double harga) {
        this.setMekanik(mekanik);
        this.setJenisService(jenisService);
        this.setHarga(harga);
    }
    /**
     * @return the mekanik
     */
    public Mekanik getMekanik() {
        return mekanik;
    }
    /**
     * @param mekanik the mekanik to set
     */
    public void setMekanik(Mekanik mekanik) {
        this.mekanik = mekanik;
    }
    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }
    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
    /**
     * @return the jenisService
     */
    public String getJenisService() {
        return jenisService;
    }
    /**
     * @param jenisService the jenisService to set
     */
    public void setJenisService(String jenisService) {
        this.jenisService = jenisService;
    }
    @Override
    public double getTagihan() {
        return harga;
    }

    

}
