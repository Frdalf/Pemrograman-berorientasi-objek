package com.praktikum.main;

import com.praktikum.users.*;
import com.praktikum.data.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    // Inisialisasi data default (Admin dan Mahasiswa)
    public static void initUsers() {
        userList.add(new Admin("admin017", "password017"));
        userList.add(new Mahasiswa("farid", "202410370110017"));
        userList.add(new Mahasiswa("robi", "202410370110002"));
    }

    // Metode login
    public static User login() {
        System.out.println("=== LOGIN ===");
        System.out.print("Masukkan username atau nama: ");
        String input1 = scanner.nextLine();
        System.out.print("Masukkan password atau NIM: ");
        String input2 = scanner.nextLine();

        for (User user : userList) {
            if (user instanceof Admin && ((Admin) user).login(input1, input2)) {
                return user;
            } else if (user instanceof Mahasiswa && ((Mahasiswa) user).login(input1, input2)) {
                return user;
            }
        }

        System.out.println("Login gagal. User tidak ditemukan.");
        return null;
    }

    // Program utama
    public static void main(String[] args) {
        initUsers();
        User loggedIn = login();
        if (loggedIn != null) {
            loggedIn.displayAppMenu();
        }
    }
}
