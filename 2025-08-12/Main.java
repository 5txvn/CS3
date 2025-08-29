import java.utils.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        
        // Add Book objects
        bookInventory.addItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99, "B001"));
        bookInventory.addItem(new Book("To Kill a Mockingbird", "Harper Lee", 14.50, "B002"));
        bookInventory.addItem(new Book("1984", "George Orwell", 13.25, "B003"));
        bookInventory.addItem(new Book("Pride and Prejudice", "Jane Austen", 11.75, "B004"));
        
        // Print the book inventory
        bookInventory.printInventory();
        System.out.printf("Total Book Inventory Value: $%.2f\n", bookInventory.calculateTotalValue());
        System.out.println();
        
        // Create an Inventory<Electronic>
        System.out.println("💻 ELECTRONIC INVENTORY:");
        Inventory<Electronic> electronicInventory = new Inventory<>();
        
        // Add Electronic objects
        electronicInventory.addItem(new Electronic("iPhone 15 Pro", "Apple", 999.99, "E001"));
        electronicInventory.addItem(new Electronic("MacBook Air", "Apple", 1299.00, "E002"));
        electronicInventory.addItem(new Electronic("Galaxy S24", "Samsung", 799.99, "E003"));
        electronicInventory.addItem(new Electronic("PlayStation 5", "Sony", 499.99, "E004"));
        
        // Print the electronic inventory
        electronicInventory.printInventory();
        System.out.printf("Total Electronic Inventory Value: $%.2f\n", electronicInventory.calculateTotalValue());
        System.out.println();
    }
}