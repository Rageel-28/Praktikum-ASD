class MahasiswaBerprestasi19 {
    Mahasiswa19[] listMhs;
    int idx;

    MahasiswaBerprestasi19(int kapasitas) {
        listMhs = new Mahasiswa19[kapasitas];
        idx = 0;
    }
    

    void tambah(Mahasiswa19 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa19 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa19 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa19 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada index ke-" + pos);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan.");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM   : " + listMhs[pos].nim);
            System.out.println("Nama  : " + listMhs[pos].nama);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK   : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan.");
        }
    }
    int fineBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }else if(listMhs[mid].ipk < cari){
                return fineBinarySearch(cari,left,mid -1 );
            }else{
                return fineBinarySearch(cari,mid + 1 ,right);
            }
        }
        return -1;
    }
}
