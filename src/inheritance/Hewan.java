package inheritance;

public class Hewan {
    private int kaki; //umur;
    private String gigi;

    Hewan(int k){
        kaki = k;
    }

    Hewan(int k, String g){
        kaki = k;
        gigi = g;
    }

    public void setKaki(int k){
        kaki = k;
    }

    public int getKaki(){
        return kaki;
    }

    public void setGigi(String g){
        gigi = g;
    }

    public String getGigi(){
        return gigi;
    }
}
