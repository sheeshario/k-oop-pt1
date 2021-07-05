package mainClass;

import classlist.Circle3;
import classlist.Point;

public class MainCircle3 {
    
    public static void main(String[] args) {
        
        Circle3 lingkaran1 = new Circle3(-12, "Yellow");
        System.out.println(lingkaran1.toString());

        lingkaran1.setCircle(14, "Purple", new Point(2,1));
        System.out.println("\nSetelah menggunakan method Setter:");
        System.out.println(lingkaran1.toString());

    }

}
