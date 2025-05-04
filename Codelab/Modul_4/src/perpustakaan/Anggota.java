package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void pinjamBuku(String judulBuku) {
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku);
    }

    public void pinjamBuku(String judulBuku, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judulBuku + "\" selama " + durasi + " hari.");
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judulBuku);
    }

    public void tampilkanInfo() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
    }
}
