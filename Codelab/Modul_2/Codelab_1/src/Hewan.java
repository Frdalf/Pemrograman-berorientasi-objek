public class Hewan {
    String nama;
    String jenis;
    String suara;

    // Constructor
    public Hewan(String nama,String jenis,String suara){
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Method menampilkan informasi hewan
    public void tampilkaninfo () {
        System.out.println("Nama :" + nama);
        System.out.println("Jenis :" + jenis);
        System.out.println("Suara :" + suara);
        System.out.println();
    }
}

