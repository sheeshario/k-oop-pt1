package classlist;
//program lingkaran - luas

public class Circle3 {
    
    private static final double DEFAULT_RADIUS = 0;
    private static final String DEFAULT_COLOR = "none";

    private double radius;
    private String color;
    private Point center;

    public Circle3() {
        this(DEFAULT_RADIUS, DEFAULT_COLOR, new Point());
    }

    public Circle3(double radius){
        this(radius, DEFAULT_COLOR, new Point());
    }

    public Circle3(double radius, String color){
        this(radius, color, new Point());
    }

    public Circle3(double radius, String color, Point center){
        setCircle(radius,color,center);
    }

    public void setRadius(double radius){
        if(radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public void setCircle(double radius, String color, Point center){
        setRadius(radius);
        setColor(color);
        setCenter(center);
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

    public Point getCenter(){
        return center;
    }

    public String toString(){
        return "Radius\t\t: " +radius +"\nColor\t\t: " +color
        +"\nArea\t\t: " +getArea() +"\nCircumference\t: " +getCircumference() +"\nCenter\t: " +getCenter();
    }
}
