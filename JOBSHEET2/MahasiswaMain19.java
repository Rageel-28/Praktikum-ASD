public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19 mhs1 = new Mahasiswa19 () ;
        mhs1.nama = "Muhammad ali farhan ";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa19 mhs2 = new Mahasiswa19("Annisa nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa19 mhsrakagali = new Mahasiswa19("Rakagali Resda krisandi Putra", "244107020136 ", 2.9, "TI 1B");
        mhsrakagali.tampilkanInformasi();
        mhsrakagali.updateIpk(3.83);
        mhsrakagali.tampilkanInformasi();
    }
}