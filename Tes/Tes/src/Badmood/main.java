public class main {
    public static void main(String[] args) {
        // Membuat objek buah1
        buah buah1 = new buah("Lemon", "Kuning", "C");

        // Membuat objek buah2
        buah buah2 = new buah("Mangga", "Hijau", "A, C dan E");

        // Memanggil method tampilkanInfo()
        buah1.tampilkanInfo();
        buah2.tampilkanInfo();
    }
}
