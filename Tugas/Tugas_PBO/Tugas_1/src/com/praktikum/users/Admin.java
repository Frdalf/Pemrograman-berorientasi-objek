package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;

import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private String username;
    private String password;
    private static Scanner scanner = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayAppMenu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

            if (choice == 1) {
                manageItems();
            } else if (choice == 2) {
                manageUsers();
            } else if (choice == 0) {
                System.out.println("Logout...");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    @Override
    public void manageItems() {
        System.out.println("\n=== KELOLA LAPORAN BARANG ===");
        if (LoginSystem.reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan barang.");
            return;
        }

        System.out.println("Daftar Barang (Reported):");
        for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
            Item item = LoginSystem.reportedItems.get(i);
            System.out.println(i + ". " + item.getItemName() + " | " + item.getDescription() +
                    " | " + item.getLocation() + " | Status: " + item.getStatus());
        }

        System.out.print("Masukkan indeks barang yang ingin ditandai 'Claimed': ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < LoginSystem.reportedItems.size()) {
                LoginSystem.reportedItems.get(index).setStatus("Claimed");
                System.out.println("Status barang berhasil diubah menjadi 'Claimed'.");
            } else {
                System.out.println("Indeks tidak valid.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks barang tidak ditemukan.");
        }
    }

    @Override
    public void manageUsers() {
        System.out.println("\n=== KELOLA MAHASISWA ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        System.out.print("Pilih menu: ");

        int pilih = -1;
        try {
            pilih = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input harus angka!");
            return;
        }

        if (pilih == 1) {
            System.out.print("Masukkan nama Mahasiswa: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = scanner.nextLine();
            LoginSystem.userList.add(new Mahasiswa(nama, nim));
            System.out.println("Mahasiswa berhasil ditambahkan.");
        } else if (pilih == 2) {
            System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
            String nim = scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < LoginSystem.userList.size(); i++) {
                User u = LoginSystem.userList.get(i);
                if (u instanceof Mahasiswa m && m.getNim().equals(nim)) {
                    LoginSystem.userList.remove(i);
                    found = true;
                    System.out.println("Mahasiswa berhasil dihapus.");
                    break;
                }
            }
            if (!found) {
                System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
