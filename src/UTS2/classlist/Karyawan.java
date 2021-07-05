/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2.classlist;

public class Karyawan extends Pegawai{
    public Karyawan(){
        super();
    }
    public Karyawan(int nip, String nama, String email, int gajiPgwai) {
        super(nip, nama, email, gajiPgwai);
    }
    public double getGajitotal(){
        return getGajipgwai();
    }
     public String toString(){
        return String.format("%-12s%-6s%-18s%-8s%-8s", "Karyawan", getNip(), getNama(), "None", getGajitotal());
        
}
}
