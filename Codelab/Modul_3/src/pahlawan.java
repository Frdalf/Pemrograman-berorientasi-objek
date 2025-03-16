public class pahlawan extends karaktergame {
    public pahlawan (String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang (karaktergame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan orbital strike!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}