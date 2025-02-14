import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang dicari: ");
                    String hariDicari = scanner.nextLine();
                    tampilkanJadwalHariTertentu(namaMataKuliah, sks, semester, hariKuliah, hariDicari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang dicari: ");
                    int sem = scanner.nextInt();
                    tampilkanJadwalSemesterTertentu(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String nama = scanner.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, nama);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    
    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    
    public static void tampilkanJadwalHariTertentu(String[] nama, int[] sks, int[] semester, String[] hari, String hariDicari) {
        System.out.println("\nJadwal Kuliah pada hari " + hariDicari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(hariDicari)) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari tersebut.");
        }
    }

  
    public static void tampilkanJadwalSemesterTertentu(String[] nama, int[] sks, int[] semester, String[] hari, int semesterDicari) {
        System.out.println("\nJadwal Kuliah untuk Semester " + semesterDicari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == semesterDicari) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah untuk semester tersebut.");
        }
    }

    
    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String namaDicari) {
        System.out.println("\nHasil pencarian untuk \"" + namaDicari + "\":");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(namaDicari)) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
