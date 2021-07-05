package inheritance;
import classlist.Circle3;

public class Cylinder extends Circle3{
    
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        setHeight(height);
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        setHeight(height);
    }

    public void setHeight(double height){
        if (height >= 0) {
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return getBaseArea() * height;
    }

    public double getBaseArea(){
        return super.getArea();
    }

    public double getArea(){
        return 2 * getBaseArea() + getBlanketArea();
    }

    public double getBlanketArea(){
        return super.getCircumference() * height;
    }

    public String toString(){
        return "Cylinder[Circle[radius=" +getRadius() +",color=" +getColor() +"],height=" +getHeight() 
        +"]\nVolume\t\t: " + getVolume() +"\nArea\t\t: " + getArea() +"\nBase Area\t: " + getBaseArea() +"\n";
    }
}
