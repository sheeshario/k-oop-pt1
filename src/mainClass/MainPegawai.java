package mainClass;

import classlist.Pegawai;

public class MainPegawai {
    
    public static void main(String[] args) {
        
        Pegawai listPegawai[] = new Pegawai[3];
        listPegawai[0] = new Pegawai(10001, "Joni", "A", "0813");
        listPegawai[1] = new Pegawai(10002, "Abdy", "C", "");
        listPegawai[2] = new Pegawai(10003, "Yondu", "B", "0814");

        //print
        System.out.println("NIP     Nama         Jabatan    NoHP");
        System.out.println("========================================");
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println(listPegawai[i].toString());
        }
        System.out.println("========================================");

        //new Ver
        System.out.println("\nPemanggilan method upJabatan() ke Pegawai Joni dan Yondu:");
        //listPegawai[2].upJabatan();
        //listPegawai[0].upJabatan();

        System.out.println("\nSetelah up jabatan:\n");

        //print
        System.out.println("NIP     Nama         Jabatan    NoHP");
        System.out.println("========================================");
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println(listPegawai[i].toString());
        }
        System.out.println("========================================");

        //contoh method yang terdapat validasi
        System.out.println("\nMengubah NIP Abdy: ");
        listPegawai[1].setNip(0);  //jika tidak diisi akan menampilkan "Nip harus diisi."
        listPegawai[1].setNip(10005);   //attribut akan berubah sesuai parameter
        System.out.println("\nData Abdy:");
        System.out.println(listPegawai[1].toString());

    }

}
