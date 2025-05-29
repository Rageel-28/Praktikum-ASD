import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        SingleLinkedList19 sll = new SingleLinkedList19();
        Mahasiswa19 mhs1 = new Mahasiswa19("123", "Rizki", "3c", 4);
        Mahasiswa19 mhs2 = new Mahasiswa19("124", "bimon", "3c", 4);
        sll.addLast(mhs1);
        sll.addLast(mhs2);


        // for (int i = 0; i < jumlah; i++) {
        //     System.out.println("\nData Mahasiswa ke-" + (i + 1));

        //     System.out.print("NIM   : ");
        //     String nim = sc.nextLine();

        //     System.out.print("Nama  : ");
        //     String nama = sc.nextLine();

        //     System.out.print("Kelas : ");
        //     String kelas = sc.nextLine();

        //     System.out.print("IPK   : ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine(); // membersihkan newline

        //     // Buat objek Mahasiswa19 dan tambahkan ke linked list
        //     Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas, ipk);
        //     sll.addLast(mhs);
        //     System.out.println("Mahasiswa berhasil ditambahkan.");
        //     System.out.println("Linked List setelah penambahan:");
        //     sll.print();
        // }

        System.out.println("\nData akhir dalam Linked List:");
        sll.print();

        System.out.println("data index 1 : ");
            sll.getData(1);

            System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
            System.out.println();

            sll.removeFirst();
            sll.removeLast();
            sll.print();
            sll.removeAt(0);
            sll.print();


        sc.close();
    }
}
