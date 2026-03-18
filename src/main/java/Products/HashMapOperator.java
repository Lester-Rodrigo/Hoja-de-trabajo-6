package Products;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperator implements Operation{
    Map<String, Product> inventory = new HashMap<>();
    
    @Override
    public void addProduct(String category, String name){
        if (inventory.containsKey(category)){
            inventory.get(category).setAmount();
        }
        Product product = new Product(name);
        inventory.put(category, product);
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
    public void showDataOrdered(){
        inventory.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(e ->
            System.out.println(e.getKey() + " -> " + e.getValue().getName() + " -> " + e.getValue().getAmount())
        );
    }

    @Override
    public void showNameCategory(){
        inventory.forEach((k, v) -> 
            System.out.println(k + " -> " + v.getName()));
    }

    @Override
    public void showNameCategoryOrderes(){
        inventory.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(e ->
            System.out.println(e.getKey() + " -> " + e.getValue().getName())
        );
    }
}
