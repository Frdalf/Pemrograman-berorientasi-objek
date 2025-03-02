import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pilihan login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1){
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin017") && password.equals("Password017")){
                System.out.print("Login admin berhasil!");
            } else {
                System.out.print("Login gagal! Username atau password salah!");
            }
        }else if (pilihan == 2){
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (nama.equals("Farid Al Farizi") && nim.equals("202410370110017")){
                System.out.println("Login mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            }else {
                System.out.print("Login gagal! NIM atau nama salah!");
            }
        }else {
            System.out.print("Pilihan tidak valid!");
        }

        scanner.close();
    }
}