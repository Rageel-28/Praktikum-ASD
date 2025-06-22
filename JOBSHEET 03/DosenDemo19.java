import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Masukkan jumlah dosen yang ingin diinput: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

   
        Dosen19[] daftarDosen = new Dosen19[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();
            boolean jenisKelamin = false; // Default ke wanita

            if (jk.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            }

            System.out.print("Usia         : ");
            int usia = Integer.parseInt(sc.nextLine());

            daftarDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

     

        DataDosen19.dataSemuaDosen(daftarDosen);
        DataDosen19.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen19.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen19.infoDosenPalingTua(daftarDosen);
        DataDosen19.infoDosenPalingMuda(daftarDosen);

      
    }
}