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
public abstract class Pegawai implements BerEmail, BerGaji{

    private String nama;
    private int nip;
    private String email;
    private double gajiPgwai;

    public Pegawai() {
        this(Toko.DEFAULT_NUM, Toko.DEFAULT_STRING, Toko.DEFAULT_STRING, Toko.DEFAULT_NUM);
    }
    public Pegawai(int nip, String nama, String email, double gajiPgwai) {
        setPegawai(nip, nama, email, gajiPgwai);
    }
   
    public void setNip(int nip) {
        if (nip >= 0) {
            this.nip = nip;
        }
    }
    public void setNama(String nama) {
        if (nama.equals("")) {
            System.out.println("Dilarang Mengosongkan Nama!");
        } else {
            this.nama = nama;
        }
    }
    public void setEmail(String email){
        if (email.equals("")) {
            System.out.println("Dilarang Mengosongkan email!");
        } else {
            this.email = email;
        }
    }
    public void setPegawai(int nip, String nama, String email, double gajiPgwai) {
        setNip(nip);
        setNama(nama);
        setEmail(email);
        setGajiPgwai(gajiPgwai);
    }
    public void setGajiPgwai(double GajiPgwai){
        if (GajiPgwai > 0) {
            this.gajiPgwai = GajiPgwai;
        }else{
            this.gajiPgwai = 0;
        }
    }
    public double getGajipgwai(){
        return this.gajiPgwai;
    }
    public double getGajitotal(){
        return getGajipgwai();
    }
    public int getNip() {
        return this.nip;
    }
    public String getNama() {
        return this.nama;
    }
    public String getEmail(){
        return this.email;
    }
   
    public abstract String toString();
}