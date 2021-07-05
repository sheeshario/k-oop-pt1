package classlist;

//program lingkaran - luas

public class Circle1 {
    
    private double jari2;

    public Circle1() {
        jari2 = 0;
    }

    public Circle1(double r){
        
        jari2 = r;
    }

    public void setJari2(double r){
        jari2 = r;
    }

    public double getJari2(){
        return jari2;
    }

    public double getLuas(){
        return Math.PI * jari2 * jari2;
    }

    public void print(){
        System.out.println("Jari - jari\t\t: " +jari2);
        System.out.println("Luas\t\t\t: " +getLuas());
    }
}
