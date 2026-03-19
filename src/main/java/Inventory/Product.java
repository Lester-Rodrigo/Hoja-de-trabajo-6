package Inventory;

/**
 * Represents a product in the inventory.
 * 
 * <p>Each product has a name and a quantity (amount).</p>
 */
public class Product{

    /** Name of the product */
    String name;

    /** Quantity of the product */
    int amount;

    /**
     * Creates a new product with the given name.
     *
     * @param name the product name
     */
    public Product(String name){
        this.name = name;
        this.amount=1;
    }

    /**
     * Increases the amount of the product by one.
     */
    public void setAmount(){
        amount++;
    }

    /**
     * Gets the name of the product.
     *
     * @return product name
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the quantity of the product.
     *
     * @return product amount
     */
    public int getAmount(){
        return amount;
    }
}