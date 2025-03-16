public class karaktergame {
    private String nama;
    private int kesehatan;

    //constructor
    public karaktergame (String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    //getter dan setter
    public String getNama () {
        return nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public int getKesehatan () {
        return kesehatan = kesehatan;
    }

    public void setKesehatan (int kesehatan) {
        this.kesehatan = kesehatan;
    }

    //method yang akan di override subclass
    public void serang (karaktergame target) {
        System.out.println(nama + "menyerang" + target.getNama() + "!");
    }
}