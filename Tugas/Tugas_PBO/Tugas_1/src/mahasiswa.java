public class mahasiswa {
    private String nama = "Farid Al Farizi";
    private String nim = "202410370110017";

    public boolean login(String inputnama, String inputnim) {
        return this.nama.equals(inputnama) && this.nim.equals(inputnim);
    }

    public void displayinfo() {
        System.out.println("Login mahasiswa berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
    }
}