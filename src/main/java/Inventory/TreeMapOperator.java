package Inventory;

import java.util.Map;
import java.util.TreeMap;

/**
 * Implementation of Operation using a TreeMap.
 * 
 * <p>Automatically sorts elements by key.</p>
 */
public class TreeMapOperator implements Operation{

    /** Stores inventory data sorted by category */
    Map<String, Product> inventory = new TreeMap<>();

    @Override
    public void addProduct(String category, String name){
        if (inventory.containsKey(category)){
            inventory.get(category).setAmount();
        } else {
            Product product = new Product(name);
            inventory.put(category, product);
        }
    }

    @Override
    public String showCategory(String name){
        for (Map.Entry<String, Product> entry : inventory.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getKey();
            }
        }
        return "Producto no encontrado";
    }

    @Override
    public void showData(){
        inventory.forEach((k, v) -> 
            System.out.println(k + " -> " + v.getName() + " -> " + v.getAmount()));
    }

    @Override
    public void showDataOrdered() {
        inventory.forEach((k, v) -> 
            System.out.println(k + " -> " + v.getName() + " -> " + v.getAmount()));
    }

    @Override
    public void showNameCategory(){
        inventory.forEach((k, v) -> 
            System.out.println(k + " -> " + v.getName()));
    }

    @Override
    public void showNameCategoryOrdered(){
        inventory.forEach((k, v) -> 
            System.out.println(k + " -> " + v.getName()));
    }
}