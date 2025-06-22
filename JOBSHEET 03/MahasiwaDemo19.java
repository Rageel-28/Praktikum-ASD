import java.util.Scanner;

public class MahasiwaDemo19 {
    public static void main(String[] args) {
        Mahasiswa19 [] arrayOfMahasiswa19 = new Mahasiswa19[3];
        Scanner sc = new Scanner(System.in);
        String dummy;

        myArrayOfMahasiswa[0] = new Mahasiswa();
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;

        for (int i = 0 ; i < 3; i ++) {
            arrayOfMahasiswa19[i] = new Mahasiswa19();

            System.out.println("Masukan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM    :");
            arrayOfMahasiswa19[i].nim = sc.nextLine();
            System.out.print("Nama   :");
            arrayOfMahasiswa19[i].nama = sc.nextLine();
            System.out.print("kelas  :");
            arrayOfMahasiswa19[i].kelas = sc.nextLine();
            System.out.print("IPK    :");
            dummy = sc.nextLine();
            arrayOfMahasiswa19[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------------");

        }


        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa19[i].cetakInfo(i + 1);
        }
    }

}