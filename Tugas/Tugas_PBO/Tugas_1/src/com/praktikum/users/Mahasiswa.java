package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String input1, String input2) {
        return nama.equals(input1) && nim.equals(input2);
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Lokasi Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("\nBarang berhasil dilaporkan!");
        System.out.println("Detail:");
        System.out.println("Nama: " + namaBarang);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Lokasi: " + lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n--- Menu Mahasiswa ---");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                reportItem();
            } else if (pilihan == 2) {
                viewReportedItems();
            } else if (pilihan == 0) {
                System.out.println("Logout berhasil.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
