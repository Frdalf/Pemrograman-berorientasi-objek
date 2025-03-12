import java.text.NumberFormat;
import java.util.Locale;

public class RekeningBank {
    //Variabel
    private String nomorrekening;
    private String namapemilik;
    private double saldo;

    //Construktor
    public RekeningBank(String nomorrekening, String namapemilik, double saldoawal){
        this.nomorrekening = nomorrekening;
        this.namapemilik = namapemilik;
        this.saldo = saldoawal;
    }

    //Menampilkan informasi rekening
    public void tampilkaninfo() {
        NumberFormat formatrupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Nomor rekening :" + nomorrekening);
        System.out.println("Nama Pemilik :" + namapemilik);
        System.out.println("Saldo :" + formatrupiah.format(saldo));
        System.out.println();
    }

    //menyetor uang ke rekening
    public void setoruang (double jumlah) {
        saldo += jumlah;
        System.out.printf("%s menyetor Rp%.2f. Saldo sekarang: Rp%.2f\n", namapemilik, jumlah, saldo);
    }

    //Menarik uang dari rekening
    public void tarikuang (double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.printf("%s menarik Rp%.2f. (Berhasil) Saldo sekarang Rp%.2f\n", namapemilik, jumlah, saldo);
        } else {
            System.out.printf("%s menarik Rp%.2f. (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp%2.f\n", namapemilik, jumlah, saldo);
        }
    }
}
