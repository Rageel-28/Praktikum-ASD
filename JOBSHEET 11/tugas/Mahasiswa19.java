public class Mahasiswa19 {
    private String nama;
    private String nim;
    private String keperluan;

    public Mahasiswa19(String nama, String nim, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKeperluan() {
        return keperluan;
    }

  
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Keperluan: " + keperluan;
    }
}
