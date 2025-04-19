public class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String input1, String input2) {
        return getNama().equals(input1) && getNim().equals(input2);
    }

    @Override
    public void displayinfo() {
        System.out.println("Login Mahasiswa berhasil");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}