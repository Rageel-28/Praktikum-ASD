import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Program menghitung nilai akhir  ");
        System.out.println("-------------------------------");
        System.out.print("Masukan nilai tugas  :");
        double tugas = sc.nextDouble();
        System.out.print("Masukan nilai kuis   :");
        double kuis = sc.nextDouble();
        System.out.print("Masukan nilai UTS    :");
        double uts = sc.nextDouble();
        System.out.print("Masukan nilai UAS    :");
        double uas = sc.nextDouble();
        System.out.println("-------------------------------");

        //validasi
        if (tugas < 0|| tugas > 100 || kuis <0 || kuis > 100 || uts < 0 || uts >100 || 
            uas < 0 || uas > 100) {
                System.out.println("Nilai tidak valid");
                return;
            }

        //nilai akhir
        double nilaiAkhir = (0.2 * tugas ) + (0.2 * kuis) + (0.30 * uts) + (0.30 * uas);
        // konversi nilai akhir ke huruf
        String nilaiHuruf;
        String keterangan;
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        // Menentukan status LULUS/TIDAK LULUS
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }
        // Output hasil akhir
        System.out.println("===========================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("===========================");
        System.out.println("SELAMAT ANDA " + keterangan);
    }
}