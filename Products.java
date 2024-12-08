package category;

import java.util.ArrayList;
import java.util.HashSet;

public class Product {
    private int id;
    private String name;
    private double price;
    private int category_id;

    // Static HashSet to track used IDs
    private static HashSet<Integer> usedIds = new HashSet<>();

    public Product() {
    }

    public Product(int id, String name, double price, int category_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category_id = category_id;
        setId(id); // Ensure the ID is unique
    }

    public int getId() {
        return id;
    }

    public int getProduct_id() {
        return category_id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        // Ensure the ID is unique using HashSet
        if (!usedIds.contains(id)) {
            this.id = id;
            usedIds.add(id);
        } else {
            throw new IllegalArgumentException("ID " + id + " is already used.");
        }
    }

    public void setProduct_id(int category_id) {
        this.category_id = category_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product:\n" + "id=" + id + " Product=" + name + " price=" + price + " categoryId=" + category_id + "\n";
    }

    private static ArrayList<Product> products = new ArrayList<>();
    
    static {
        products.add(new Product(generateUniqueId(), "Laptop", 999.99, 1)); // Electronics
        products.add(new Product(generateUniqueId(), "Shirt", 29.99, 2));  // Clothing
        products.add(new Product(generateUniqueId(), "Book", 15.99, 3));   // Books
    }

    // Generate a unique ID
    private static int generateUniqueId() {
        int id;
        do {
            id = (int) (Math.random() * 10000); // Generate an ID between 0 and 9999
        } while (usedIds.contains(id)); // Ensure uniqueness
        usedIds.add(id); // Add to the set of used IDs
        return id;
    }

    public void addProducts(Product product) {
        product.setId(generateUniqueId()); // Automatically generate a unique ID for new products
        products.add(product);
    }

    public void deleteProduct(int id, String name) throws IndexOutOfBoundsException {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id && products.get(i).getName().equals(name)) {
                products.remove(i);
                break;
            }
        }
    }

    public Product readProduct(int id, String name) throws ProductnotFound {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id && products.get(i).getName().equals(name)) {
                return products.get(i);
            }
        }
        throw new ProductnotFound("Product with the id " + id + " and name " + name + " not found");
    }

    public void updateProduct(int id, String newName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.get(i).setName(newName);
                break;
            }
        }
    }

    public void printproducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }
}
