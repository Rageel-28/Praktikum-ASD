public class BinaryTreeMain19 {
    public static void main(String[] args) {
        BinaryTree19 bst = new BinaryTree19();

        bst.addRekursif(new Mahasiswa19("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa19("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa19("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa19("244160220", "Dewi", "B", 3.54));
        bst.addRekursif(new Mahasiswa19("244160311", "Dewi", "A", 3.72));
        bst.addRekursif(new Mahasiswa19("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa19("244160170", "Fizi", "B", 3.46));

        System.out.println("Daftar Mahasiswa (InOrder Traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);

        // BONUS: Jika ingin coba min/max
        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK();
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK();
    }
}
