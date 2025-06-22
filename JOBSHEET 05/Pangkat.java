public class Pangkat {
    int nilai, pangkat;

    public Pangkat(int n, int p) {
        this.nilai = n;
        this.pangkat = p;
    }

    int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        } else {
            int half = pangkatDC(a, n / 2);
            if (n % 2 == 1) {
                return half * half * a;
            } else {
                return half * half;
            }
        }
    }
}
