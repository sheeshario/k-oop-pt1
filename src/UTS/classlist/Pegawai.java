/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS.classlist;

/**
 *
 * @author Dito
 */
public class Pegawai {
    
    private String nama;
    private char gender;
    private int usia;
    
    public Pegawai(){
        this(Toko.DEFAULT_STRING, '0', Toko.DEFAULT_INT);
    }
    
    public Pegawai(String nama, char gender, int usia){
        setPegawai(nama, gender, usia);
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setGender(char gender){
        switch (gender) {
            case 'L':
            case 'l':
                this.gender = 'L';
                break;
            case 'P':
            case 'p':
                this.gender = 'P';
                break;
            default:
                this.gender = '?';
                break;
        }
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setUsia(int usia){
        if(usia < 1){
            this.usia = 0;
        } else {
            this.usia = usia;
        }
    }
    
    public int getUsia(){
        return usia;
    }
    
    public void setPegawai(String nama, char gender, int usia){
        setNama(nama);
        setGender(gender);
        setUsia(usia);
    }
    
    @Override
    public String toString(){
        return String.format("%-18s%-7s%s\n", nama, gender, usia);
    }

    public String JOpToString(){
        return String.format("%s  :  %s  :  %s\n", nama, gender, usia);
    }
}
