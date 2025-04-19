package PMB;

public class Calonmahasiswa {
    //property
    private String nama;
    private String alamat;
    private String tempatlahir;
    private String tempatsekolah;
    private String no_hp;
    private String email;
    private String [] pilihanjurusan;
    private String [] jalurpendaftaran

    public Calonmahasiswa (String namaDepan, String namaBelakang, String [] pilihanjurusan) {
        setNama(namaDepan,namaBelakang);
        setPilihanjurusan(pilihanjurusan);
    }

    public Calonmahasiswa (String namaDepan, String namaBelakang, String pilihanjurusan1, String pilihanjurusan2, String pilihanjurusan3) {
        setNama(namaDepan, namaBelakang);
        setPilihanjurusan(pilihanjurusan1, pilihanjurusan2, pilihanjurusan3);
    }

    //method

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPilihanjurusan(String[] pilihanjurusan) {
        this.pilihanjurusan = pilihanjurusan;
    }

    public void setPilihanjurusan(String pilihanjurusan1, String pilihanjurusan2, String pilihanjurusan3) {
        this.pilihanjurusan[0] = pilihanjurusan1;
        this.pilihanjurusan[1] = pilihanjurusan2;
        this.pilihanjurusan[2] = pilihanjurusan3;
    }

    public String getNama() {
        return nama;
    }

    public String[] getPilihanjurusan() {
        return pilihanjurusan;
    }
}
