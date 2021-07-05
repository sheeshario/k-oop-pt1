package mainClass;

import abstractClass.ManajerConc;
import abstractClass.PegawaiAbs;
import abstractClass.SalesConc;
import abstractClass.SekretarisConc;
import classlist.Kantor_cabangV2;
import abstractClass.PegawaiIT;
import classlist.Mahasiswa;
import interfaceClass.BerEmail;

public class MainClass_modul10b {
    public static void main(String[] args) {
        
        PegawaiAbs[] pegawai = new PegawaiAbs[Kantor_cabangV2.MAX_ELEMENTS];
        pegawai[0] = new ManajerConc(101, "Juan", "juan@gmail.com", 1000000, 500000);
        pegawai[1] = new SalesConc(102, "Dito", "dito@gmail.com", 300000, 10);
        pegawai[2] = new SekretarisConc(103, "Redi", "redi@gmail.com", 700000);
        pegawai[3] = new SalesConc(104, "Toya", "toya@gmail.com", 300000, 30);
        pegawai[4] = new SalesConc(105, "Nemi", "nemi@gmail.com", 300000, 40);

        System.out.println("Gaji Manajer:");
        for (int i = 0; i < pegawai.length; i++) {
            if(pegawai[i] instanceof ManajerConc){
                System.out.print(pegawai[i].getNip() +"-");
                System.out.print(pegawai[i].getNama() +": ");
                System.out.println(((ManajerConc) pegawai[i]).getGajiTotal());
            }
        }
        
        System.out.println("\nGaji Sekretaris:");
        for (int i = 0; i < pegawai.length; i++) {
            if(pegawai[i] instanceof SekretarisConc){
                System.out.print(pegawai[i].getNip() +"-");
                System.out.print(pegawai[i].getNama() +": ");
                System.out.println(((SekretarisConc) pegawai[i]).getGajiTotal());
            }
        }

        System.out.println("\nGaji Sales:");
        for (int i = 0; i < pegawai.length; i++) {
            if(pegawai[i] instanceof SalesConc){
                System.out.print(pegawai[i].getNip() +"-");
                System.out.print(pegawai[i].getNama() +": ");
                System.out.println(((SalesConc) pegawai[i]).getGajiTotal());
            }
        }   

        //modul10b
        Kantor_cabangV2 kantor1 = new Kantor_cabangV2("A023", "Jl. Margorukun no. 2", "Yogyakarta", pegawai[0], pegawai, 5);
        kantor1.addPegawai(new PegawaiIT(106, "Iyam", "ilham@gmail.com", 4000000, 2000000)); //add pegawai IT

        //output kantor1 (kantor cabang)
        System.out.println("\n" +kantor1.toString());

        //mahasiswa
        Mahasiswa[] listMahasiswa = new Mahasiswa[5];
        listMahasiswa[0] = new Mahasiswa("101", "Jeki", "jeki@gmail.com");
        listMahasiswa[1] = new Mahasiswa("102", "Keput", "keput@gmail.com");
        listMahasiswa[2] = new Mahasiswa("103", "Kevin", "kevin@gmail.com");
        listMahasiswa[3] = new Mahasiswa("104", "Billy", "billy@gmail.com");
        listMahasiswa[4] = new Mahasiswa("105", "Aldo", "aldo@gmail.com");

        //tampilkan email:
        System.out.println("\nTampilkan email pegawai di Kantor cabang dan list Mahasiswa: ");

        BerEmail[] listEmail = new BerEmail[10];
        listEmail[0] = pegawai[0];
        listEmail[1] = pegawai[1];
        listEmail[2] = pegawai[2];
        listEmail[3] = pegawai[3];
        listEmail[4] = pegawai[4];
        listEmail[5] = listMahasiswa[0];
        listEmail[6] = listMahasiswa[1];
        listEmail[7] = listMahasiswa[2];
        listEmail[8] = listMahasiswa[3];
        listEmail[9] = listMahasiswa[4];

        System.out.printf("%n%6s%s%n", "", "Pegawai:");
        for (int i = 0; i < listEmail.length; i++) {
            if(listEmail[i] instanceof PegawaiAbs)
                System.out.printf("%-4s%-10s%n", (i+1), listEmail[i].getEmail());
        }
        System.out.printf("%n%6s%s%n", "", "Mahasiswa:");
        for (int i = 0; i < listEmail.length; i++) {
            if(listEmail[i] instanceof Mahasiswa)
                System.out.printf("%-4s%-10s%n", (i+1), listEmail[i].getEmail());
        }
    }
}
