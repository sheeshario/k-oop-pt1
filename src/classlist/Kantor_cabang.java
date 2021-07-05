package classlist;

import javax.swing.JOptionPane;

public class Kantor_cabang {

    public static final int MAX_ELEMENTS = 100;

    private String kode_cabang;
    private String alamat;
    private String kota;
    private Pegawai pimpinan;
    private Pegawai[] listPegawai;
    private int jumPegawai;

    public Kantor_cabang() {
        this(Pegawai.DEFAULT_STRING, Pegawai.DEFAULT_STRING, Pegawai.DEFAULT_STRING, null, null,
        Pegawai.DEFAULT_INT);
    }

    public Kantor_cabang(String kode_cabang, String alamat, String kota, Pegawai pimpinan, Pegawai[] listPegawai,
            int jumPegawai) {
        setKantorCabang(kode_cabang, alamat, kota, pimpinan, listPegawai, jumPegawai);
    }

    public String getKodeCabang() {
        return this.kode_cabang;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getKota() {
        return this.kota;
    }

    public Pegawai getPimpinan() {
        return this.pimpinan;
    }

    public void setListPegawai(Pegawai[] listPegawai, int jumPegawai) {
        setJumPegawai(jumPegawai);
        this.listPegawai = listPegawai;
    }

    public Pegawai[] getPegawai() {
        return this.listPegawai;
    }

    public void setJumPegawai(int jumPegawai) {
        if (jumPegawai > -1) {
            this.jumPegawai = jumPegawai;
        }
    }

    public int getJumPegawai() {
        return this.jumPegawai;
    }

    public void setProfileKC(String kode_cabang, String alamat, String kota, Pegawai pimpinan) {
        this.kode_cabang = kode_cabang;
        this.alamat = alamat;
        this.kota = kota;
        this.pimpinan = pimpinan;
    }

    public void setKantorCabang(String kode_cabang, String alamat, String kota, Pegawai pimpinan, Pegawai[] listPegawai,
            int jumPegawai) {
        this.kode_cabang = kode_cabang;
        this.alamat = alamat;
        this.kota = kota;
        this.pimpinan = pimpinan;
        setListPegawai(listPegawai, jumPegawai);
    }

    // return value method
    public int findPegawai(int nip) {
        int i = 0;
        while (i < jumPegawai && !(listPegawai[i].getNip() == nip)) {
            i++;
        }
        if (i == jumPegawai) {
            return -1;
        } else {
            return i;
        }
    }

    public int findPegawai(String nama) {
        int i = 0;
        while (i < jumPegawai) {
            int check = listPegawai[i].getNama().compareToIgnoreCase(nama);
            if(check != 0){
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public boolean addPegawai(Pegawai pegawai) {
        if (jumPegawai < MAX_ELEMENTS) {
            this.listPegawai[jumPegawai] = pegawai;
            jumPegawai++;
            return true;
        } else {
            return false;
        }
    }

    public boolean removePegawai(int index) {
        if (index < 0 || index > MAX_ELEMENTS || listPegawai[index] == null) {
            return false;
        } else {
            listPegawai[index] = listPegawai[jumPegawai - 1];
            listPegawai[jumPegawai - 1] = null;
            
            jumPegawai--;

            return true;
        }
    }

    public Pegawai getPegawaiGajiTerbesar() {
        Pegawai gajiTerbesar = listPegawai[0];

        for (int i = 1; i < jumPegawai; i++) {
            if (listPegawai[i].getGajiPokok() > gajiTerbesar.getGajiPokok()) {
                gajiTerbesar = listPegawai[i];
            }
        }
        return gajiTerbesar;
    }

    public Pegawai getPegawaiGajiTerkecil() {
        Pegawai gajiTerkecil = listPegawai[0];

        for (int i = 1; i < jumPegawai; i++) {
            if (listPegawai[i].getGajiPokok() < gajiTerkecil.getGajiPokok()) {
                gajiTerkecil = listPegawai[i];
            }
        }
        return gajiTerkecil;
    }

    public String toString() {
        String toString = "List Pegawai:\n";
        toString = toString + String.format("%s  :  %s  :  %s  :  %s  :  %s  :  %s  :  %s\n", "No", "NIP", "Nama",
                "Jabatan", "noHP", "TglLahir", "Gaji") + "===========================================\n";
        for (int i = 0; i < jumPegawai; i++) {
            toString = toString + String.format("%s%-4s%s\n", (i + 1), ".", listPegawai[i].toString());
        }
        toString = toString + "===========================================\n\n";

        return toString;
    }

    public void display() {
        JOptionPane.showMessageDialog(null, "Kode Cabang: " + getKodeCabang() + "\nPemimpin: " + getPimpinan()
                + "\nAlamat: " + getAlamat() + "\n" + toString(), "Cabang", JOptionPane.INFORMATION_MESSAGE);
    }
}
