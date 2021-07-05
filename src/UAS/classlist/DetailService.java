package UAS.classlist;

public class DetailService {
    
    private String idService;
    private Pelanggan pelanggan;
    private Tagihan[] tagihan;
    private int maxTagihan = 100;
    private int tagihanKe;
    private double totalPart;
    private double totalService;

    /**
     * @param idService
     * @param pelanggan
     */
    public DetailService(String idService, Pelanggan pelanggan) {
        this.setIdService(idService);
        this.setPelanggan(pelanggan);
        tagihanKe = 0;
        totalPart = 0;
        totalService = 0;
        tagihan = new Tagihan[maxTagihan];
    }
    /**
     * @param maxTagihan
     */
    public DetailService(int maxTagihan) {
        this.setIdService("");
        totalPart = 0;
        totalService = 0;
        tagihanKe = 0;
        this.maxTagihan = maxTagihan;
        tagihan = new Tagihan[maxTagihan];
    }
     /**
     * @return the totalService
     */
    public double getTotalService() {
        return totalService;
    }
    /**
     * @return the totalPart
     */
    public double getTotalPart() {
        return totalPart;
    }
    /**
     * @return the pelanggan
     */
    public Pelanggan getPelanggan() {
        return pelanggan;
    }
    /**
     * @param pelanggan the pelanggan to set
     */
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    /**
     * @return the idService
     */
    public String getIdService() {
        return idService;
    }
    /**
     * @param idService the idService to set
     */
    public void setIdService(String idService) {
        this.idService = idService;
    }
    
    public void addTagihan(Tagihan tagihan) {
            this.tagihan[tagihanKe] = tagihan;
            tagihanKe++;
    }

    public void printDetailService(){
        System.out.println("Bengkel Otomotif \"Paulus Caesario Dito Putra Hartono & 205314159\""
                        +"\n===================================================================\n");
        System.out.println("Id Service\t: " +idService);
        System.out.println("Pelanggan\t: " +pelanggan);

        System.out.println("\n--------------------------------- Detail Service ---------------------------------");
        System.out.println("\n[Biaya SparePart]");
        String temp = "";
        for (int i = 0; i < tagihanKe; i++) {
            if(tagihan[i] instanceof SparePart){
                temp = temp + String.format("%s",  ((SparePart) tagihan[i]));
                totalPart = totalPart + ((SparePart) tagihan[i]).getTagihan();
            }
        }
        System.out.println(temp);
        System.out.println("-----------------------------------------");
        System.out.println("Total Spare Part\t: Rp.  " +totalPart);

        System.out.println("\n[Biaya Service]");
        temp = "";
        for (int i = 0; i < tagihanKe; i++) {
            if(tagihan[i] instanceof JasaService){
                temp = temp + String.format("%-16s  Rp.     %s\n",  ((JasaService) tagihan[i]).getJenisService(), ((JasaService) tagihan[i]).getHarga());
            totalService = totalService + ((JasaService) tagihan[i]).getTagihan();
            }
        }
        System.out.println(temp);
        System.out.println("-----------------------------------------");
        System.out.println("Total Service\t: Rp. " +totalService);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("GRAND TOTAL\t\t: Rp. " +(totalPart + totalService));
    }

}
