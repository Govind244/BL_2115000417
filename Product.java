class Product {
    private String productName;
    private double price;
    private int quantity;
    private final int productID;
    public static double discount = 0;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
			System.out.println("\nProduct Details:");
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 50000, 5);
        Product product2 = new Product(102, "Smartphone", 30000, 10);

        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.updateDiscount(10);

        System.out.println("\nAfter updating discount:\n");
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
