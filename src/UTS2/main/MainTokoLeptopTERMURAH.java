package UTS2.main;

import java.util.Scanner;
import UTS2.classlist.Toko;
import UTS2.classlist.Pegawai;
import UTS2.classlist.Pelanggan;
import UTS2.classlist.Manejer;
import UTS2.classlist.Sales;
import UTS2.classlist.Karyawan;
import UTS2.classlist.Laptop;
import UTS2.classlist.Acer;
import UTS2.classlist.Asus;
import UTS2.classlist.Lenovo;

public class MainTokoLeptopTERMURAH {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Pegawai[] listPegawai = new Pegawai[Toko.MAX_ELEMENT];
        //data Pegawai yang akan diinput ke Toko
        listPegawai[0] = new Manejer(101, "Abi", "juan@gmail.com", 10000, 5000);
        listPegawai[1] = new Sales(102, "Dito", "dito@gmail.com", 3000, 3);
        listPegawai[2] = new Karyawan(103, "Cia", "redi@gmail.com", 7000);
        listPegawai[3] = new Sales(104, "Toya", "toya@gmail.com", 3000, 7);
        listPegawai[4] = new Sales(105, "Nemi", "nemi@gmail.com", 3000, 8);

        Laptop[] listLaptop = new Laptop[Toko.MAX_ELEMENT];
        //data Laptop yang akan diinput ke Toko
        Asus asus1 = new Asus("Vivobook");          //laptop1
        asus1.setWarna("Putih");
        asus1.setSpesifikasi("RAM 4GB");
        asus1.setHarga(2000);

        Asus asus2 = new Asus("Vivobook");           //laptop2
        asus2.setWarna("Hitam");
        asus2.setSpesifikasi("RAM 4GB");
        asus2.setHarga(2000);

        Lenovo lenovo1 = new Lenovo("IdeaPad");   //laptop3  
        lenovo1.setWarna("Abu-Abu");
        lenovo1.setSpesifikasi("RAM 8GB");
        lenovo1.setHarga(3000);

        Lenovo lenovo2 = new Lenovo("V130");  //laptop4
        lenovo2.setWarna("Abu-Abu");
        lenovo2.setSpesifikasi("RAM 4GB");
        lenovo2.setHarga(4000);
        
        Acer acer1 = new Acer("Aspire");         //laptop5
        acer1.setWarna("Hitam");
        acer1.setSpesifikasi("RAM 4GB");
        acer1.setHarga(5000);
        //input data ke array
        listLaptop[0] = asus1;
        listLaptop[1] = asus2;
        listLaptop[2] = lenovo1;
        listLaptop[3] = lenovo2;
        listLaptop[4] = acer1;

        Toko toko = new Toko("LEPTOP TERMURAH SE-RI", 10000, "tokoKel6@gmail.com", listLaptop, listPegawai);
        toko.addPelanggan(new Pelanggan("Judi", "judi@gmail.com", 1));
        toko.addPelanggan(new Pelanggan("Kiko", "kiko@gmail.com", 0));
        toko.addPelanggan(new Pelanggan("Wewe", "wewe@gmail.com", 1));

        do{
            //try{
                System.out.println("\n\n== MENU TOKO " +toko.getNama() +" == Kas: " +toko.getKas());
                System.out.print(    "1. Pegawai\n"
                                    +"2. Laptop\n"
                                    +"3. Pelanggan\n"
                                    +"4. Transaksi\n"
                                    +"5. Contact list (email)\n"
                                    +"0. Exit Program\n"
                                    +">> ");
                String choose = sc.next();
                switch (choose) {
                    case "1":
                        toko.MenuPegawai();
                        break;
                    
                    case "2":
                        toko.MenuLaptop();
                        break;

                    case "3":
                        toko.MenuPelanggan();
                        break;

                    case "4":
                        toko.MenuTransaksi();
                        break;

                    case "5":
                        toko.ContactList();
                        break;

                    case "0":
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\nInput tidak sesuai! Silahkan coba lagi...\n");
                        break;
                }
            //}catch (Exception e){
                
            //}

        }while(true);

    }

}
