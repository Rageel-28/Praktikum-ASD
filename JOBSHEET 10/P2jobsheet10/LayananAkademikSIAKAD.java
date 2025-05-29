import java.util.Scanner;

public class LayananAkademikSIAKAD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;

        do {
            System.out.println("\n ==== Menu Antrian Layanan Akademik ====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Liat mahasiswa terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Jumlah mahasiswa dalam antrian ");
            System.out.println("6. Cek Antrian paling belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan =sc.nextInt(); sc.nextLine();

            switch(pilihan) {
                case 1 :
                System.out.print("Masukkan NIM : ");
                String nim = sc.nextLine();
                System.out.print("Masukkan Nama : ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Prodi : ");
                String prodi = sc.nextLine();
                System.out.println("Masukan Kelas :");
                String kelas = sc.nextLine();
                Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                antrian.tambahAntrian(mhs);
                break;

                case 2:
                Mahasiswa dilayani = antrian.layaniMahasiswa();
                if (dilayani != null) {
                    System.out.println("Melayani mahasiswa : ");
                    dilayani.tampilkanData();
                }
                break;

                case 3:
                antrian.lihatTerdepan();
                break;

                case 4 :
                antrian.tampilkanSemua();
                break;

                case 5:
                System.out.println("Jumlah mahasiswa dalam antrian : "+antrian.getJumlahAntrian());
                break;

                case 6:
                antrian.lihatAkhir();
                break;


                case 0 :
                System.out.println("terimakasih");
                break;
                
                default :
                System.out.println("Menu tidak tersedia");

            }
        } while (pilihan != 0);
        sc.close();
    }
}