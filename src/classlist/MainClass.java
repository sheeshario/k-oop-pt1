package classlist;

import javax.swing.JOptionPane;

public class MainClass {
    
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen("P1000", "Adi Putra");
        dsn1.setEmail("adi@yahoo.com");
        Mahasiswa mhs1 = new Mahasiswa("005314200", "Ria", "");
        mhs1.setPembimbing(dsn1);
        mhs1.setEmail("ria@gmail.com");
        Dosen dsnSem = mhs1.getPembimbing();
        String nm = dsnSem.getNip();

        JOptionPane.showMessageDialog(null, "Pembimbing " +mhs1.getNim() +" adalah " +nm, "Pembimbing", JOptionPane.INFORMATION_MESSAGE);

        //Tambahan
        mhs1.setTglLahir(new Date(03,06,2002));
        dsn1.setTglLahir(new Date(31,12,1980));
        JOptionPane.showMessageDialog(null, mhs1.toString(), "Mahasiswa 1", JOptionPane.INFORMATION_MESSAGE);
    }
}
