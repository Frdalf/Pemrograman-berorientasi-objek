public class main {
    public static void main(String[] args) {

        karaktergame karakterumum = new karaktergame("karakter umum", 100);
        pahlawan brimstone = new pahlawan("brimstone", 150);
        musuh viper = new musuh("viper", 200);

        System.out.println("status awal");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        //pertarungan
        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}
