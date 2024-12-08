/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package category;


import java.util.ArrayList;



public class Product {
    private int id;
    private String name;
    private double price;
    private int category_id;

    public Product() {
    }

    public Product(int id, String name, double price, int category_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category_id = category_id;
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
        this.id = id;
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
        return "product:\n" + "id=" + id + " Product=" + name  + " price=" + price + "categoryId=" + category_id +"\n" ;
    }
    
    
    private static ArrayList<Product>products=new ArrayList<>();
    static {
        
        products.add(new Product(1, "Laptop", 999.99, 1)); // Electronics
        products.add(new Product(2, "Shirt", 29.99, 2));  // Clothing
        products.add(new Product(3, "Book", 15.99, 3));   // Books
    }
     public void addProducts(Product product)
    {
        products.add(product);
    }
    public void deleteProduct(int id,String name) throws IndexOutOfBoundsException
    {
       for(int i=0;i<products.size();i++)
       {
           if(products.get(i).getId()==id && products.get(i).getName().equals(name))
           {
               products.remove(i);
               break;
           }
       }
    }
    public  Product readProduct(int id,String name) throws ProductnotFound
    {
        
    for(int i=0;i<products.size();i++) {
        if (products.get(i).getId()==id && products.get(i).getName().equals(name)) {
            return products.get(i);  
        }
        
            
    }
    throw new ProductnotFound("Product with the id "+id+"and name"+name +"Not Found");
    }
  public void updateProduct(int id, String newName) {
        for(int i=0;i<products.size();i++) {
            if (products.get(i).getId() == id) {
                products.get(i).setName(newName);
                break;
            }
        }
    }
     public void printproducts() {
        for(int i=0;i<products.size();i++) {
            System.out.println(products);
        }
    }
    
}
