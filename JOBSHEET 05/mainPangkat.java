import java.util.Scanner;
public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai basis elemen ke-" + (i + 1) + " : ");
            int basis = sc.nextInt();
            System.out.println("Masukkan nilai pangkat elemen ke-" + (i + 1) + " : ");
            int pangkat = sc.nextInt();

            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("\nHASIL PANGKAT BRUTEFORCE:");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatBF());
        }

        System.out.println("\nHASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
