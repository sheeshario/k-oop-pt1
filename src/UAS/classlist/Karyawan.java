package UAS.classlist;

public class Karyawan {
    
    protected String NIK;

    public Karyawan(){
        NIK = "";
    }

    public Karyawan(String NIK){
        this.NIK = NIK;
    }

    public void setNIK(String NIK){
        this.NIK = NIK;
    }

    public String getNIK(){
        return NIK;
    }

}
