class Product<T> {
    private String name;
    double price;
        private T category;
    
        public Product(String name, double price, T category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }
    
        public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
            double discount = product.price * (percentage / 100);
        product.price -= discount;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ") - Category: " + category;
    }
}


public class OnlineMarketplace {
    public static void main(String[] args) {
        Product<String> book = new Product<>("Java Programming", 50.0, "Books");
        Product<String> shirt = new Product<>("T-Shirt", 20.0, "Clothing");
        Product<String> phone = new Product<>("Smartphone", 500.0, "Gadgets");

        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        Product.applyDiscount(book, 10);
        Product.applyDiscount(shirt, 5);
        Product.applyDiscount(phone, 15);

        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
