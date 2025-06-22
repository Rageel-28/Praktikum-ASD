import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        while (true) {
            tampilkanMenu();  
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.println("Volume Kubus: " + hitungVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                        break;
                }
            } else if (pilihan == 0) {
                System.out.println("Program selesai.");
                break;  
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

       
    }

    public static void tampilkanMenu() {
        System.out.println("\nPilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan (0-3): ");
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}
