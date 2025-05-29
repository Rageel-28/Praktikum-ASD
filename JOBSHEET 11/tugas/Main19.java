import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue19 queue = new Queue19();
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Jumlah Antrian");
            System.out.println("6. Lihat Semua Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = scanner.nextLine();
                    Mahasiswa19 mhs = new Mahasiswa19(nama, nim, keperluan);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.tampilDepan();
                    break;
                case 4:
                    queue.tampilBelakang();
                    break;
                case 5:
                    queue.jumlahAntrian();
                    break;
                case 6:
                    queue.tampilkanSemua();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 8:
                    System.out.println("Terima kasih telah menggunakan layanan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 8);

        scanner.close();
    }
}
