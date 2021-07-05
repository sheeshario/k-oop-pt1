package mainClass;

import classlist.Pegawai;
import inheritance.Manajer;
import inheritance.Sales;
import inheritance.Sekretaris;
import classlist.Date;

public class polymorphismKasus4 {
    
    public static void main(String[] args) {
        
        Pegawai[] pegawai = new Pegawai[5];
        pegawai[0] = new Manajer(1000, "Dodi", "Manajer", "0812", new Date(01,01,2001), 9000000, 500000);
        pegawai[1] = new Sales(1001, "Tata", "Sales", "0814", new Date(10,10,2002), 4000000, 20);
        pegawai[2] = new Sales(1002, "Ewin", "Sales", "0814", new Date(30,12,2002), 4000000, 50);
        pegawai[3] = new Sekretaris(1003, "Mimi", "Sekretaris", "0813", new Date(02,02,2002), 5000000);
        pegawai[4] = new Sales(1004, "Koko", "Sales", "0814", new Date(03,03,2002), 4000000, 40);

        System.out.println("Gaji Manajer:");
        for (int i = 0; i < pegawai.length; i++) {
            if(pegawai[i] instanceof Manajer){
                System.out.print(pegawai[i].getNip() +"-");
                System.out.print(pegawai[i].getNama() +": ");
                System.out.println(((Manajer) pegawai[i]).getGajiTotal());
            }
        }
        
        System.out.println("\nGaji Sekretaris:");
        for (int i = 0; i < pegawai.length; i++) {
            if(pegawai[i] instanceof Sekretaris){
                System.out.print(pegawai[i].getNip() +"-");
                System.out.print(pegawai[i].getNama() +": ");
                System.out.println(((Sekretaris) pegawai[i]).getGajiTotal());
            }
        }

        System.out.println("\nGaji Sales:");
        for (int i = 0; i < pegawai.length; i++) {
            if(pegawai[i] instanceof Sales){
                System.out.print(pegawai[i].getNip() +"-");
                System.out.print(pegawai[i].getNama() +": ");
                System.out.println(((Sales) pegawai[i]).getGajiTotal());
            }
        }
    }
}
