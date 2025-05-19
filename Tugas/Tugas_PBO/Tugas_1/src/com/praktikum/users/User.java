package com.praktikum.users;

public abstract class User {
    protected String nama;
    protected String id; // bisa NIM untuk Mahasiswa, atau username untuk Admin

    public User(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public abstract boolean login(String input1, String input2);

    public abstract void displayAppMenu();
}
