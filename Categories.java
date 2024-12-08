/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;


public class Category {
 private int id;
 private String name;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "\n" + "id number: " + id +   " ,   Category Type is: " + name ;
    }
    private static ArrayList<Category>categories=new ArrayList<>();
    public void addCategory(Category category)
    {
        categories.add(category);
    }
    public void deleteCategory(int id,String name)
    {
       for(int i=0;i<categories.size();i++)
       {
           if(categories.get(i).getId()==id && categories.get(i).getName().equals(name))
           {
               categories.remove(i);
               break;
           }
       }
    }
    public  Category readCategory(int id,String name)throws CategorynotFound
            
    {
        
    for(int i=0;i<categories.size();i++) {
        if (categories.get(i).getId()==id && categories.get(i).getName().equals(name)) {
            return categories.get(i);  
        }
        
            
    }
    throw new CategorynotFound("Category with the id "+id+"and name"+name +"Not Found");
    }
  public void updateCategory(int id, String newName) {
        for(int i=0;i<categories.size();i++) {
            if (categories.get(i).getId() == id) {
                categories.get(i).setName(newName);
                break;
            }
        }
    }
     public void printCategories() throws NullPointerException {
        for(int i=0;i<categories.size();i++) {
            System.out.println(categories.get(i));
        }
    }
    
    
    
}
