package mainClass;

import classlist.Time;

public class MainTime {

    public static void main(String[] args) {
        
        Time waktu = new Time(23, 59, 59);
        System.out.println(waktu.toString());

        waktu.nextSecond();
        System.out.println("Setelah pemanggilan method nextSecond():");
        System.out.println(waktu.toString());
    }
    

}
