import java.util.Scanner;

public class MainSurat19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat19 tumpukan = new StackSurat19(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = input.nextInt();
                    input.nextLine();
                    Surat19 surat = new Surat19(id, nama, kelas, jenis, durasi);
                    tumpukan.push(surat);
                    break;

                case 2:
                    Surat19 diproses = tumpukan.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat19 terakhir = tumpukan.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    if (tumpukan.cariSurat(cari)) {
                        System.out.println("Surat dari " + cari + " ditemukan.");
                    } else {
                        System.out.println("Surat dari " + cari + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}
