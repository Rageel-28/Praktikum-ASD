import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // Membuat ArrayList dengan kapasitas awal 2
        ArrayList<Customer> customers = new ArrayList<>(2);

        // Membuat objek Customer
        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        // Menambahkan objek ke ArrayList
        customers.add(customer1);
        customers.add(customer2);

        // Menambahkan lebih dari kapasitas awal
        customers.add(new Customer(4, "Cica"));
        customers.add(2, new Customer(100, "Rosa"));
        System.out.println(customers.indexOf(customer2));

        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));

        // Tambahkan semua ke ArrayList customers
        customers.addAll(newCustomers);
        System.out.println(customers);


        // Mencetak data semua customer
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }
    }
}
