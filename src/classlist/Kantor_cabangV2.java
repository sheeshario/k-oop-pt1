package classlist;

import javax.swing.JOptionPane;
import abstractClass.PegawaiAbs;

public class Kantor_cabangV2 {

    public static final int MAX_ELEMENTS = 100;
    public static final String DEFAULT_STRING = "None";
    public static final int DEFAULT_INT = 0;

    private String kode_cabang;
    private String alamat;
    private String kota;
    private PegawaiAbs pimpinan;
    private PegawaiAbs[] listPegawai;
    private int jumPegawai;

    public Kantor_cabangV2() {
        this(DEFAULT_STRING, DEFAULT_STRING, DEFAULT_STRING, null, null,
        DEFAULT_INT);
    }

    public Kantor_cabangV2(String kode_cabang, String alamat, String kota, PegawaiAbs pimpinan, PegawaiAbs[] listPegawai,
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

    public PegawaiAbs getPimpinan() {
        return this.pimpinan;
    }

    public void setListPegawai(PegawaiAbs[] listPegawai, int jumPegawai) {
        setJumPegawai(jumPegawai);
        this.listPegawai = listPegawai;
    }

    public PegawaiAbs[] getPegawai() {
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

    public void setProfileKC(String kode_cabang, String alamat, String kota, PegawaiAbs pimpinan) {
        this.kode_cabang = kode_cabang;
        this.alamat = alamat;
        this.kota = kota;
        this.pimpinan = pimpinan;
    }

    public void setKantorCabang(String kode_cabang, String alamat, String kota, PegawaiAbs pimpinan, PegawaiAbs[] listPegawai,
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

    public boolean addPegawai(PegawaiAbs pegawai) {
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

    public PegawaiAbs getPegawaiGajiTerbesar() {
        PegawaiAbs gajiTerbesar = listPegawai[0];

        for (int i = 1; i < jumPegawai; i++) {
            if (listPegawai[i].getGajiPokok() > gajiTerbesar.getGajiPokok()) {
                gajiTerbesar = listPegawai[i];
            }
        }
        return gajiTerbesar;
    }

    public PegawaiAbs getPegawaiGajiTerkecil() {
        PegawaiAbs gajiTerkecil = listPegawai[0];

        for (int i = 1; i < jumPegawai; i++) {
            if (listPegawai[i].getGajiPokok() < gajiTerkecil.getGajiPokok()) {
                gajiTerkecil = listPegawai[i];
            }
        }
        return gajiTerkecil;
    }

    public String toString() {
        String toString = "== KC " +getKodeCabang() +" - " +getKota() +" ==\n";
        toString = toString + "List Pegawai:\n";
        toString = toString + String.format("%s  :  %s  :  %s  :  %s  :  %s  :  %s\n", "No", "NIP", "Nama",
                "Jabatan", "Etc (Tunjangan/Fungsional/JumBarang)", "Gaji") + "======================================================================================\n";
        for (int i = 0; i < jumPegawai; i++) {
            toString = toString + String.format("%s%-3s%-3s%s\n", (i + 1), ".", ":", listPegawai[i].toString());
        }
        toString = toString + "======================================================================================\n\n";

        return toString;
    }

    public void display() {
        JOptionPane.showMessageDialog(null, "Kode Cabang: " + getKodeCabang() + "\nPemimpin: " + getPimpinan()
                + "\nAlamat: " + getAlamat() + "\n" + toString(), "Cabang", JOptionPane.INFORMATION_MESSAGE);
    }
}
