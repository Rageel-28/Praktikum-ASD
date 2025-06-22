import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Membuat objek TreeSet bertipe String
        TreeSet<String> fruits = new TreeSet<>();

        // Menambahkan data ke TreeSet
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        // Mencetak data pada TreeSet menggunakan looping
        for (String temp : fruits) {
            System.out.println(temp);
        }
        
        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("Setelah remove " + fruits);

        fruits.pollFirst();
        System.out.println("Setelah poll first " + fruits);

        fruits.pollLast();
        System.out.println("Setelah poll last " + fruits);

    }
}
