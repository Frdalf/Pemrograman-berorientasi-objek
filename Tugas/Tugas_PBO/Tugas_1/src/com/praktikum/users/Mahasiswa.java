package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private String nama;
    private String nim;
    private static Scanner scanner = new Scanner(System.in);

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return this.nama.equals(inputNama) && this.nim.equals(inputNim);
    }

    @Override
    public void displayAppMenu() {
        int pilih = -1;
        while (pilih != 0) {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Laporkan Barang");
            System.out.println("2. Lihat Barang yang Dilaporkan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            try {
                pilih = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

            if (pilih == 1) {
                reportItem();
            } else if (pilih == 2) {
                viewReportedItems();
            } else if (pilih == 0) {
                System.out.println("Logout...");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    @Override
    public void reportItem() {
        System.out.print("Masukkan nama barang: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan deskripsi barang: ");
        String desc = scanner.nextLine();
        System.out.print("Masukkan lokasi ditemukan: ");
        String location = scanner.nextLine();

        Item item = new Item(name, desc, location, "Reported");
        LoginSystem.reportedItems.add(item);
        System.out.println("Barang berhasil dilaporkan!");
    }

    @Override
    public void viewReportedItems() {
        if (LoginSystem.reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan barang.");
            return;
        }

        System.out.println("=== Daftar Barang Dilaporkan ===");
        for (Item item : LoginSystem.reportedItems) {
            if (item.getStatus().equals("Reported")) {
                System.out.println("- " + item.getItemName() + " | " + item.getDescription() + " | " + item.getLocation());
            }
        }
    }

    public Object getNim() {
        return this.nim;
    }
}
