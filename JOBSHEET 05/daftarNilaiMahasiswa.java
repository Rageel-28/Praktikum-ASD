public class daftarNilaiMahasiswa {
    int UTSTertinggi(int[] uts, int l, int r){
        if(l == r){
            return uts[l];
        }
        int mid = (l + r) / 2;
        int tLeft = UTSTertinggi(uts, l, mid);
        int tRight = UTSTertinggi(uts, mid + 1,r );
        return Math.max(tLeft, tRight);
    }
    int UTSTerendah(int[] uts, int l, int r) {
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int tLeft = UTSTerendah(uts, l, mid);
        int tRight = UTSTerendah(uts, mid + 1, r);
        return Math.min(tLeft, tRight);
    }
    
    double totalUAS (int[] uas){
        double total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return total / uas.length;
    }
}
