package mytest;

import java.util.Scanner;

class User {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        String scNext = sc.next();
        System.out.println(scNext);

        sc.reset();
        String scNextLine = sc.nextLine();
        System.out.println(scNextLine);

    }

}
