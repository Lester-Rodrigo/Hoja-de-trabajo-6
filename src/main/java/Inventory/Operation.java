package Inventory;

/**
 * Interface that defines operations for managing an inventory system.
 * 
 * <p>Any class implementing this interface must provide functionality to:
 * add products, search categories, and display stored data.</p>
 */
public interface Operation {

    /**
     * Adds a product to the inventory.
     *
     * @param category the category where the product belongs
     * @param name the name of the product
     */
    public void addProduct(String category, String name);

    /**
     * Searches for a product by name and returns its category.
     *
     * @param name the product name
     * @return the category of the product or a message if not found
     */
    public String showCategory(String name);

    /** Displays all products with category, name, and amount */
    public void showData();

    /** Displays all products ordered */
    public void showDataOrdered();

    /** Displays category and product name */
    public void showNameCategory();

    /** Displays category and product name ordered */
    public void showNameCategoryOrdered();
}