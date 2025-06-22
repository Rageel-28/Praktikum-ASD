public class MataKuliahMain19 {
    public static void main(String[] args) {
        MataKuliah19 mk1 = new MataKuliah19 ();
        mk1.kodeMK ="244107020136";
        mk1.nama = "Pemrograman Berbasis Objek";
        mk1.sks = 3;
        mk1.jumlahJam = 8;

        mk1.tampilInformasi() ;
        mk1.ubahSKS(7);
        mk1.tambahJam(2);
        mk1.kurangiJam(5);
        mk1.tampilInformasi() ;

        MataKuliah19 mk2= new MataKuliah19 ("230912370123", "Budi" , 2, 5);
        mk2.tampilInformasi();

    }
}