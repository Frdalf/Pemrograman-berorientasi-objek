import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;
import perpustakaan.Buku;
import perpustakaan.Anggota;

public class Main {
    public static void main(String[] args) {
        // Membuat buku
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri kelapa", "Lilius Hu");

        // Menampilkan informasi buku
        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        // Membuat anggota
        Anggota anggota1 = new Anggota("Farid Al Farizi", "B017");
        Anggota anggota2 = new Anggota("Syahrial Nur Faturrahman", "B009");

        // Menampilkan informasi anggota
        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();
        System.out.println();

        // Peminjaman buku
        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);
        System.out.println();

        // Pengembalian buku
        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}
