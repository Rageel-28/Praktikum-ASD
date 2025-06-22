public class Mahasiswa19 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo(int nomor) {
        System.out.println("Data Mahasiswa ke-" + nomor);
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Kelas  : " + kelas);
        System.out.println("IPK    : " + ipk);
        System.out.println("--------------------------------------");
    }
}