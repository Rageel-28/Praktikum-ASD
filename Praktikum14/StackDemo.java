import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Membuat beberapa object Book
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalah Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        // Instansiasi object Stack bertipe Book
        Stack<Book> books = new Stack<>();

        // Menambahkan object ke stack menggunakan push()
        books.push(book1);
        books.push(book2);
        books.push(book3);

        // Mengintip elemen teratas stack menggunakan peek()
        Book temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println(books);

        int posisi = books.search(book2);
        System.out.println("Posisi book2 dari atas stack: " + posisi);



    }
}
