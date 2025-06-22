import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = sc.nextInt();

        sum sm = new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke- "+(i+1)+": ");
            sm.keuntungan[i] = sc.nextInt();
        }
        System.out.println("total keuntungan menggunakan Bruteforce : " + sm.totalBF());
        System.out.println("total keuntungan menggunakan DIVIDE and CONQUER : " + sm.totalDC(sm.keuntungan,0, elemen -1));
    }
}
