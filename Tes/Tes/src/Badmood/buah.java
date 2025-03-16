public class buah {
    String nama;
    String warna;
    String vitamin;

    // Constructor
    public buah(String nama, String warna, String vitamin) {
        this.nama = nama;
        this.warna = warna;
        this.vitamin = vitamin;
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Vitamin: " + vitamin);
        System.out.println(); // untuk baris kosong setelah setiap info
    }
}
