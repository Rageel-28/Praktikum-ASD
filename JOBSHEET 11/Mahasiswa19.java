public class Mahasiswa19 {
    String nm, name, kls;
    double ip;

    Mahasiswa19() {
    }

    Mahasiswa19(String nim, String nama, String kelas, double ipk) {
        nm = nim;
        name = nama;
        kls = kelas;
        ip = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM   : " + nm);
        System.out.println("Nama  : " + name);
        System.out.println("Kelas : " + kls);
        System.out.println("IPK   : " + ip);
    }
}
