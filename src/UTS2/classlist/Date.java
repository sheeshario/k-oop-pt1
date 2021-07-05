package UTS2.classlist;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(){
        this(0,0,0);
    }

    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int day, int month, int year) {
        if(String.valueOf(year).length() == 4){
            this.year = year;
            if (month < 1 || month > 12) {
                System.out.println("Input month invalid!");
                this.year = 0;
            } else {
                this.month = month;
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                    if(day < 1 || day > 31){
                        System.out.println("Input day invalid!");
                        this.month = 0;
                        this.year = 0;
                    } else {
                        this.day = day;
                    }
                } else if (month == 2){
                    if(day < 1 || day > 29){
                        System.out.println("Input day invalid!");
                        this.month = 0;
                        this.year = 0;
                    } else {
                        this.day = day;
                    }
                } else {
                    if(day < 1 || day > 30){
                        System.out.println("Input day invalid!");
                        this.month = 0;
                        this.year = 0;
                    } else {
                        this.day = day;
                    }
                }
            }
        } else{
            System.out.println("Input year invalid!");
        }
    }

    public String toString() {
        return String.format ("%02d/%02d/%04d", day, month, year);
    }
}