package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class Loginsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin017", "Password017");
        Mahasiswa mahasiswa = new Mahasiswa("Farid Al Farizi", "202410370110017");

        System.out.println("Pilihan Login:");
        System.out.println("1. Login Admin");
        System.out.println("2. Login Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt(); scanner.nextLine();

        User user = null;

        if (pilihan == 1) {
            System.out.print("Username: ");
            String userInput = scanner.nextLine();
            System.out.print("Password: ");
            String passInput = scanner.nextLine();

            if (admin.login(userInput, passInput)) {
                user = admin;
            } else {
                System.out.println("Login gagal. Username/password salah.");
            }

        } else if (pilihan == 2) {
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                user = mahasiswa;
            } else {
                System.out.println("Login gagal. Nama/NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        if (user != null) {
            user.displayAppMenu(); // Polymorphic call
        }
    }
}
