import java.util.Scanner;
public class MataKuliah19 {
    String kodeMK, nama;
    int sks, jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode = " + kodeMK);
        System.out.println("Nama = " + nama);
        System.out.println("SKS = " + sks);
        System.out.println("Jumlah Jam = " + jumlahJam);

    }
    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        System.out.println("Sks berhasil diubah");
    }
    void tambahJam (int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }
    public MataKuliah19 () {

    }

    public MataKuliah19 (String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam=jumlahJam;

    }
}
