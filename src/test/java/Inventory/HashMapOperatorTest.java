package Inventory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HashMapOperatorTest {
    @Test
    public void testAddProduct(){
        HashMapOperator operator = new HashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        assertEquals("Electronics", operator.showCategory("Laptop"));
    }

    @Test
    public void testShowCategory(){
        HashMapOperator operator = new HashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        assertEquals("Electronics", operator.showCategory("Laptop"));
        assertEquals("Producto no encontrado", operator.showCategory("Phone"));
    }

    @Test
    public void testShowData(){
        HashMapOperator operator = new HashMapOperator();
       operator.addProduct("Furniture", "Chair");
        operator.addProduct("Electronics", "Laptop");
        operator.showData();
    }

    @Test
    public void testShowDataOrdered(){
        HashMapOperator operator = new HashMapOperator();
        operator.addProduct("Furniture", "Chair");
        operator.addProduct("Electronics", "Laptop");
        operator.showDataOrdered();
    }

    @Test
    public void testShowNameCategory(){
        HashMapOperator operator = new HashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        operator.addProduct("Drinks", "Coke");
        operator.showNameCategory();
    }

    @Test
    public void testShowNameCategoryOrdered(){
        HashMapOperator operator = new HashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        operator.addProduct("Drinks", "Coke");
        operator.showNameCategoryOrdered();
    }
    
}
