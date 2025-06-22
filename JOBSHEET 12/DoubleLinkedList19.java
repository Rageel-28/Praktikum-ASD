public class DoubleLinkedList19 {
    Node19 head;
    Node19 tail;

    public DoubleLinkedList19() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa19 data) {
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa19 data) {
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    

    public void insertAfter(String keyNim, Mahasiswa19 data) {
        Node19 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node19 newNode = new Node19(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public Node19 search(String nim) {
        Node19 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
    if (isEmpty()) {
        System.out.println("Warning: Linked list masih kosong.");
    } else {
        Node19 current = head;
        System.out.println("Daftar Mahasiswa:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
public void removeFirst() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
    Mahasiswa19 dataTerhapus = head.data; // simpan data sebelum dihapus
    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
    dataTerhapus.tampil(); // asumsi ada method tampil() di Mahasiswa19
}

public void removeLast() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
    Mahasiswa19 dataTerhapus = tail.data;
    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
    dataTerhapus.tampil();
}



}
