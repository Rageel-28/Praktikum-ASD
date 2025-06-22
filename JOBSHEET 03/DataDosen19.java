class DataDosen19 {
    // Menampilkan semua data dosen
    public static void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println("\n===== Data Semua Dosen =====");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].cetakInfo();
        }
    }


    public static void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n===== Jumlah Dosen Berdasarkan Jenis Kelamin =====");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println("--------------------------------------");
    }


    public static void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int countPria = 0;
        int countWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                totalUsiaPria += arrayOfDosen[i].usia;
                countPria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                countWanita++;
            }
        }

        System.out.println("\n===== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin =====");
        if (countPria > 0) {
            System.out.println("Pria   : " + (double) totalUsiaPria / countPria);
        } else {
            System.out.println("Pria   : Tidak ada data");
        }

        if (countWanita > 0) {
            System.out.println("Wanita : " + (double) totalUsiaWanita / countWanita);
        } else {
            System.out.println("Wanita : Tidak ada data");
        }
        System.out.println("--------------------------------------");
    }


    public static void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 tertua = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > tertua.usia) {
                tertua = arrayOfDosen[i];
            }
        }

        System.out.println("\n===== Dosen Paling Tua =====");
        tertua.cetakInfo();
    }


    public static void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 termuda = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < termuda.usia) {
                termuda = arrayOfDosen[i];
            }
        }

        System.out.println("\n===== Dosen Paling Muda =====");
        termuda.cetakInfo();
        
    }
}