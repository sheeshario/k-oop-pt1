package mainClass;

import javax.swing.JOptionPane;

import classlist.Date;
import classlist.Kantor_cabang;
import classlist.Pegawai;

public class mainClass6b {

    public static void main(String[] args) {
        
        Pegawai[]   listPegawai1 = new Pegawai[Kantor_cabang.MAX_ELEMENTS], 
                    listPegawai2 = new Pegawai[Kantor_cabang.MAX_ELEMENTS], 
                    listPegawai3 = new Pegawai[Kantor_cabang.MAX_ELEMENTS];

        Kantor_cabang listKC[] = new Kantor_cabang[4];

        //data Pegawai 1
        listPegawai1[0] = new Pegawai(10001, "Joni", "A", "0813", new Date(02,5,2002), 1000000);
        listPegawai1[1] = new Pegawai(10002, "Abdy", "C", "None");
        listPegawai1[2] = new Pegawai(10003, "Yondu", "B", "0814", new Date(03,6,2002), 500000);
        int jumPegawai1 = 3;
 
        //data Pegawai 2
        listPegawai2[0] = new Pegawai(10001, "Yaya", "A", "0811", new Date(20,12,2002), 1500000);
        listPegawai2[1] = new Pegawai(10002, "Jupi", "C", "None");
        listPegawai2[2] = new Pegawai(10003, "Meyi", "C", "0810", new Date(6,12,2002), 100000);
        int jumPegawai2 = 3;

        //data Pegawai 3
        listPegawai3[0] = new Pegawai(10001, "Ilham", "A", "0813", new Date(31,7,2002), 2000000);
        listPegawai3[1] = new Pegawai(10002, "Billy", "B", "0812");
        listPegawai3[2] = new Pegawai(10003, "Dito", "B", "0814", new Date(12,12,2002), 6000);
        int jumPegawai3 = 3;

        //data Kantor Cabang
        listKC[0] = new Kantor_cabang("A001", "Sleman", "Yogyakarta", listPegawai1[0], listPegawai1, jumPegawai1);
        listKC[1] = new Kantor_cabang("A002", "Godean", "Yogyakarta", listPegawai2[0], listPegawai2, jumPegawai2);
        listKC[2] = new Kantor_cabang("A003", "Palmerah", "Jakarta", listPegawai3[0], listPegawai3, jumPegawai3);
        listKC[3] = new Kantor_cabang();

        //displayKC
        boolean checker = true;
        do {
            String choose = JOptionPane.showInputDialog(null, "List Kantor Cabang:\n1. A001\n2. A002\n3. A003\n4. A004\n\nType \"Exit\" to exit this application");

            if (choose == null){
                break;
            }

            switch (choose) {
            case "1":
                listKC[0].display();
                break;
            case "2":
                listKC[1].display();
                break;
            case "3":
                listKC[2].display();
                break;
            case "4":
                listKC[3].display();
                break;
            case "Exit":
                checker = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        } while (checker);

        //Modul 6b  -   edit KC[0]/A001 & KC[1]/A002

        //KC[0]/A001
        //addPegawai
        Pegawai pegawaiBaru = new Pegawai(10004, "Erna", "C", "0810", new Date(9,12,2002), 100000);
        boolean check = listKC[0].addPegawai(pegawaiBaru);
        if (check){
            System.out.println("Add berhasil");
        } else {
            System.out.println("Add gagal");
        }
        listKC[0].display();

        //remove pegawai
        check = listKC[0].removePegawai(0);
        if (check){
            System.out.println("Remove berhasil");
        } else {
            System.out.println("Remove gagal");
        }
        listKC[0].display();

        //KC[1]/A002
        //findPegawai   - berdasar nama
        String namaCari = "Jupi";
        int indexH = listKC[1].findPegawai(namaCari);
        if (indexH == -1){
            System.out.println(namaCari +" tidak ditemukan");
        } else {
            System.out.println(namaCari +" ditemukan di index: " +indexH);
        }

        //findPegawai   - berdasar nip
        int nipCari = 10003;
        indexH = listKC[1].findPegawai(nipCari);
        if (indexH == -1){
            System.out.println(nipCari +" tidak ditemukan");
        } else {
            System.out.println(nipCari +" ditemukan di index: " +indexH);
        }

        //GajiTerbesar
        System.out.println("Gaji terbesar: " +listKC[1].getPegawaiGajiTerbesar());

        //GajiTerkecil
        System.out.println("Gaji terkecil: " +listKC[1].getPegawaiGajiTerkecil());

        //displayKC - setelah diedit
        checker = true;
        do {
            String choose = JOptionPane.showInputDialog(null, "List Kantor Cabang:\n1. A001\n2. A002\n3. A003\n4. A004\n\nType \"Exit\" to exit this application");

            if (choose == null){
                break;
            }

            switch (choose) {
            case "1":
                listKC[0].display();
                break;
            case "2":
                listKC[1].display();
                break;
            case "3":
                listKC[2].display();
                break;
            case "4":
                listKC[3].display();
                break;
            case "Exit":
                checker = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        } while (checker);
    }
}
