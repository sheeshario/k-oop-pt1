/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2.classlist;

/**
 *
 * @author abimn
 */
public class Manejer extends Pegawai{
    
    private int tunjangan;
     public Manejer(){
        super();
    }
    public Manejer(int nip, String nama, String email, int gajiPgwai, int tunjangan) {
        setPegawai(nip, nama, email, gajiPgwai, tunjangan);
    }     
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    public int getTunjangan(){
        return this.tunjangan;
    }
    public  void setPegawai(int nip, String nama, String email, int gajipgwai, int tunjangan){
        super.setPegawai(nip, nama, email, gajipgwai);
        setTunjangan(tunjangan);
    }
    public double getGajitotal(){
        return getGajipgwai() + this.tunjangan;
    }
    public String toString(){
        return String.format("%-12s%-6s%-18s%-8s%-8s", "Manejer", getNip(), getNama(), getTunjangan(), getGajitotal());
    }

}
