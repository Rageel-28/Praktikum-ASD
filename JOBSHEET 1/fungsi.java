import java.util.Scanner;

public class fungsi {
    static  int[] HARGA = {75000, 50000, 60000, 10000};
    static  String[] NAMA_BUNGA = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stok awal 
        int[][] stok = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        while (true) {
            System.out.println("\n=== Menu RoyalGarden ===");
            System.out.println("1. Input bunga yang mati");
            System.out.println("2. Tampilkan stok bunga");
            System.out.println("3. Tampilkan pendapatan jika semua terjual");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputBungaMati(stok, scanner);
                    break;
                case 2:
                    tampilkanStok(stok);
                    break;
                case 3:
                    tampilkanPendapatan(stok);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    // Fungsi  bunga mati 
    static void inputBungaMati(int[][] stok, Scanner scanner) {
        int[] totalStok = hitungTotalStok(stok);
        int[] bungaMati = new int[4];

        System.out.println("\n=== Input Bunga Mati ===");
        for (int i = 0; i < NAMA_BUNGA.length; i++) {
            System.out.print("Masukkan jumlah bunga " + NAMA_BUNGA[i] + " yang mati: ");
            bungaMati[i] = scanner.nextInt();

            if (bungaMati[i] > totalStok[i]) {
                System.out.println("Jumlah bunga mati melebihi stok yang tersedia! Mengatur stok menjadi 0.");
                bungaMati[i] = totalStok[i]; 
            }

            totalStok[i] -= bungaMati[i]; 
        }

        // Distribusikan pengurangan 
        for (int j = 0; j < stok[0].length; j++) {
            int stokAwal = hitungTotalStok(stok)[j]; 
            if (stokAwal > 0) {
                int totalDikurangi = 0;
                for (int i = 0; i < stok.length; i++) {
                    int pengurangan = (stok[i][j] * bungaMati[j]) / stokAwal;
                    stok[i][j] -= pengurangan;
                    totalDikurangi += pengurangan;
                }

                // Jika ada selisih akibat pembagian
                int selisih = bungaMati[j] - totalDikurangi;
                if (selisih > 0) {
                    stok[0][j] -= selisih;
                    if (stok[0][j] < 0) stok[0][j] = 0; 
                }
            }
        }
        System.out.println("Stok telah diperbarui setelah pengurangan bunga mati.");
    }

    // Fungsi menampilkan 
    static void tampilkanStok(int[][] stok)  {
        int[] totalStok = hitungTotalStok(stok);

        System.out.println("\n=== Stok Bunga Saat Ini di Setiap Cabang ===");
        for (int i = 0; i < stok.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + ": ");
            for (int j = 0; j < stok[i].length; j++) {
                System.out.print(NAMA_BUNGA[j] + "=" + stok[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n=== Total Semua Cabang ===");
        for (int i = 0; i < totalStok.length; i++) {
            System.out.println(NAMA_BUNGA[i] + ": " + totalStok[i]);
        }
    }

    // Fungsi  pendapatan 
    static void tampilkanPendapatan(int[][] stok) {
        System.out.println("\n=== Pendapatan Jika Semua Bunga Terjual ===");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * HARGA[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + " : Rp " + pendapatan);
        }
    }

    // Fungsi menghitung total stok 
    static int[] hitungTotalStok(int[][] stok) {
        int[] totalStok = new int[4];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                totalStok[j] += stok[i][j];
            }
        }
        return totalStok;
    }
}
