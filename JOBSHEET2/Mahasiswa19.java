import java.util.Scanner;

public class Mahasiswa19 {
    string nama;
    string nim;
    string kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama );
        System.out.println("NIM : " + nim );
        System.out.println("IPK :" + ipk);
        System.out.println("Kelas : " + kelas);

    }

    void ubahKelas (string kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {  
            ipk = ipkBaru;  
        } else {  
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");  
        }  
    }
    

    String nilaiKinerja() {
        if (ipk >=3.5 ) {
            return "kinerja sangat baik"
        } else if (ipk >= 3.0) {
            return "kinerja baik " 
        } else if (ipk >= 2.0) {
            return "kinerja cukup"
        } else {
            return "kinerja kurang"
        }
    }

}