public class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    //Method login dasar berdasarkan nama dan NIM
    public boolean login(String input1, String input2) {
        return this.nama.equals(input1) && this.nim.equals(input2);
    }

    //Menampilkan informasi user secara umum
    public void displayinfo() {
        System.out.println("Informasi user");
    }
}
