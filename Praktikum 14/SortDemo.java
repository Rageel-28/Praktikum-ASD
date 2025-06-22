import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        // Mengurutkan data secara ascending (A-Z)
        Collections.sort(daftarSiswa);

        // Menampilkan hasil setelah diurutkan
        System.out.println(daftarSiswa);
    }
}
