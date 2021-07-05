package mainClass;
import inheritance.Cylinder;

public class MainClyinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(7, 20, "Merah");
        Cylinder cylinder2 = new Cylinder(14, 10, "Kuning");

        System.out.println("Cylinder1:\n" +cylinder1);
        System.out.println("Cylinder2:\n" +cylinder2);
    }
}
