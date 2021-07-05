package mainClass;

import abstractClass.ManajerConc;
import abstractClass.PegawaiAbs;
import abstractClass.SalesConc;
import abstractClass.SekretarisConc;

public class MainClass_modul10a {
    public static void main(String[] args) {
        
        PegawaiAbs[] pegawai = new PegawaiAbs[5];
        pegawai[0] = new ManajerConc(101, "Juan", "", 1000000, 500000);
        pegawai[1] = new SalesConc(102, "Dito", "", 300000, 10);
        pegawai[2] = new SekretarisConc(103, "Redi", "", 700000);
        pegawai[3] = new SalesConc(104, "Toya", "", 300000, 30);
        pegawai[4] = new SalesConc(105, "Nemi", "", 300000, 40);

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
    }
}
