import java.util.Scanner;

public class Loginsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin017", "Password017");
        Mahasiswa mahasiswa = new Mahasiswa("Farid Al Farizi", "202410370110017");

        System.out.println("Pilihan login:");
        System.out.println("1. Login Admin");
        System.out.println("2. Login Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if(admin.login(username,password)) {
                admin.displayinfo();
            } else {
                System.out.println("Login gagal! username atau password salah");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nim: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama,nim)) {
                mahasiswa.displayinfo();
            } else {
                System.out.println("Login gagal! nama atau nim salah");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}