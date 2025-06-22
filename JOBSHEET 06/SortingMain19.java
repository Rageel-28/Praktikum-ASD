public class SortingMain19 {

    public static void main(String[] args) {
        int a[] = {20,10,2,7,12}, b[] = {30,20,2,8,14}
        , c[]= {40,10,4,9,3};
        Sorting19 dataurut1 = new Sorting19(a, a.length);
        System.out.println("Data awal 1 :");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("data Sudah diurutkan dengan BUBBLE SORT ASCENDING");
        dataurut1.tampil();

        Sorting19 dataurut2 = new Sorting19(b, b.length);
        System.out.println("Data awal 2 :");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("data Sudah diurutkan dengan SELECTION SORT ASCENDING");
        dataurut2.tampil();

        Sorting19 dataurut3 = new Sorting19(c, c.length);
        System.out.println("Data awal 3 :");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("data Sudah diurutkan dengan INSERTSION SORT ASCENDING");
        dataurut3.tampil();
    }
}