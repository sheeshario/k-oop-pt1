package classlist;

public class Time {
    
    public static final int DEFAULT_HOUR = 0;
    public static final int DEFAULT_MINUTE = 0;
    public static final int DEFAULT_SECOND = 0;

    private int hour;
    private int minute;
    private int second;

    public Time(){
        this(DEFAULT_HOUR, DEFAULT_MINUTE, DEFAULT_SECOND);
    }

    public Time(int hour){
        this(hour, DEFAULT_MINUTE, DEFAULT_SECOND);
    }

    public Time(int hour, int minute){
        this(hour, minute, DEFAULT_SECOND);
    }

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public void setHour(int hour){
        if(hour < 0 || hour > 23){
            System.out.println("Hour tidak boleh lebih dari 23!");
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute){
        if(minute < 0 || minute > 59){
            System.out.println("Minute tidak boleh lebih dari 59!");
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second){
        if(second < 0 || second > 59){
            System.out.println("Second tidak boleh lebih dari 59!");
        } else {
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int[] getTime(){
        int[] time = {this.hour, this.minute, this.second};
        return time;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public String toString(){
        return "Time: " +hour +":" +minute +":" +second;
    }

    public Time nextSecond(){
        this.second++;
        if(this.second > 59){
            this.minute++;
            this.second = 0;
        }
        if(this.minute > 59){
            this.hour++;
            this.minute = 0;
        }
        if(this.hour > 23){
            this.hour = 0;
        }
        return this;
    }
}
