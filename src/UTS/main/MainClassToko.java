package UTS.main;

import java.util.Scanner;
import javax.swing.JOptionPane;
import UTS.classlist.Toko;
import UTS.classlist.Barang;
import UTS.classlist.Pegawai;

public class MainClassToko {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // CONTOH PENGGUNAAN ARRAY OF OBJECT
        // Pembuatan Array of Object Toko Elektronik
        Barang elektronik[] = new Barang[Toko.MAX_ELEMENT];
        Pegawai pegawaiElektronik[] = new Pegawai[Toko.MAX_ELEMENT];

        // Pembuatan Array of Object Toko Perabotan
        Barang perabotan[] = new Barang[Toko.MAX_ELEMENT];
        Pegawai pegawaiPerabotan[] = new Pegawai[Toko.MAX_ELEMENT];

        // Inisialisasi Array of Object
        elektronik[0] = new Barang("HandPhone", 1000000, 10);
        elektronik[1] = new Barang("Laptop", 5000000, 5);
        elektronik[2] = new Barang("TV", 2000000, 3);
        elektronik[3] = new Barang("Mouse", 300000, 10);
        elektronik[4] = new Barang("Keyboard", 800000, 10);
        elektronik[5] = new Barang("Monitor", 4000000, 2);

        pegawaiElektronik[0] = new Pegawai("Budi", 'L', 30);
        pegawaiElektronik[1] = new Pegawai("Sri", 'P', 27);

        // Inisialisasi Array of Object
        perabotan[0] = new Barang("Meja", 2500000, 5);
        perabotan[1] = new Barang("Kursi", 500000, 10);
        perabotan[2] = new Barang("Lemari", 4000000, 2);

        pegawaiPerabotan[0] = new Pegawai("Santo", 'l', 35);

        // Pembuatan Object Toko Elektronik
        Toko tokoElektronik = new Toko("Toko Elektronik", 5000000, elektronik, pegawaiElektronik);
        System.out.println("Print toko Elektronik setelah diinisialisasi:");
        System.out.println(">>>");
        System.out.println(tokoElektronik.tokoInfo());

        // Pembuatan Object Toko Perabotan
        Toko tokoPerabotan = new Toko("Toko Perabotan", 1000000, perabotan, pegawaiPerabotan);
        System.out.println("Print toko Perabotan setelah diinisialisasi:");
        System.out.println(">>>");
        System.out.println(tokoPerabotan.tokoInfo());

        // test new methods
        Pegawai[] karyawanBaru = new Pegawai[3];
        karyawanBaru[0] = new Pegawai("Ilham", 'l', 19);
        karyawanBaru[1] = new Pegawai("Faiz", 'l', 19);
        karyawanBaru[2] = new Pegawai("Dito", 'l', 18);

        Barang[] barangBaru = new Barang[3];
        barangBaru[0] = new Barang("Samsung", 1000000, 10);
        barangBaru[1] = new Barang("Lenovo", 500000, 20);
        barangBaru[2] = new Barang("Apple", 10000000, 5);

        tokoElektronik.addPegawai(karyawanBaru);
        tokoElektronik.addBarang(barangBaru);

        System.out.println("Print toko Elektronik setelah menambah barang serta karyawan baru:");
        System.out.println(">>>");
        System.out.println(tokoElektronik.tokoInfo());

        System.out.println("Contoh method search:");
        System.out.println(">>>");
        System.out.println("searching \"Dito\" and \"Samsung\" at Toko Elektronik...");
        System.out.println(tokoElektronik.searchPegawai("Dito"));
        System.out.println(tokoElektronik.searchBarang("Samsung"));

        // END OF CONTOH PENGGUNAAN ARRAY OF OBJECT
        // MAIN CLASS JOPTIONPANE VERSION
        Toko[] listToko = new Toko[10];

        // Menginput 2 toko yang sudah dibuat di contoh penggunaan ARRAY OF OBJECT
        listToko[0] = tokoElektronik;
        listToko[1] = tokoPerabotan;

        boolean checker = true;
        String list;
        int countToko;

        do {
            // Print listToko
            list = "";
            countToko = 0;
            for (int i = 0; i < listToko.length; i++) {
                if (listToko[i] != null) {
                    list = list + (i + 1) + ". " + listToko[i] + "\n";
                    countToko++;
                } else {
                    list = list + (i + 1) + ". -\n";
                }
            }

            String select = JOptionPane.showInputDialog(null, "PROGRAM MANAJEMEN TOKO\n-------------------------------------------\nList Toko:\nKeterangan => Nama  :  Kas\n=============================\n" + list + "=============================\n\nType \"1-10\" to enter the menu of Toko\nType \"100\" to add Toko\nType \"101\" to edit Toko\nType \"102\" to remove Toko\nType \"0\" to exit this application");

            if (select == null) {
                System.exit(0);
            } else {
                // agar program tidak berhenti jika terjadi error || catch an error
                try {
                    int choose = Integer.parseInt(select);
                    if (choose == 0) {
                        checker = false;
                    } else if (choose > 0 && choose < 11) {
                        if (listToko[choose - 1] != null) {
                            listToko[choose - 1].display();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Error, Toko is null! Please add a new Toko or select the available Toko!", "ERROR",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else if (choose == 100) { //add toko
                        if (countToko >= 10) {
                            JOptionPane.showMessageDialog(null, "Error, Toko sudah mencapai batas maksimal!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            String name = JOptionPane.showInputDialog(null, "Masukkan nama toko: ");
                            int cash;
                            cash = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan kas awal toko: "));
                            listToko[countToko] = new Toko(name, cash);
                            JOptionPane.showMessageDialog(null, "Toko berhasil dibuat!", "Success",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else if (choose == 101) {  //edit toko
                        String innerSelect = JOptionPane.showInputDialog(null, "List Toko:\n" + list + "\n\nPilih toko yang akan diEdit:");
                        if (innerSelect == null) {
                            break;
                        }
                        int innerChoose;

                        innerChoose = Integer.parseInt(innerSelect);

                        if (innerChoose > 0 && innerChoose < 11) {
                            //input nama, kas
                            String name = JOptionPane.showInputDialog(null, "Masukkan nama toko: ");
                            if (name == null) {
                                break;
                            }
                            int cash = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan kas awal toko: "));
                            //edit toko
                            listToko[innerChoose - 1].setNama(name);
                            listToko[innerChoose - 1].setKas(cash);
                            //display msg
                            JOptionPane.showMessageDialog(null, "Toko berhasil diEdit!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else if (choose == 102) { //remove toko
                        String innerSelect = JOptionPane.showInputDialog(null, "List Toko:\n" + list + "\n\nPilih toko yang akan diRemove:");
                        int innerChoose;

                        innerChoose = Integer.parseInt(innerSelect);

                        if (innerChoose > 0 && innerChoose < 11 && innerChoose <= countToko) {
                            listToko[innerChoose - 1] = null;
                            if (innerChoose != 10) {
                                for (int i = innerChoose - 1; i < countToko; i++) {
                                    listToko[i] = listToko[i + 1];
                                }
                            }
                            JOptionPane.showMessageDialog(null, "Toko berhasil diremove!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } while (checker);
    }
}
