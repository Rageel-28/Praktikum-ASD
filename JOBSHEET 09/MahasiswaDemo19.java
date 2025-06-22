import java.util.Scanner;

public class MahasiswaDemo19 {

    public static void main(String[] args) {
        StackTugasMahasiswa19 stack = new StackTugasMahasiswa19(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("Pilih Menu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Lihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");

            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1 :
                    System.out.print("Nama :");
                    String nama = scan.nextLine();
                    System.out.print("Nim :");
                    String nim = scan.nextLine();
                    System.out.print ("Kelas:");
                    String kelas = scan.nextLine();
                    Mahasiswa19 mhs = new Mahasiswa19 (nama,nim,kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n",  mhs.nama);
                    break;
                case 2 :
                    Mahasiswa19 dinilai = stack.pop ();
                    if (dinilai != null) {
                        System.out.println("Menilai Tugas dari " +dinilai.nama);
                        System.out.println("Masukan nilai (0-100) : ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s = %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas : " + biner);
                    }
                    break;
                case 3 :
                    Mahasiswa19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4 :
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa19 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    break;

                default :
                System.out.println("Pilihan tidak ada");
            }
        } while (pilih >= 1 && pilih <=5);
    }

}