import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19(jumMhs);
        

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());
            System.out.println("-----------------------");

            list.tambah(new Mahasiswa19(nim, nama, kelas, ipk));
        }

        System.out.println("=== Daftar Mahasiswa ===");
        list.tampil();

        System.out.println("\n=== Pencarian Data ===");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("\nMenggunakan sequential searching:");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

         // pencarian data menggunakan binary search
         System.out.println("---------------------------------------");
         System.out.println("Pencarian data");
         System.out.println("---------------------------------------");
         System.out.println("Masukkan IPK Mahasiswa yang ingin dicari : ");
         System.out.print("IPK : ");
         cari = sc.nextDouble();
 
         System.out.println("menggunakan Binary Serach ");
         double posisi2 = list.fineBinarySearch(cari, 0, jumMhs-1);
         int pss2 = (int) posisi2;
         list.tampilPosisi(cari, pss2);
         list.tampilDataSearch(cari, pss2);
    }
}
