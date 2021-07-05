package UAS.main;

import UAS.classlist.Administrasi;
import UAS.classlist.DetailService;
import UAS.classlist.JasaService;
import UAS.classlist.Mekanik;
import UAS.classlist.Pelanggan;
import UAS.classlist.SparePart;

public class MainTest {

    public static void main(String[] args) {
        // Soal no 1 
        Pelanggan pelanggan1 = new Pelanggan(212, "NamaAnda");
        Pelanggan pelanggan2 = new Pelanggan();
        pelanggan2.setNama("Some Body");
        pelanggan2.setNomer(212);
        
        // Soal no2 
        DetailService detailService1 = new DetailService("Id_Service_1", pelanggan1);
        detailService1.setPelanggan(pelanggan1);
        
        // Soal no 3 
        Mekanik mekanik1 = new Mekanik("NIK_Mekanik_1", "Sertifikat_Otomotif_1");
        Administrasi admin1 = new Administrasi();
        admin1.setNIK("NIK_Admin_1");
        admin1.setSertifikatKomputer("Sertifikat_Komputer_1");
        
        // Soal no 4 
        SparePart sparePart1 = new SparePart("Spare_Part_1", 75000, 2);
        JasaService jasaService1 = new JasaService(mekanik1, "Service_Ringan", 200000);
        DetailService detailService2 = new DetailService(10);
        detailService2.setIdService("Id_Service_2");
        detailService2.setPelanggan(pelanggan2);
        
        // soal no 5 (Praktek) 
        detailService2.addTagihan(sparePart1);
        detailService2.addTagihan(jasaService1);
        SparePart sparePart2 = new SparePart("Spare_Part_2", 15000, 1);
        JasaService jasaService2 = new JasaService(mekanik1, "Service_AC", 300000);
        detailService2.addTagihan(sparePart2);
        detailService2.addTagihan(jasaService2);
        SparePart sparePart3 = new SparePart("Spare_Part_3", 5000, 5);
        JasaService jasaService3 = new JasaService(mekanik1, "Service_Rem", 100000);
        detailService2.addTagihan(sparePart3);
        detailService2.addTagihan(jasaService3);
        SparePart sparePart4 = new SparePart("Spare_Part_4", 15000, 2);
        detailService2.addTagihan(sparePart4);
        detailService2.printDetailService();
    }
}
