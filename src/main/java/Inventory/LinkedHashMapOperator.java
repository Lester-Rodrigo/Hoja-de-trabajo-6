package Inventory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementación de inventario usando LinkedHashMap.
 * Mantiene el orden de inserción.
 */
public class LinkedHashMapOperator implements Operation {

    private Map<String, List<Product>> inventory = new LinkedHashMap<>();

    @Override
    public void addProduct(String category, String name) {
        inventory.putIfAbsent(category, new ArrayList<>());

        List<Product> products = inventory.get(category);

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.setAmount();
                return;
            }
        }

        products.add(new Product(name));
    }

    @Override
    public String showCategory(String name) {
        for (Map.Entry<String, List<Product>> entry : inventory.entrySet()) {
            for (Product product : entry.getValue()) {
                if (product.getName().equalsIgnoreCase(name)) {
                    return entry.getKey();
                }
            }
        }
        return "Producto no encontrado";
    }

    @Override
    public void showData() {
        for (Map.Entry<String, List<Product>> entry : inventory.entrySet()) {
            for (Product product : entry.getValue()) {
                System.out.println(entry.getKey() + " -> " + product.getName() + " -> " + product.getAmount());
            }
        }
    }

    @Override
    public void showDataOrdered() {
        inventory.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> {
                for (Product product : entry.getValue()) {
                    System.out.println(entry.getKey() + " -> " + product.getName() + " -> " + product.getAmount());
                }
            });
    }

    @Override
    public void showNameCategory() {
        for (Map.Entry<String, List<Product>> entry : inventory.entrySet()) {
            for (Product product : entry.getValue()) {
                System.out.println(entry.getKey() + " -> " + product.getName());
            }
        }
    }

    @Override
    public void showNameCategoryOrdered() {
        inventory.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> {
                for (Product product : entry.getValue()) {
                    System.out.println(entry.getKey() + " -> " + product.getName());
                }
            });
    }
}