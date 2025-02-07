class Order {
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Status: " + getOrderStatus());
    }

    public static void main(String[] args) {
        Order order = new Order(101, "2025-02-07");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-02-06", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-02-05", "TRK67890", "2025-02-07");

        order.displayOrderDetails();
        shippedOrder.displayOrderDetails();
        deliveredOrder.displayOrderDetails();
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus() {
        return "Shipped (Tracking No: " + trackingNumber + ")";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}
