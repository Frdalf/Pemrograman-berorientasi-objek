package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private String username;
    private String password;

    public Admin(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String input1, String input2) {
        return this.username.equals(input1) && this.password.equals(input2);
    }

    @Override
    public void manageItems() {
        System.out.println("=> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println("=> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n--- Menu Admin ---");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                manageItems();
            } else if (pilihan == 2) {
                manageUsers();
            } else if (pilihan == 0) {
                System.out.println("Logout berhasil.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}