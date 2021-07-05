package UTS2.classlist;

import java.util.Scanner;

public class Toko implements BerEmail {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in); //scanner khusus untuk sc.nextLine()

    public static final int DEFAULT_NUM = 0;
    public static final String DEFAULT_STRING = "None";
    public static final int MAX_ELEMENT = 100;
    public static final double RATE_DISKON = 10.0 / 100;

    private double kas;
    private String nama;
    private String email;
    private Laptop[] laptop;
    private Pegawai[] pegawai;
    private Pelanggan[] pelanggan; // bertambah seiring waktu
    private int jumPegawai;
    private int jumLaptop;
    private int jumPelanggan;
    private Transaksi[] listTransaksi; // bertambah seiring waktu
    private int jumTransaksi;

    public Toko() {
        this(DEFAULT_STRING, DEFAULT_NUM, DEFAULT_STRING, null, null);
    }

    public Toko(String nama, int kas, String email) {
        this(nama, kas, email, null, null);
    }

    public Toko(String nama, int kas, String email, Laptop[] laptop, Pegawai[] pegawai) {
        setToko(nama, kas, email, laptop, pegawai);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKas(double kas) {
        if (kas < 0) {
            this.kas = 0;
        } else {
            this.kas = kas;
        }
    }

    public double getKas() {
        return kas;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setLaptop(Laptop[] listLaptop) {
        for (int i = 0; i < listLaptop.length; i++) {
            if (listLaptop[i] != null) {
                laptop[i] = listLaptop[i];
                jumLaptop++;
            }
        }
    }

    public Laptop[] getLaptop() {
        return laptop;
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

    public void setPelanggan(Pelanggan[] listPelanggan) {
        for (int i = 0; i < listPelanggan.length; i++) {
            if (listPelanggan[i] != null) {
                pelanggan[i] = listPelanggan[i];
                jumPelanggan++;
            }
        }
    }

    public Pelanggan[] getPelanggan() {
        return pelanggan;
    }

    public void setJumLaptop(int jumLaptop) {
        this.jumLaptop = jumLaptop;
    }

    public int getJumLaptop() {
        return jumLaptop;
    }

    public void setJumPegawai(int jumPegawai) {
        this.jumPegawai = jumPegawai;
    }

    public int getJumPegawai() {
        return jumPegawai;
    }

    public void setJumPelanggan(int jumPelanggan) {
        this.jumPelanggan = jumPelanggan;
    }

    public int getJumPelanggan() {
        return jumPelanggan;
    }

    public void setToko(String nama, int kas, String email, Laptop[] laptop, Pegawai[] pegawai) {
        this.laptop = new Laptop[MAX_ELEMENT];
        this.pegawai = new Pegawai[MAX_ELEMENT];
        this.pelanggan = new Pelanggan[MAX_ELEMENT];
        this.listTransaksi = new Transaksi[31];
        setNama(nama);
        setKas(kas);
        setEmail(email);
        if (laptop != null)
            setLaptop(laptop);
        if (pegawai != null)
            setPegawai(pegawai);
        setJumPelanggan(0);
        setJumTransaksi(0);
    }

    public void setJumTransaksi(int jumTransaksi){
        this.jumTransaksi = jumTransaksi;
    }

    public int getJumTransaksi(){
        return jumTransaksi;
    }

    // Return Obj type method
    public Toko addLaptop(Laptop laptop) {
        if (jumLaptop < MAX_ELEMENT) {
            this.laptop[jumLaptop] = laptop;
            jumLaptop++;
        }
        return this;
    }

    public Toko addLaptop(Laptop[] laptop) {
        for (int i = 0; i < laptop.length; i++) {
            if (laptop[i] != null) {
                if (jumLaptop >= MAX_ELEMENT) {
                    break;
                }
                this.laptop[jumLaptop] = laptop[i];
                jumLaptop++;
            }
        }

        return this;
    }

    public Toko addPegawai(Pegawai pegawai) {
        if (jumPegawai < MAX_ELEMENT) {
            this.pegawai[jumPegawai] = pegawai;
            jumPegawai++;
        }
        return this;
    }

    public Toko addPegawai(Pegawai[] pegawai) {
        for (int i = 0; i < pegawai.length; i++) {
            if (pegawai[i] != null) {
                if (jumPegawai >= MAX_ELEMENT) {
                    break;
                }
                this.pegawai[jumPegawai] = pegawai[i];
                jumPegawai++;
            }
        }
        return this;
    }

    public Toko removeLaptop(int index) {
        laptop[index - 1] = null;
        if (index != MAX_ELEMENT) {
            for (int i = index - 1; i < jumLaptop; i++) {
                laptop[i] = laptop[i + 1];
            }
            jumLaptop--;
        }
        return this;
    }

    public Toko removePegawai(int index) {
        pegawai[index - 1] = null;
        if (index != MAX_ELEMENT) {
            for (int i = index - 1; i < jumPegawai; i++) {
                pegawai[i] = pegawai[i + 1];
            }
            jumPegawai--;
        }
        return this;
    }

    public Toko addPelanggan(Pelanggan pelanggan) {
        if (jumPelanggan < MAX_ELEMENT) {
            this.pelanggan[jumPelanggan] = pelanggan;
            jumPelanggan++;
        }
        return this;
    }

    public Toko removePelanggan(int index) {
        pelanggan[index - 1] = null;
        if (index != MAX_ELEMENT) {
            for (int i = index - 1; i < jumPelanggan; i++) {
                pelanggan[i] = pelanggan[i + 1];
            }
            jumPelanggan--;
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
                return searchName + " tidak ada di listPegawai";
            } else {
                return "Ditemukan \"" + searchName + "\" pada posisi: " + (i + 1);
            }
        }
    }

    public String searchLaptop(String searchName) {
        if (laptop[0] == null) {
            return "Laptop = null!";
        } else {
            int i = 0;
            while (i < jumLaptop && !laptop[i].getMerk().equalsIgnoreCase(searchName)
                    && i < jumLaptop && !laptop[i].getType().equalsIgnoreCase(searchName)) {
                i++;
            }
            if (i == jumLaptop) {
                return searchName + " tidak ada di listLaptop";
            } else {
                return "Ditemukan \"" + searchName + "\" pada posisi: " + (i + 1);
            }
        }
    }

    public Toko addTransaksi(Transaksi listTransaksi) {
        if (jumTransaksi < 31) {
            this.listTransaksi[jumTransaksi] = listTransaksi;
            jumTransaksi++;
        }
        return this;
    }

    public Toko removeTransaksi(int index) {
        listTransaksi[index - 1] = null;
        if (index != MAX_ELEMENT) {
            for (int i = index - 1; i < jumTransaksi; i++) {
                listTransaksi[i] = listTransaksi[i + 1];
            }
            jumTransaksi--;
        }
        return this;
    }

    public String listLaptop() {
        String temp = "\nList Laptop:\n======================================================================\n";
        temp = temp + String.format("%-4s%-12s%-12s%-12s%-16s%-8s%n", "No.", "Merk", "Type", "Warna", "Spek", "Harga");
        temp = temp + "======================================================================\n";
        for (int i = 0; i < jumLaptop; i++) {
            temp = temp + String.format("%-4s%s%n", (i + 1), laptop[i]);
        }
        temp = temp + "======================================================================\n";
        return temp;
    }

    public String listPegawai() {
        String temp = "\nList Pegawai:\n============================================================\n";
        temp = temp + String.format("%-4s%-12s%-6s%-18s%-8s%-8s%n", "No.", "Jabatan", "Nip", "Nama", "Etc", "Gaji Total");
        temp = temp + "============================================================\n";
        for (int i = 0; i < jumPegawai; i++) {
            temp = temp + String.format("%-4s%s%n", (i + 1), pegawai[i]);
        }
        temp = temp + "============================================================\n";
        return temp;
    }

    public String listPelanggan(){
        String temp = "\nList Pelanggan:\n======================================================\n";
        temp = temp + String.format("%-4s%-16s%-20s%-14s%n", "No.", "Nama", "Email", "JumBeli");
        temp = temp + "======================================================\n";
        for (int i = 0; i < jumPelanggan; i++) {
            temp = temp + String.format("%-4s%s%n", (i + 1), pelanggan[i]);
        }
        temp = temp + "======================================================\n";
        return temp;
    }

    public String listTransaksi() {
        String temp = "\nList Transaksi:\n============================================================================================\n";
        temp = temp + String.format("%-4s%-16s%-12s%-8s%-24s%-16s%-8s%n", "No.", "Tgl Transaksi", "Pelanggan" , "Sales", "Laptop", "Catatan", "Harga Jual");
        temp = temp + "============================================================================================\n";
        for (int i = 0; i < jumTransaksi; i++) {
            temp = temp + String.format("%-4s%s%n", (i + 1), listTransaksi[i]);
        }
        temp = temp + "============================================================================================\n";
        return temp;
    }

    @Override
    public String toString() {
        return "Nama : Kas : JumPegawai : JumLaptop : JumPelanggan : JumTransaksi\n======================================================\n" + nama
                + " : " + kas + " : " + jumPegawai + " : " + jumLaptop +" : " + jumPelanggan +" : " + jumTransaksi;
    }

    // MENU TOKO
    public void MenuPegawai(){  //list, add, edit, remove, search
        do{
            System.out.println("\n== MENU PEGAWAI == Kas: " +kas);
            System.out.print(    "1. Show List\n"
                                +"2. Add Pegawai Baru\n"
                                +"3. Edit Pegawai\n"
                                +"4. Remove Pegawai\n"
                                +"5. Search Pegawai - Nama\n"
                                +"0. Exit Menu\n"
                                +">> ");
            String choose = sc.next();
            //var untuk mengStore data
            String tempNama, tempEmail;
            int tempNip, tempTunjangan, tempJmlhBarang, tempGaji, chooseInt;
            switch (choose) {
                case "1":   //show
                    System.out.println(listPegawai());
                    break;
                
                case "2":   //add
                    //show list + input data Pegawai (umum)
                    System.out.println(listPegawai());
                    System.out.print("\nNama Pegawai baru: ");
                    tempNama = sc.next();
                    System.out.print("NIP Pegawai baru: ");
                    tempNip = sc.nextInt();
                    System.out.print("Email Pegawai baru: ");
                    tempEmail = sc.next();
                    System.out.print("Gaji Pokok Pegawai baru: ");
                    tempGaji = sc.nextInt();

                    //input data pegawai (spesifik)
                    System.out.print("\nPilih Kategori Pegawai:"
                                        +"\n1. Manajer"
                                        +"\n2. Sales"
                                        +"\n3. Karyawan"
                                        +"\n>> ");
                    do{
                        choose = sc.next();
                        if(choose.equals("1")){
                            System.out.print("Tunjangan Manajer baru: ");
                            tempTunjangan = sc.nextInt();
                            //add pegawai
                            Manejer pegawaiBaru = new Manejer(tempNip, tempNama, tempEmail, tempGaji, tempTunjangan);
                            addPegawai(pegawaiBaru);

                            break;
                        } else if (choose.equals("2")){
                            System.out.print("Jumlah Barang Sales baru: ");
                            tempJmlhBarang = sc.nextInt();
                            //add pegawai
                            Sales pegawaiBaru = new Sales(tempNip, tempNama, tempEmail, tempGaji, tempJmlhBarang);
                            addPegawai(pegawaiBaru);

                            break;
                        } else if (choose.equals("3")){
                            //add pegawai
                            Karyawan pegawaiBaru = new Karyawan(tempNip, tempNama, tempEmail, tempGaji);
                            addPegawai(pegawaiBaru);

                            break;
                        } else {
                            System.out.println("Invalid input!");
                        }
                    }while(true);
                    System.out.println("Add Pegawai berhasil...");
                    break;

                case "3":   //edit
                    System.out.println(listPegawai());
                    if(pegawai[0] == null)
                        break;
                    System.out.print("\nPilih pegawai yang ingin di edit: ");
                    do{
                        chooseInt = sc.nextInt();
                    }while(chooseInt < 1 || chooseInt > jumPegawai);
                    //input data pegawai (umum)
                    System.out.print("\nNama Pegawai edit: ");
                    tempNama = sc.next();
                    System.out.print("NIP Pegawai edit: ");
                    tempNip = sc.nextInt();
                    System.out.print("Email Pegawai edit: ");
                    tempEmail = sc.next();
                    System.out.print("Gaji Pokok Pegawai edit: ");
                    tempGaji = sc.nextInt();
                    if(pegawai[chooseInt - 1] instanceof Manejer){
                        System.out.print("Tunjangan Pegawai edit: ");
                        tempTunjangan = sc.nextInt();
                        ((Manejer) pegawai[chooseInt - 1]).setPegawai(tempNip, tempNama, tempEmail, tempGaji, tempTunjangan);
                    } else if(pegawai[chooseInt - 1] instanceof Sales){
                        System.out.print("Jumlah Barang Pegawai edit: ");
                        tempJmlhBarang = sc.nextInt();
                        ((Sales) pegawai[chooseInt - 1]).setPegawai(tempNip, tempNama, tempEmail, tempGaji, tempJmlhBarang);
                    } else {
                        ((Karyawan) pegawai[chooseInt - 1]).setPegawai(tempNip, tempNama, tempEmail, tempGaji);
                    }
                    System.out.println("Edit Pegawai berhasil...");
                    break;

                case "4":   //remove
                    System.out.println(listPegawai());
                    if(pegawai[0] == null)
                        break;
                    System.out.print("\nPilih pegawai yang ingin di remove: ");
                    do{
                    chooseInt = sc.nextInt();
                    }while(chooseInt < 1 || chooseInt > jumPegawai);
                    removePegawai(chooseInt);
                    System.out.println("Remove pegawai berhasil...");
                    break;

                case "5":   //search
                    System.out.print("Masukkan keyword untuk searching: ");
                    choose = sc.next();
                    System.out.println("Mengsearch " +choose +"...");
                    System.out.println(searchPegawai(choose));
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Input tidak sesuai! Silahkan coba lagi...");
                    break;
            }
        }while(true);
    }

    public void MenuLaptop() { // list, add, edit, remove, search
        do{
            System.out.println("\n== MENU LAPTOP == Kas: " +kas);
            System.out.print(    "1. Show List\n"
                                +"2. Add Laptop Baru\n"
                                +"3. Edit Laptop\n"
                                +"4. Remove Laptop\n"
                                +"5. Search Laptop - Merk/Type\n"
                                +"0. Exit Menu\n"
                                +">> ");
            String choose = sc.next();
            //var untuk mengStore data
            String tempType, tempWarna, tempSpek;
            int tempHarga, chooseInt;
            switch (choose) {
                case "1":   //show
                    System.out.println(listLaptop());
                    break;
                
                case "2":   //add
                    //show list
                    System.out.println(listLaptop());

                    //input data laptop (spesifik) + (umum)
                    System.out.print("\nPilih Merk Laptop yang ingin ditambahkan:"
                                        +"\n1. Acer"
                                        +"\n2. Asus"
                                        +"\n3. Lenovo"
                                        +"\n>> ");
                    do{
                        choose = sc.next();
                        System.out.print("\nType Laptop baru: ");
                        tempType = sc.next();
                        System.out.print("Warna Laptop baru: ");
                        tempWarna = sc.next();
                        System.out.print("Spesifikasi Laptop baru: ");
                        tempSpek = sc2.nextLine();
                        System.out.print("Harga Laptop baru: ");
                        tempHarga = sc.nextInt();
                        if(choose.equals("1")){
                            Acer laptopBaru = new Acer(tempType);
                            laptopBaru.setWarna(tempWarna);
                            laptopBaru.setSpesifikasi(tempSpek);
                            laptopBaru.setHarga(tempHarga);
                            addLaptop(laptopBaru);

                            break;
                        } else if (choose.equals("2")){
                            Asus laptopBaru = new Asus(tempType);
                            laptopBaru.setWarna(tempWarna);
                            laptopBaru.setSpesifikasi(tempSpek);
                            laptopBaru.setHarga(tempHarga);
                            addLaptop(laptopBaru);

                            break;
                        } else if (choose.equals("3")){
                            Lenovo laptopBaru = new Lenovo(tempType);
                            laptopBaru.setWarna(tempWarna);
                            laptopBaru.setSpesifikasi(tempSpek);
                            laptopBaru.setHarga(tempHarga);
                            addLaptop(laptopBaru);

                            break;
                        } else {
                            System.out.println("Invalid input!");
                        }
                    }while(true);
                    
                    System.out.println("Add Laptop berhasil...");
                    break;

                case "3":   //edit
                    System.out.println(listLaptop());
                    if(laptop[0] == null)
                        break;
                    System.out.print("\nPilih laptop yang ingin di edit: ");
                    do{
                        chooseInt = sc.nextInt();
                    }while(chooseInt < 1 || chooseInt > jumLaptop);
                    //input data laptop (umum)
                    System.out.print("\nType Laptop edit: ");
                    tempType = sc.next();
                    System.out.print("Warna Laptop edit: ");
                    tempWarna = sc.next();
                    System.out.print("Spesifikasi Laptop edit: ");
                    tempSpek = sc2.nextLine();
                    System.out.print("Harga Laptop edit: ");
                    tempHarga = sc.nextInt();
                    if(laptop[chooseInt - 1] instanceof Acer){
                        ((Acer) laptop[chooseInt - 1]).setType(tempType);
                        ((Acer) laptop[chooseInt - 1]).setWarna(tempWarna);
                        ((Acer) laptop[chooseInt - 1]).setSpesifikasi(tempSpek);
                        ((Acer) laptop[chooseInt - 1]).setHarga(tempHarga);
                    } else if(laptop[chooseInt - 1] instanceof Asus){
                        ((Asus) laptop[chooseInt - 1]).setType(tempType);
                        ((Asus) laptop[chooseInt - 1]).setWarna(tempWarna);
                        ((Asus) laptop[chooseInt - 1]).setSpesifikasi(tempSpek);
                        ((Asus) laptop[chooseInt - 1]).setHarga(tempHarga);
                    } else {
                        ((Lenovo) laptop[chooseInt - 1]).setType(tempType);
                        ((Lenovo) laptop[chooseInt - 1]).setWarna(tempWarna);
                        ((Lenovo) laptop[chooseInt - 1]).setSpesifikasi(tempSpek);
                        ((Lenovo) laptop[chooseInt - 1]).setHarga(tempHarga);
                    }
                    System.out.println("Edit Laptop berhasil...");
                    break;

                case "4":   //remove
                    System.out.println(listLaptop());
                    if(laptop[0] == null)
                        break;
                    System.out.print("\nPilih laptop yang ingin di remove: ");
                    do{
                    chooseInt = sc.nextInt();
                    }while(chooseInt < 1 || chooseInt > jumLaptop);
                    removeLaptop(chooseInt);
                    System.out.println("Remove laptop berhasil...");
                    break;

                case "5":   //search
                    System.out.print("Masukkan keyword untuk searching: ");
                    choose = sc.next();
                    System.out.println("Mengsearch " +choose +"...");
                    System.out.println(searchLaptop(choose));
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Input tidak sesuai! Silahkan coba lagi...");
                    break;
            }
        }while(true);
    }

    public void MenuPelanggan() { // list, add, edit, remove
        do{
            System.out.println("\n== MENU PELANGGAN == Kas: " +kas);
            System.out.print(    "1. Show List\n"
                                +"2. Add Pelanggan Baru\n"
                                +"3. Edit Pelanggan\n"
                                +"4. Remove Pelanggan\n"
                                +"0. Exit Menu\n"
                                +">> ");
            String choose = sc.next();
            //var untuk mengStore data
            String tempNama, tempEmail;
            int tempJumBeli, chooseInt;
            switch (choose) {
                case "1":   //show
                    System.out.println(listPelanggan());
                    break;
                
                case "2":   //add
                    //show list
                    System.out.println(listPelanggan());
                    //add Pelanggan - input data
                    System.out.print("\nMasukkan nama pelanggan: ");
                    tempNama = sc.next();
                    System.out.print("Masukkan email pelanggan: ");
                    tempEmail = sc.next();
                    System.out.print("Masukkan jumlah beli pelanggan: ");
                    tempJumBeli = sc.nextInt();

                    Pelanggan pelangganBaru = new Pelanggan(tempNama, tempEmail, tempJumBeli);
                    addPelanggan(pelangganBaru);
                    
                    System.out.println("Add Pelanggan berhasil...");
                    break;

                case "3":   //edit
                    System.out.println(listPelanggan());
                    if(pelanggan[0] == null)
                        break;
                    System.out.print("\nPilih pelanggan yang ingin di edit: ");
                    do{
                        chooseInt = sc.nextInt();
                    }while(chooseInt < 1 || chooseInt > jumPelanggan);
                    //input data pelanggan
                    System.out.print("Masukkan nama pelanggan: ");
                    tempNama = sc.next();
                    System.out.print("Masukkan email pelanggan: ");
                    tempEmail = sc.next();
                    System.out.print("Masukkan jumlah beli pelanggan: ");
                    tempJumBeli = sc.nextInt();
                    //setPelanggan
                    pelanggan[chooseInt - 1].setPelanggan(tempNama, tempEmail, tempJumBeli);
                    
                    System.out.println("Edit Pelanggan berhasil...");
                    break;

                case "4":   //remove
                    System.out.println(listPelanggan());
                    if(pelanggan[0] == null)
                        break;
                    System.out.print("\nPilih pelanggan yang ingin di remove: ");
                    do{
                    chooseInt = sc.nextInt();
                    }while(chooseInt < 1 || chooseInt > jumPelanggan);
                    removePelanggan(chooseInt);
                    System.out.println("Remove pelanggan berhasil...");
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Input tidak sesuai! Silahkan coba lagi...");
                    break;
            }
        }while(true);
    }

    public void MenuTransaksi() { // show, add, edit, remove
        do{
            System.out.println("\n== MENU TRANSAKSI == Kas: " +kas);
            System.out.print(    "1. Show List\n"
                                +"2. Add Transaksi Baru - Jual Laptop\n"
                                +"3. Remove Transaksi\n"
                                +"0. Exit Menu\n"
                                +">> ");
            String choose = sc.next();
            //var untuk mengStore data
            String tempCatatan;
            double tempHargaJual;
            int chooseInt, hari, bulan, tahun, tempPelanggan, tempSales, tempLaptop;
            switch (choose) {
                case "1":   //show
                    System.out.println(listTransaksi());
                    break;
                
                case "2":   //add
                    //add Transaksi - input data
                    if(pelanggan[0] == null || laptop[0] == null)
                        break;

                    //show list
                    System.out.println(listTransaksi());

                    System.out.println("\nMasukkan tanggal transaksi (int): ");
                    System.out.print("Hari: ");
                    hari = sc.nextInt();
                    System.out.print("Bulan: ");
                    bulan = sc.nextInt();
                    System.out.print("Tahun: ");
                    tahun = sc.nextInt();
                    System.out.println("Input tanggal selesai...");

                    System.out.println(listPelanggan());
                    System.out.print("\nPilih pelanggan yang melakukan transaksi: ");
                    do{
                        tempPelanggan = sc.nextInt();
                    }while(tempPelanggan < 1 || tempPelanggan > jumPelanggan);
                    System.out.println("Input Pelanggan selesai...");

                    System.out.println(listPegawai());
                    System.out.print("\nPilih Sales yang telah melakukan transaksi: ");
                    do{
                        tempSales = sc.nextInt();
                    }while(tempSales < 1 || tempSales > jumPegawai || !(pegawai[tempSales - 1] instanceof Sales));
                    System.out.println("Input Sales selesai...");

                    System.out.println(listLaptop());
                    System.out.print("\nPilih laptop yang ingin dijual: ");
                    do{
                        tempLaptop = sc.nextInt();
                    }while(tempLaptop < 1 || tempLaptop > jumLaptop);
                    System.out.println("Input Laptop selesai...");

                    System.out.print("Input Catatan: ");
                    tempCatatan = sc2.nextLine();
                    System.out.println("Input Catatan selesai...");

                    //calculate jualbeli / harga jualbeli
                    tempHargaJual = laptop[tempLaptop - 1].getHarga() - (laptop[tempLaptop - 1].getHarga() * (RATE_DISKON * pelanggan[tempPelanggan - 1].getJumBeli()));
                    if(tempHargaJual < 0){
                        tempHargaJual = 0;
                    }

                    //tambah jumBeli karena pelanggan telah membeli barang
                    pelanggan[tempPelanggan - 1].setJumBeli(pelanggan[tempPelanggan - 1].getJumBeli() + 1);

                    //add jmlhBarang sales + 1 - jmlhBarang++ di kelas Sales
                    ((Sales) pegawai[tempSales - 1]).setJmblhbrng(((Sales) pegawai[tempSales - 1]).getJmblhbrng() + 1);

                    //tambah kas di toko
                    kas = kas + tempHargaJual;

                    Transaksi transaksiBaru = new Transaksi(new Date(hari, bulan, tahun), pelanggan[tempPelanggan - 1], ((Sales) pegawai[tempSales - 1]), laptop[tempLaptop - 1], tempCatatan, tempHargaJual);
                    addTransaksi(transaksiBaru);

                    //remove laptop karena telah terjual
                    removeLaptop(tempLaptop);
                        
                    System.out.println("Add Transaksi berhasil...");
                    
                    break;

                case "3":   //remove
                    System.out.println(listTransaksi());
                    if(listTransaksi[0] == null)
                        break;
                    System.out.print("\nPilih transaksi yang ingin di remove: ");
                    do{
                        chooseInt = sc.nextInt();
                    }while(chooseInt < 1 || chooseInt > jumTransaksi);
    
                    //adjust data yang telah diinput di Transaksi
                    //kurangi kas
                    kas = kas - listTransaksi[chooseInt - 1].getHargaJual();
    
                    //kurangi jumBeli karena menghapus data pelanggan yang telah membeli barang
                    listTransaksi[chooseInt - 1].getPelanggan().setJumBeli(listTransaksi[chooseInt - 1].getPelanggan().getJumBeli() - 1);
    
                    //kurangi jmlhBarang sales sebanyak - 1 / jmlhBarang-- di kelas Sales
                    listTransaksi[chooseInt - 1].getSales().setJmblhbrng(listTransaksi[chooseInt - 1].getSales().getJmblhbrng() - 1);
                        
                    //add laptop yang  telah terjual
                    addLaptop(listTransaksi[chooseInt - 1].getLaptop());

                    removeTransaksi(chooseInt);
                    System.out.println("Remove Transaksi berhasil...");

                    break;

                case "0":
                    return;

                default:
                    System.out.println("Input tidak sesuai! Silahkan coba lagi...");
                    break;
                }
        }while(true);
    }

    public void ContactList(){
        BerEmail[] listEmail = new BerEmail[MAX_ELEMENT];
        //email Pegawai
        for (int i = 0; i < jumPegawai; i++) {
            listEmail[i] = pegawai[i];
        }
        //email Pelanggan
        for (int i = 0; i < jumPelanggan; i++) {
            listEmail[i+jumPegawai] = pelanggan[i];
        }

        //print
        System.out.println("        Email Pegawai:\n");
        for (int i = 0; i < listEmail.length; i++) {
            if(listEmail[i] != null && listEmail[i] instanceof Pegawai)
                System.out.printf("%-4s%-20s%n", (i+1) , listEmail[i].getEmail());
        }
        System.out.println("\n        Email Pelanggan:\n");
        for (int i = 0; i < listEmail.length; i++) {
            if(listEmail[i] != null && listEmail[i] instanceof Pelanggan)
                System.out.printf("%-4s%-20s%n", (i+1) , listEmail[i].getEmail());
        }
    }
}
