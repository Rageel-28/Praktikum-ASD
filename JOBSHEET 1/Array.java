import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] namaMK = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        double[] bobotSKS = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

       
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMK[i] = scanner.nextLine();

            System.out.print("Masukkan nilai angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();

            System.out.print("Masukkan bobot SKS untuk " + namaMK[i] + ": ");
            bobotSKS[i] = scanner.nextDouble();
            scanner.nextLine(); 

          
            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

       
        double totalBobotNilai = 0;
        double totalSKS = 0;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("===============================================");
        System.out.printf("%-35s %-12s %-8s %-8s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s %-12.2f %-8s %-8.2f\n", 
                namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotSKS[i]);

            totalBobotNilai += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        double ipSemester = totalBobotNilai / totalSKS;
        System.out.println("===============================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        
    }
}