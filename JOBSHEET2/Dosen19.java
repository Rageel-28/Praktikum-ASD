import java.util.Scanner;

public class Dosen19 {
    String idDosen , nama, bidangKeahlian ;
    boolean statusAktif ;
    int tahunBergabung ;

    public Dosen19() {
        this.idDosen = "Unknown";
        this.nama = "Unknown";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "Unknown";
    }

    public Dosen19(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }


    void tampilInformasi(int thnSekarang) {
        System.out.println("idDosen = " + idDosen );
        System.out.println("Nama = " + nama );
        if (statusAktif == true) {
            System.out.println("Status = Dosen Aktif");
        }else {
        System.out.println(     "Status=Dosen Tidak Aktif");}
        System.out.println("Tahun Bergabung = " + tahunBergabung);
        System.out.println("Bidang Keahlian ="+bidangKeahlian);
        System.out.println("Masa kerja = " +hitungMasaKerja(thnSekarang) + " tahun " );
        
    }
    void setStatusAktif (boolean status) {
        this.statusAktif = status ;
        

    }
    int hitungMasaKerja (int thnSekarang) {
        return thnSekarang - this.tahunBergabung;
        
        
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;

    }

}