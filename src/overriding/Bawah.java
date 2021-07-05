package overriding;

public class Bawah extends Atas{
    public void cetak1(){
        super.cetak1();
        System.out.println("Selesai memanggil cetak 1 yang ada di superclass class ATAS dengan perintah super");
        System.out.println("");
        System.out.println("cetak 1 Ada di class BAWAH..");
    }

    public void cetak2(){
        System.out.println("cetak 2 Ada di class BAWAH..");
        System.out.println("i=" +i);
    }
}
