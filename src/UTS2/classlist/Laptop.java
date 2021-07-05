package UTS2.classlist;

public abstract class Laptop {

    private String Merk, Type;

    public Laptop(String merk, String type) {
        this.Merk = merk;
        this.Type = type;
    }
    
    public void setMerk(String merk){
        this.Merk = merk;
    }
    
    public String getMerk(){
        return Merk;
    }
    
    public void setType(String type){
        this.Type = type;
    }
    
    public String getType(){
        return Type;
    }

    public abstract int getHarga();
    
    public abstract String toString();
}
