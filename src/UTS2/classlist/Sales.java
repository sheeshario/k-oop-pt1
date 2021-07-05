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
public class Sales extends Pegawai{
    public static final int HASIL_BARANG = 1000;
    private int jmblhbrng;
    public Sales(){
        super();
    }
    public Sales(int nip, String nama,  String email, int gajiPgwai, int jmblhbrng) {
        setPegawai(nip, nama, email, gajiPgwai, jmblhbrng);
    }

    public void setJmblhbrng(int jmlhBarang){
        this.jmblhbrng = jmlhBarang;
    }
    public int getJmblhbrng(){
        return this.jmblhbrng;
    }
    public  void setPegawai(int nip, String nama, String email, int gajipgwai, int jmblhbrng){
        super.setPegawai(nip, nama, email, gajipgwai);
        setJmblhbrng(jmblhbrng);
    }
    public double getGajitotal(){
        return getGajipgwai() + (this.jmblhbrng * HASIL_BARANG);
    }
    public String toString(){
        return String.format("%-12s%-6s%-18s%-8s%-8s", "Sales", getNip(), getNama(), getJmblhbrng(), getGajitotal());
    }

} 
