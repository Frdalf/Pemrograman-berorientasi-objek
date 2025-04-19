package PMB;

public class calonmahasiswa {
    // Atribut
    private String nama;
    private String alamatAsal;
    private String tempatTanggalLahir;
    private String asalSekolah;
    private String noHp;
    private String email;
    private String[] pilihanJurusan;       // Misal: {"Teknik Informatika", "Sistem Informasi", "Teknik Elektro"}
    private String[] jalurPendaftaran;     // Misal: {"SNBP", "SNBT", "Mandiri"}

    // Constructor
    public CalonMahasiswa(String nama, String alamatAsal, String tempatTanggalLahir,
                          String asalSekolah, String noHp, String email,
                          String[] pilihanJurusan, String[] jalurPendaftaran) {
        this.nama = nama;
        this.alamatAsal = alamatAsal;
        this.tempatTanggalLahir = tempatTanggalLahir;
        this.asalSekolah = asalSekolah;
        this.noHp = noHp;
        this.email = email;
        this.pilihanJurusan = pilihanJurusan;
        this.jalurPendaftaran = jalurPendaftaran;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanData() {
        System.out.println("=== Data Calon Mahasiswa Baru ===");
        System.out.println("Nama                : " + nama);
        System.out.println("Alamat Asal         : " + alamatAsal);
        System.out.println("Tempat, Tanggal Lahir: " + tempatTanggalLahir);
        System.out.println("Asal Sekolah        : " + asalSekolah);
        System.out.println("No. HP              : " + noHp);
        System.out.println("Email               : " + email);

        System.out.println("Pilihan Jurusan     :");
        for (int i = 0; i < pilihanJurusan.length; i++) {
            System.out.println("  " + (i + 1) + ". " + pilihanJurusan[i]);
        }

        System.out.println("Jalur Pendaftaran   :");
        for (int i = 0; i < jalurPendaftaran.length; i++) {
            System.out.println("  " + (i + 1) + ". " + jalurPendaftaran[i]);
        }
    }
}
