package UTS2.classlist;

public class Transaksi {

    private Date tglTransaksi;
    private String catatan;
    private double hargaJual;
    private Pelanggan pelanggan;
    private Sales sales;
    private Laptop laptop;

    public Transaksi(Date tglTransaksi, Pelanggan pelanggan, Sales sales, Laptop laptop, String catatan, double hargaJual){
        setTransaksi(tglTransaksi, pelanggan, sales, laptop, catatan, hargaJual);
    }

    public void setTransaksi(Date tglTransaksi, Pelanggan pelanggan, Sales sales, Laptop laptop, String catatan, double hargaJual){
        this.tglTransaksi = tglTransaksi;
        this.pelanggan = pelanggan;
        this.sales = sales;
        this.laptop = laptop;
        this.catatan = catatan;
        this.hargaJual = hargaJual;
    }

    public double getHargaJual(){
        return hargaJual;
    }

    public Laptop getLaptop(){
        return laptop;
    }

    public Pelanggan getPelanggan(){
        return pelanggan;
    }

    public Sales getSales(){
        return sales;
    }

    public String toString(){
        return String.format("%-16s%-12s%-8s%-24s%-16s%-8s", tglTransaksi, pelanggan.getNama(), sales.getNama(), laptop.getMerk() +" - " +laptop.getType(), catatan, hargaJual);
    }
}
