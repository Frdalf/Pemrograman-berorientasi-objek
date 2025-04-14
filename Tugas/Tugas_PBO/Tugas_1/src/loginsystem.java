import java.util.Scanner;

public class loginsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        admin admin = new admin();
        mahasiswa mahasiswa = new mahasiswa();

        System.out.println("Pilihan login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayinfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah");
            }

        } else {
            System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}
