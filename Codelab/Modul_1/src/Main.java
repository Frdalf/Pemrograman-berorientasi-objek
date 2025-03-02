import java.util.Scanner; // Mengimpor Kelas Scanner untuk input dari pengguna
import java.time.LocalDate; // Mengimpor LocalDate untuk mendapatkan tahun saat ini


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna

        System.out.print("Masukkan nama: "); // Meminta pengguna memasukkan Nama
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): "); // Meminta pengguna memasukkan Jenis kelamin.
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: "); // Meminta pengguna memasukkan Tahun Lahir.
        int tahunLahir = scanner.nextInt();

        scanner.close(); // Menutup scanner

        int tahunSekarang = LocalDate.now().getYear(); // Mendapatkan tahun saat ini menggunakan LocalDate
        int umur = tahunSekarang - tahunLahir; // Menghitung umur

        // Menentukan jenis kelamin
        String jenisKelaminText;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminText = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminText = "Perempuan";
        } else {
            jenisKelaminText = "Tidak diketahui";
        }

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminText);
        System.out.println("Umur          : " + umur + " tahun");
    }
}
