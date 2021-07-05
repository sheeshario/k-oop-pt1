package testing;

public class User {
    private String namaLengkap;
    private String username;
    private String pass;

    public User(String username, String pass, String namaLengkap) {
        this.namaLengkap = namaLengkap;
        this.username = username;
        this.pass = pass;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
