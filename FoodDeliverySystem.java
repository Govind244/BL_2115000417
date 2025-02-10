import java.util.*;  

abstract class FoodItem {  
    private String itemName;  
    private double price;  
    private int quantity;  

    public FoodItem(String itemName, double price, int quantity) {  
        this.itemName = itemName;  
        this.price = price;  
        this.quantity = quantity;  
    }  

    public abstract double calculateTotalPrice();  

    public String getItemDetails() {  
        return "Item: " + itemName + ", Price: ₹" + price + ", Quantity: " + quantity + "\n";  
    }  

    public double getPrice() {  
        return price;  
    }  

    public int getQuantity() {  
        return quantity;  
    }  
}  

interface Discountable {  
    void applyDiscount(double discountPercentage);  
    String getDiscountDetails();  
}  

class VegItem extends FoodItem implements Discountable {  
    private double discount;  

    public VegItem(String itemName, double price, int quantity) {  
        super(itemName, price, quantity);  
    }  

    public double calculateTotalPrice() {  
        return getPrice() * getQuantity() * (1 - discount / 100);  
    }  

    public void applyDiscount(double discountPercentage) {  
        this.discount = discountPercentage;  
    }  

    public String getDiscountDetails() {  
        return "Discount on " + getItemDetails() + " is " + discount + "%\n";  
    }  
}  

class NonVegItem extends FoodItem implements Discountable {  
    private double extraCharge;  
    private double discount;  

    public NonVegItem(String itemName, double price, int quantity, double extraCharge) {  
        super(itemName, price, quantity);  
        this.extraCharge = extraCharge;  
    }  

    public double calculateTotalPrice() {  
        return (getPrice() * getQuantity() + extraCharge) * (1 - discount / 100);  
    }  

    public void applyDiscount(double discountPercentage) {  
        this.discount = discountPercentage;  
    }  

    public String getDiscountDetails() {  
        return "Discount on " + getItemDetails() + " is " + discount + "%\n";  
    }  
}  

public class FoodDeliverySystem {  
    public static void main(String[] args) {  
        List<FoodItem> order = new ArrayList<>();  

        FoodItem veg1 = new VegItem("Paneer Butter Masala", 250, 2);  
        FoodItem nonVeg1 = new NonVegItem("Chicken Biryani", 350, 1, 50);  

        order.add(veg1);  
        order.add(nonVeg1);  

        for (FoodItem item : order) {  
            System.out.println(item.getItemDetails());  
            System.out.println("Total Price: ₹" + item.calculateTotalPrice() + "\n");  
        }  

        Discountable discount1 = (Discountable) veg1;  
        discount1.applyDiscount(10);  
        System.out.println(discount1.getDiscountDetails());  
        System.out.println("Total Price after Discount: ₹" + veg1.calculateTotalPrice() + "\n");  

        Discountable discount2 = (Discountable) nonVeg1;  
        discount2.applyDiscount(5);  
        System.out.println(discount2.getDiscountDetails());  
        System.out.println("Total Price after Discount: ₹" + nonVeg1.calculateTotalPrice() + "\n\n");  

        
    }  
}  
