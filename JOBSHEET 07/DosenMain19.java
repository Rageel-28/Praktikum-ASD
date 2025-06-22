import java.util.Scanner;
class DosenMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 data = new DataDosen19();

        while (true) {
            System.out.println("\n==== Menu Data Dosen ====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Cari Dosen berdasarkan Nama (Sequential Search)");
            System.out.println("6. Cari Dosen berdasarkan Usia (Binary Search)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (L untuk Laki-laki, P untuk Perempuan): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen19(kode, nama, jenisKelamin, usia));
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;

                case 5:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.PencarianDataSequential19(cariNama);
                    break;

                case 6:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.PencarianDataBinary19(cariUsia);
                    break;

                case 7:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        }
    }
}
