class DataDosen19 {
    Dosen19[] dataDosen = new Dosen19[10];
    int idx = 0;

    void tambah(Dosen19 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen19 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan (Termuda ke Tertua).");
    }

    void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen19 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data berhasil diurutkan (Tertua ke Termuda).");
    }

    void PencarianDataSequential19(String keyword) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(keyword)) {
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahDitemukan++;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan nama \"" + keyword + "\" tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("PERINGATAN: Ditemukan lebih dari satu data dengan nama \"" + keyword + "\".");
        }
    }

    void PencarianDataBinary19(int usiaCari) {
        sortingASC();

        int kiri = 0, kanan = idx - 1;
        boolean ditemukan = false;
        int jumlahDitemukan = 0;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            if (dataDosen[tengah].usia == usiaCari) {
                int i = tengah;
                while (i >= 0 && dataDosen[i].usia == usiaCari) {
                    dataDosen[i].tampil();
                    jumlahDitemukan++;
                    i--;
                }
                i = tengah + 1;
                while (i < idx && dataDosen[i].usia == usiaCari) {
                    dataDosen[i].tampil();
                    jumlahDitemukan++;
                    i++;
                }
                ditemukan = true;
                break;
            } else if (usiaCari < dataDosen[tengah].usia) {
                kanan = tengah - 1;
            } else {
                kiri = tengah + 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan usia " + usiaCari + " tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("PERINGATAN: Ditemukan lebih dari satu data dengan usia " + usiaCari + ".");
        }
    }
}
