public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    final int max = 10;
    int sudahKRS = 0;

    public AntrianKRS() {
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void kosongkan() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Jumlah antrian kurang dari 2, tidak bisa memproses KRS.");
            return;
        }

        System.out.println("Memproses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahKRS++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Mahasiswa Terdepan:");
            int count = Math.min(size, 2);
            for (int i = 0; i < count; i++) {
                int idx = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[idx].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian:");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahKRS() {
        return sudahKRS;
    }

    public int getBelumKRS() {
        return 30 - sudahKRS;
    }
}
