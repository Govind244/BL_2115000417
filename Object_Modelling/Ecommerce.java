import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.println(name + " - $" + price);
    }
}

class Order {
    int orderId;
    List<Product> products;
    static int orderCount = 1;

    public Order() {
        this.orderId = orderCount++;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            product.showProduct();
        }
    }
}

class Customer {
    String name;
    List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.showOrder();
            System.out.println();
        }
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        Customer customer = new Customer(customerName);

        System.out.print("Enter number of products available: ");
        int numProducts = sc.nextInt();
        sc.nextLine();
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name: ");
            String productName = sc.nextLine();
            System.out.print("Enter product price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            productList.add(new Product(productName, productPrice));
        }

        System.out.print("Enter number of orders: ");
        int numOrders = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numOrders; i++) {
            Order order = new Order();
            System.out.print("Enter number of products in order " + (i + 1) + ": ");
            int numOrderProducts = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < numOrderProducts; j++) {
                System.out.print("Enter product name to add to order: ");
                String productName = sc.nextLine();
                for (Product product : productList) {
                    if (product.name.equalsIgnoreCase(productName)) {
                        order.addProduct(product);
                    }
                }
            }
            customer.placeOrder(order);
        }

        customer.showOrders();
    }
}
