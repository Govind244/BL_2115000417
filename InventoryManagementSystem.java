import java.util.*;

class Item {
    String name;
    int id, quantity;
    double price;
    Item next;
    
    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    Item head;
    
    void addItemAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }
    
    void addItemAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }
    
    void addItemAtPosition(String name, int id, int quantity, double price, int pos) {
        Item newItem = new Item(name, id, quantity, price);
        if (pos == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newItem.next = temp.next;
        temp.next = newItem;
    }
    
    void removeItem(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }
    
    void updateQuantity(int id, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }
    
    Item searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }
    
    Item searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) return temp;
            temp = temp.next;
        }
        return null;
    }
    
    double calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }
    
    void sortInventoryByName() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, true);
    }
    
    void sortInventoryByPrice() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, false);
    }
    
    Item mergeSort(Item head, boolean byName) {
        if (head == null || head.next == null) return head;
        Item mid = getMiddle(head);
        Item nextToMid = mid.next;
        mid.next = null;
        Item left = mergeSort(head, byName);
        Item right = mergeSort(nextToMid, byName);
        return merge(left, right, byName);
    }
    
    Item merge(Item left, Item right, boolean byName) {
        if (left == null) return right;
        if (right == null) return left;
        
        if ((byName && left.name.compareTo(right.name) < 0) || (!byName && left.price < right.price)) {
            left.next = merge(left.next, right, byName);
            return left;
        } else {
            right.next = merge(left, right.next, byName);
            return right;
        }
    }
    
    Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItemAtEnd("Laptop", 101, 10, 50000);
        inventory.addItemAtEnd("Mouse", 102, 50, 500);
        inventory.addItemAtEnd("Keyboard", 103, 30, 1000);
        inventory.displayInventory();
        System.out.println("\n");
        System.out.println("Total Value: " + inventory.calculateTotalValue());
        inventory.sortInventoryByName();
        System.out.println("\n");
        inventory.displayInventory();
    }
}
