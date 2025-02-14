import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        // Mengambil 2 digit terakhir dari NIM
        int length = nim.length();
        char digit1 = nim.charAt(length - 2);
        char digit2 = nim.charAt(length - 1);

        // Konversi ke integer
        int n = (digit1 - '0') * 10 + (digit2 - '0');

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);
        System.out.println("====================");

        // Perulangan untuk mencetak output dalam satu baris
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) { // Jika ganjil, cetak "*"
                System.out.print("* ");
            } else { // Jika genap, cetak angka
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Pindah ke baris baru setelah selesai
    }
}
