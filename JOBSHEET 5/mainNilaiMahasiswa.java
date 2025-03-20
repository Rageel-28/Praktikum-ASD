import java.util.Scanner;
public class mainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa = 8;
        String[] nama = {"Ahmad" , "Budi" , "Cindy" , "Dian" , "Eko" , "Fajar" , "Gina" , "Hadi"};
        int[] uts = {78, 85, 90, 76, 92, 88, 82, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 84, 84};

        daftarNilaiMahasiswa dafnil = new daftarNilaiMahasiswa();
        System.out.println("Nilai UTS tertinggi Menggunakan Divide and Conquer :  " + dafnil.UTSTertinggi(uts, 0, jumlahMahasiswa-1));
        System.out.println("Nilai UTS terendah Menggunakan Divide and Conquer :  " + dafnil.UTSTerendah(uts, 0, jumlahMahasiswa-1));
        System.out.println("Rata-rata nilai UAS menggunakan BruteForce : " + dafnil.totalUAS(uas));
    }
}
