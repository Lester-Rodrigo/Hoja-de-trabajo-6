package Inventory;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of the Operation interface using a HashMap.
 * 
 * <p>This implementation does not guarantee order of elements.</p>
 */
public class HashMapOperator implements Operation{

    /** Stores inventory data (category -> product) */
    Map<String, Product> inventory = new HashMap<>();
    
    /**
     * Adds a product to the inventory.
     * If the category exists, increases its amount.
     */
    @Override
    public void addProduct(String category, String name){
        if (inventory.containsKey(category)){
            inventory.get(category).setAmount();
        } else {
            Product product = new Product(name);
            inventory.put(category, product);
        }
    }

    /**
     * Searches for a product by name and returns its category.
     */
    @Override
    public String showCategory(String name){
        for (Map.Entry<String, Product> entry : inventory.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getKey();
            }
        }
        return "Producto no encontrado";
    }

    /** Displays all stored data */
    @Override
    public void showData(){
        inventory.forEach((k, v) -> 
            System.out.println(k + " -> " + v.getName() + " -> " + v.getAmount()));
    }

    /** Displays data ordered by category */
    @Override
    public void showDataOrdered(){
        inventory.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(e ->
            System.out.println(e.getKey() + " -> " + e.getValue().getName() + " -> " + e.getValue().getAmount())
        );
    }

    /** Displays category and product name */
    @Override
    public void showNameCategory(){
        inventory.forEach((k, v) -> 
            System.out.println(k + " -> " + v.getName()));
    }

    /** Displays category and product name ordered */
    @Override
    public void showNameCategoryOrdered(){
        inventory.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(e ->
            System.out.println(e.getKey() + " -> " + e.getValue().getName())
        );
    }
}