package classlist;

public class Point {

    private int x, y;
    
    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        setXY(x, y);
    }

    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public void distanceXY(int x2, int y2) {
        System.out.println(Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y)));
    }

    public void distanceXY(Point point2){
        point2.distanceXY(getX(), getY());
    }

    public String toString() {
        return "(" +x +"," +y +")";
    }

}
