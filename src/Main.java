import Entities.Client;
import Entities.Enums.OrderStatus;
import Entities.Order;
import Entities.Product;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birth = sdf.parse(birthDate);
        Client client = new Client(name, email, birth);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(status.toUpperCase());

        System.out.print("How many items are in this order? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();
            sc.nextLine();


            list.add(new Product(productName, price, quantityProduct));
        }

        Order order = new Order(client, list, new Date(), orderStatus);
        System.out.println(order);
    }
}
