public class Main {
    public static void main(String[] args) {
        //Rekening 1
        RekeningBank rekening1 = new RekeningBank("202410370110017", "Farid Al Farizi", 10000000.0);
        //Rekening 2
        RekeningBank rekening2 = new RekeningBank("202410370110009", "Syahrial Nur Faturrahman", 100000.0);

        //Tampilkan info awal
        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        //Setor uang
        rekening1.setoruang(500000);
        rekening2.setoruang(100000);
        System.out.println();

        //Tarik uang
        rekening1.tarikuang(100000);
        rekening2.tarikuang(200000);
        System.out.println();

        //Info akhir
        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}
