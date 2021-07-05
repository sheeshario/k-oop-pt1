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
public class Barang {
    
    private String nama;
    private int harga;
    private int qty;
    
    public Barang(){
        this(Toko.DEFAULT_STRING, Toko.DEFAULT_INT, Toko.DEFAULT_INT);
    }
    
    public Barang(String nama, int harga, int qty){
        setBarang(nama, harga, qty);
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setHarga(int harga){
        if(harga<0){
            this.harga = Toko.DEFAULT_INT;
        } else {
            this.harga = harga;
        }
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setQty(int qty){
        if(qty<0){
            this.qty = Toko.DEFAULT_INT;
        } else {
            this.qty = qty;
        }
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setBarang(String nama, int harga, int qty){
        setNama(nama);
        setHarga(harga);
        setQty(qty);
    }

    public Barang addQty(int qty){
        if (qty > 0){
            this.qty = this.qty + qty;
        }
        return this;
    }

    public Barang sellQty(int qty){
        if (qty <= this.qty){
            this.qty = this.qty - qty;
        }
        return this;
    }
    
    @Override
    public String toString(){
        return String.format("%-14s%-10s%4s\n", nama, harga, qty);
    }

    public String JOpToString(){
        return String.format("%s  :  %s  :  %s\n", nama, harga, qty);
    }
}
