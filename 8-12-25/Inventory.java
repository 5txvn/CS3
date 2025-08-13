import java.utils.ArrayList;

interface Sellable {
    double getPrice();
    String getProductID();
}

class Book implements Sellable {
    private String title;
    private String author;
    private double price;
    private String productID;

    public Book(String title, String author, double price, String productID) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("Title: %s, Author: %s, Price: $%.2f, Product ID: %s", title, author, price, productID);
    }
}

class Electronic implements Sellable {
    private String name;
    private String brand;
    private double price;
    private String productID;

    public Electronic(String name, String brand, double price, String productID) {
        self.name = name;
        self.brand = brand;
        self.price = price;
        self.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("Name: %s, Brand: %s, Price: $%.2f, Product ID: %s", name, brand, price, productID);
    }
}

class Inventory<T extends Sellable> {
    private ArrayList<T> items;

    public Inventory {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void printInventory {
        for(T item : items) {
            System.out.println(item);
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for(T item : items) {
            totalValue += item.getPrice();
        }
        return totalValue;
    }
}