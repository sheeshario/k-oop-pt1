package mainClass;

import classlist.Circle3;
import classlist.Point;

public class MainCircle3New {
    
    public static void main(String[] args) {
        
        Circle3 lingkaran1 = new Circle3(14, "Red", new Point(10, 5));
        Circle3 lingkaran2 = new Circle3(32, "Green", new Point(5, 7));

        System.out.println(lingkaran1.toString());
        System.out.println();
        System.out.println(lingkaran2.toString());

        System.out.println();

        //method menggunakan parameter int
        System.out.println("Distance from (5,4) to " +lingkaran1.getCenter() +": ");
        lingkaran1.getCenter().distanceXY(5, 4);

        System.out.println();
        
        //method menggunakan parameter object
        System.out.println("Distance from " +lingkaran2.getCenter() +" to " +lingkaran1.getCenter() +": ");
        lingkaran1.getCenter().distanceXY(lingkaran2.getCenter());

    }
}
