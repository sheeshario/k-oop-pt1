/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS.classlist;

import javax.swing.JOptionPane;

/**
 *
 * @author Dito
 */
public class Toko {

    public static final int DEFAULT_INT = 0;
    public static final String DEFAULT_STRING = "None";
    public static final int MAX_ELEMENT = 100;

    private String nama;
    private int kas;
    private Barang[] barang;
    private Pegawai[] pegawai;
    private int jumBarang;
    private int jumPegawai;

    public Toko() {
        this(DEFAULT_STRING, DEFAULT_INT, null, null);
    }

    public Toko(String nama, int kas) {
        this(nama, kas, null, null);
    }

    public Toko(String nama, int kas, Barang[] barang, Pegawai[] pegawai) {
        setToko(nama, kas, barang, pegawai);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKas(int kas) {
        if (kas < 0) {
            this.kas = 0;
        } else {
            this.kas = kas;
        }
    }

    public int getKas() {
        return kas;
    }

    public void setBarang(Barang[] listBarang) {
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i] != null) {
                barang[i] = listBarang[i];
                jumBarang++;
            }
        }
    }

    public Barang[] getBarang() {
        return barang;
    }

    public void setPegawai(Pegawai[] listPegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] != null) {
                pegawai[i] = listPegawai[i];
                jumPegawai++;
            }
        }
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }

    public void setJumBarang(int jumBarang) {
        this.jumBarang = jumBarang;
    }

    public int getJumBarang() {
        return jumBarang;
    }

    public void setJumPegawai(int jumPegawai) {
        this.jumPegawai = jumPegawai;
    }

    public int getJumPegawai() {
        return jumPegawai;
    }

    public void setToko(String nama, int kas, Barang[] barang, Pegawai[] pegawai) {
        this.barang = new Barang[MAX_ELEMENT];
        this.pegawai = new Pegawai[MAX_ELEMENT];
        setNama(nama);
        setKas(kas);
        if (barang != null)
            setBarang(barang);
        if (pegawai != null)
            setPegawai(pegawai);
    }

    // Return Obj type method
    public Toko addBarang(Barang barang) {
        if(jumBarang < MAX_ELEMENT){
            this.barang[jumBarang] = barang;
            jumBarang++;
        }
        return this;
    }

    public Toko addBarang(Barang[] barang) {
        for (int i = 0; i < barang.length; i++) {
            if(barang[i] != null){
                if(jumBarang >= MAX_ELEMENT){
                    break;
                }
                this.barang[jumBarang] = barang[i];
                jumBarang++;
            }
        }

        return this;
    }

    public Toko addPegawai(Pegawai pegawai) {
        if(jumPegawai < MAX_ELEMENT){
            this.pegawai[jumPegawai] = pegawai;
            jumPegawai++;
        }
        return this;
    }

    public Toko addPegawai(Pegawai[] pegawai) {
        for (int i = 0; i < pegawai.length; i++) {
            if(pegawai[i] != null){
                if(jumPegawai >= MAX_ELEMENT){
                    break;
                }
                this.pegawai[jumPegawai] = pegawai[i];
                jumPegawai++;
            }
        }
        return this;
    }

    public Toko removeBarang(int index) {
        barang[index - 1] = null;
        if (index != MAX_ELEMENT) {
            for (int i = index - 1; i < jumBarang; i++) {
                barang[i] = barang[i + 1];
            }
            jumBarang--;
        }
        return this;
    }

    public Toko removePegawai(int index) {
        pegawai[index - 1] = null;
        if (index != MAX_ELEMENT) {
            for (int i = index; i < jumPegawai; i++) {
                barang[i] = barang[i + 1];
            }
            jumPegawai--;
        }
        return this;
    }

    public String searchPegawai(String searchName) {
        if (pegawai[0] == null) {
            return "Pegawai = null!";
        } else {
            int i = 0;
            while (i < jumPegawai && !pegawai[i].getNama().equalsIgnoreCase(searchName)) {
                i++;
            }
            if (i == jumPegawai) {
                return searchName + " tidak ada di Array";
            } else {
                return "Ditemukan \"" + searchName + "\" pada posisi: " + (i + 1);
            }
        }
    }

    public String searchBarang(String searchName) {
        if (barang[0] == null) {
            return "Barang = null!";
        } else {
            int i = 0;
            while (i < jumBarang && !barang[i].getNama().equalsIgnoreCase(searchName)) {
                i++;
            }
            if (i == jumBarang) {
                return searchName + " tidak ada di Array";
            } else {
                return "Ditemukan \"" + searchName + "\" pada posisi: " + (i + 1);
            }
        }
    }

    public String listBarang() { // JOptionPane
        String listBarang = "List Barang:\n";
        listBarang = listBarang + String.format("%s  :  %s  :  %s  :  %s\n", "No", "NmBrg", "Harga", "Jumlah")
                + "===========================\n";
        for (int i = 0; i < jumBarang; i++) {
            listBarang = listBarang + String.format("%s%-4s%s", (i + 1), ".", barang[i].JOpToString());
        }
        listBarang = listBarang + "===========================\n\n";

        return listBarang;
    }

    public String listPegawai() { // JOptionPane
        String listPegawai = "List Pegawai:\n";
        listPegawai = listPegawai + String.format("%s  :  %s  :  %s  :  %s\n", "No", "NmPgw", "Gender", "Usia")
                + "=========================\n";
        for (int i = 0; i < jumPegawai; i++) {
            listPegawai = listPegawai + String.format("%s%-4s%s", (i + 1), ".", pegawai[i].JOpToString());
        }
        listPegawai = listPegawai + "=========================\n\n";

        return listPegawai;
    }

    public String tokoInfo() { // sout
        String toString;

        String profile = nama + "\n====================================\n" + "Kas: " + kas + "\n\n";
        String listPegawai = "List Pegawai:\n";
        listPegawai = listPegawai + String.format("%-4s%-16s%-10s%s\n", "No", "Nama Pegawai", "Gender", "Usia")
                + "==================================\n";
        for (int i = 0; i < jumPegawai; i++) {
            listPegawai = listPegawai + String.format("%s%-4s%s", (i + 1), ".", pegawai[i]);
        }
        listPegawai = listPegawai + "==================================\n\n";

        String listBarang = "List Barang:\n";
        listBarang = listBarang + String.format("%-4s%-16s%-10s%s\n", "No", "Nama Barang", "Harga", "Jumlah")
                + "====================================\n";
        for (int i = 0; i < jumBarang; i++) {
            listBarang = listBarang + String.format("%s%-4s%s", (i + 1), ".", barang[i]);
        }
        listBarang = listBarang + "====================================\n\n";

        toString = profile + listPegawai + listBarang;
        return toString;
    }

    @Override
    public String toString() {
        return nama + " : " + kas;
    }

    // Menu : showToko, Barang, Pegawai, Exit
    // Menu Barang : Show Barang, Add Barang, Edit Barang = Tambah barang/Kurang
    // barang, Remove Barang, Search Barang, Exit
    // Menu Pegawai : Show Pegawai, Add Pegawai, Edit Pegawai, Remove Pegawai,
    // Search Pegawai, Exit
    public void display() {
        boolean checker = true;
        do {
            String choose = JOptionPane.showInputDialog(null,
                    "1. Show Toko\n2. Barang\n3. Pegawai\n\nType \"0\" to back to the previous menu");

            if (choose == null) {
                break;
            }

            switch (choose) {
            case "0":
                checker = false;
                break;
            case "1": // show tokoInfo
                JOptionPane.showMessageDialog(null, "Kas: " + kas + "\n" + listBarang() + listPegawai(), nama,
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "2": // menu barang
                displayBarang();
                break;
            case "3": // menu pegawai
                displayPegawai();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        } while (checker);
    }

    // Menu Barang : Show Barang, Add Barang, Edit Barang = Edit Barang/Tambah
    // stock/Kurang stock, Remove Barang, Search Barang, Exit
    public void displayBarang() {
        boolean checker = true;
        do {
            try {
                String choose = JOptionPane.showInputDialog(null,
                        "1. Show Barang\n2. Add Barang\n3. Edit Barang\n4. Remove Barang\n5. Search Barang\n\nType \"0\" to back to the previous menu");

                if (choose == null) {
                    break;
                }

                switch (choose) {
                case "0":
                    checker = false;
                    break;
                case "1": // print barang
                    JOptionPane.showMessageDialog(null, listBarang(), nama, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "2": // tambah barang
                    String namaBarang = JOptionPane.showInputDialog(null, "Masukkan nama barang:");
                    if (namaBarang == null)
                        break;
                    int hargaBarang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan harga barang:"));
                    int qtyBarang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan banyak barang:"));
                    Barang newBarang = new Barang(namaBarang, hargaBarang, qtyBarang);
                    addBarang(newBarang);
                    JOptionPane.showMessageDialog(null, "Barang berhasil ditambah!", "SUCCESS",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3": // edit barang
                    displayEditBarang();
                    break;
                case "4": // remove barang
                    int chooseBarang = Integer.parseInt(JOptionPane.showInputDialog(null, listBarang()
                            + "\nPilih barang yang akan diremove: \nType \"0\" to back to the previous menu"));
                    if (chooseBarang == 0) {
                        break;
                    } else if (chooseBarang < 1 || chooseBarang > jumBarang) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        removeBarang(chooseBarang);
                        JOptionPane.showMessageDialog(null, "Barang berhasil diremove!", "SUCCESS",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "5": // search barang
                    String search = JOptionPane.showInputDialog(null,
                            "Nama barang yang ingin disearch: \n\nType \"0\" to back to the previous menu");
                    if (search.equalsIgnoreCase("0") || search.equalsIgnoreCase("")) {
                        break;
                    }
                    JOptionPane.showMessageDialog(null, searchBarang(search), "SEARCH RESULT",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } catch (NumberFormatException e) {
            }
        } while (checker);

    }

    // Menu : Edit Barang = Edit Barang/Tambah stock/Kurang stock
    public void displayEditBarang() {
        boolean checker = true;
        do {
            try {
                String choose = JOptionPane.showInputDialog(null,
                        "1. Edit Barang\n2. Tambah Stock/Qty\n3. Jual Barang\n\nType \"0\" to back to the previous menu");

                if (choose == null) {
                    break;
                }

                switch (choose) {
                case "0":
                    checker = false;
                    break;
                case "1": // edit barang
                    int chooseEdit = Integer.parseInt(
                            JOptionPane.showInputDialog(null, listBarang() + "\nPilih barang yang akan diEdit:",
                                    "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE));
                    if (chooseEdit < 1 || chooseEdit > jumBarang) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        String namaBarang = JOptionPane.showInputDialog(null, "Masukkan nama barang:",
                                "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE);

                        int hargaBarang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan harga barang:",
                                "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE));

                        int qtyBarang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan stock barang:",
                                "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE));

                        barang[chooseEdit - 1].setBarang(namaBarang, hargaBarang, qtyBarang);

                        JOptionPane.showMessageDialog(null, "Barang berhasil diEdit!", "SUCCESS",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "2": // tambah stock
                    chooseEdit = Integer.parseInt(
                            JOptionPane.showInputDialog(null, listBarang() + "\nPilih barang yang akan ditambah:",
                                    "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE));
                    if (chooseEdit < 1 || chooseEdit > jumBarang) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        int qtyBarang = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "Masukkan tambahan stock barang:",
                                        "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE));

                        if (qtyBarang < 0) {
                            JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            barang[chooseEdit - 1].addQty(qtyBarang);
                            JOptionPane.showMessageDialog(null, "Stock barang berhasil ditambah!", "SUCCESS",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    break;
                case "3": // jual barang
                    chooseEdit = Integer.parseInt(
                            JOptionPane.showInputDialog(null, listBarang() + "\nPilih barang yang akan dijual:",
                                    "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE));

                    int qtyBarang = Integer
                            .parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah barang yang ingin dijual:",
                                    "MENU EDIT BARANG", JOptionPane.INFORMATION_MESSAGE));

                    if (qtyBarang < 1) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (barang[chooseEdit - 1].getQty() < qtyBarang) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        int sellprice = barang[chooseEdit - 1].getHarga() * qtyBarang;
                        kas = kas + sellprice;
                        barang[chooseEdit - 1].sellQty(qtyBarang);

                        JOptionPane.showMessageDialog(null,
                                "Penjualan berhasil! Toko memperoleh kas sebesar: " + sellprice + " !!!", "PROFIT",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } catch (NumberFormatException e) {
            }

        } while (checker);
    }

    // Menu Pegawai : Show Pegawai, Add Pegawai, Edit Pegawai, Remove Pegawai,
    // Search Pegawai, Exit
    public void displayPegawai() {
        boolean checker = true;
        do {
            try {
                String choose = JOptionPane.showInputDialog(null,
                        "1. Show Pegawai\n2. Add Pegawai\n3. Edit Pegawai\n4. Remove Pegawai\n5. Search Pegawai\n\nType \"0\" to back to the main menu");

                if (choose == null) {
                    break;
                }

                switch (choose) {
                case "0":
                    checker = false;
                    break;
                case "1": // show pegawai
                    JOptionPane.showMessageDialog(null, listPegawai(), nama, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "2": // add pegawai
                    String namaPegawai = JOptionPane.showInputDialog(null, "Masukkan nama pegawai:");
                    String gender = JOptionPane.showInputDialog(null, "Masukkan gender pegawai (L/P):");
                    char genderPegawai = '0';
                    if (!gender.equalsIgnoreCase("")) {
                        genderPegawai = gender.charAt(0);
                    }
                    int usiaPegawai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan usia pegawai:"));
                    Pegawai newPegawai = new Pegawai(namaPegawai, genderPegawai, usiaPegawai);
                    addPegawai(newPegawai);
                    JOptionPane.showMessageDialog(null, "Pegawai berhasil ditambah!", "SUCCESS",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3": // edit pegawai
                    int chooseEdit = Integer.parseInt(
                            JOptionPane.showInputDialog(null, listPegawai() + "\nPilih pegawai yang akan diEdit:", nama,
                                    JOptionPane.INFORMATION_MESSAGE));

                    if (chooseEdit < 1 || chooseEdit > jumPegawai) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        namaPegawai = JOptionPane.showInputDialog(null, "Masukkan nama pegawai yang baru:",
                                JOptionPane.INFORMATION_MESSAGE);
                        gender = JOptionPane.showInputDialog(null, "Masukkan gender pegawai yang baru(L/P):");
                        genderPegawai = gender.charAt(0);
                        usiaPegawai = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "Masukkan usia pegawai yang baru:"));
                        pegawai[chooseEdit - 1].setPegawai(namaPegawai, genderPegawai, usiaPegawai);
                        JOptionPane.showMessageDialog(null, "Pegawai berhasil diEdit!", "SUCCESS",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "4": // remove pegawai
                    int choosePegawai = Integer.parseInt(JOptionPane.showInputDialog(null, listPegawai()
                            + "\nPilih pegawai yang akan diremove: \nType \"0\" to back to the previous menu"));
                    if (choosePegawai == 0) {
                        break;
                    } else if (choosePegawai < 1 || choosePegawai > jumPegawai) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please try again!", "ERROR",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        removePegawai(choosePegawai);
                        JOptionPane.showMessageDialog(null, "Pegawai berhasil diremove!", "SUCCESS",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "5": // search pegawai
                    String search = JOptionPane.showInputDialog(null,
                            "Nama pegawai yang ingin disearch: \n\nType \"0\" to back to the previous menu");
                    if (search.equalsIgnoreCase("0") || search.equalsIgnoreCase("")) {
                        break;
                    }
                    JOptionPane.showMessageDialog(null, searchPegawai(search), "SEARCH RESULT",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, wrong input! Please try again!", "ERROR",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } catch (NumberFormatException e) {

            }
        } while (checker);
    }
}
