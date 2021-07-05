package mainClass;
import inheritance.Manajer;
import inheritance.Sales;
import inheritance.Sekretaris;
import classlist.Date;

public class TesPegawai {
    public static void main(String[] args) {
        Manajer manajer = new Manajer(101, "Dito", "Manajer", "08123", new Date(03,06,2002), 5000000, 1000000);
        Sales sales = new Sales(102, "Faiz", "Sales", "08124", new Date(01,12,2001), 3000000, 10);
        Sekretaris sekretaris = new Sekretaris(103, "Ilham", "Sekretaris", "08133", new Date(05,05,2003), 4500000);

        System.out.println("nip - nama - jabatan - gaji");
        System.out.println("===========================");
        System.out.println(manajer.toString());
        System.out.println(sales.toString());
        System.out.println(sekretaris.toString());
    }
}
