public class Main {
    public static void main(String[] args) {
        //Objek pertama
        Hewan hewan1 = new Hewan("Kucing","Mamalia", "Nyann~~");

        //Objek kedua
        Hewan hewan2 = new Hewan("Anjing","Mamalia","Woof-Woof!!");

        //Menampilkan informasi kedua hewan
        hewan1.tampilkaninfo();
        hewan2.tampilkaninfo();
    }
}