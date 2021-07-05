package classlist;
//program lingkaran - luas

public class Circle2 {
    
    public static final double DEFAULT_RADIUS = 0;
    public static final String DEFAULT_COLOR = "none";

    private double radius;
    private String color;

    public Circle2() {
        radius = DEFAULT_RADIUS;
        color = DEFAULT_COLOR;
    }

    public void setRadius(double jari2){
        radius = jari2;
    }

    public void setColor(String warna){
        color = warna;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * radius * 2;
    }

    public String toString(){
        return "Radius\t\t: " +radius +"\nColor\t\t: " +color
        +"\nArea\t\t: " +getArea() +"\nCircumference\t: " +getCircumference();
    }
}
