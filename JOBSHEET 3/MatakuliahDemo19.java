import java.util.Scanner;
public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah yang ingin diinput: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());
        MataKuliah19[] arrayOfMatakuliah19 = new MataKuliah19[jumlahMatkul];

        
       

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah19[i] = MataKuliah19.tambahData(sc);    }

       
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah19[i].cetakInfo();
        }
    }
}