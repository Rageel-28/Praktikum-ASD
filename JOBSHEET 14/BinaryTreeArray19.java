public class BinaryTreeArray19 {
    Mahasiswa19[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray19() {
        this.dataMahasiswa = new Mahasiswa19[10];
    }

    void populateData(Mahasiswa19[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    public void add(Mahasiswa19 data) {
    if (idxLast < dataMahasiswa.length - 1) {
        dataMahasiswa[++idxLast] = data;
    } else {
        System.out.println("Array tree penuh.");
    }
}

public void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
        if (dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}


}
