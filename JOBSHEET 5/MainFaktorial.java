import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai :");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial() ;
        System.out.println("Nilai Faktorrial " + nilai + "Menggunakan  BF : " + fk.faktorialBF(nilai)) ;
        System.out.println("Nilai Faktorrial " + nilai + "Menggunakan  DC : " + fk.faktorialDC(nilai));
    }
}