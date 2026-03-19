package Inventory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinkedHashMapOperatorTest {
    
    @Test
    public void testAddProduct(){
        LinkedHashMapOperator operator = new LinkedHashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        assertEquals("Electronics", operator.showCategory("Laptop"));
    }

    @Test
    public void testShowCategory(){
        LinkedHashMapOperator operator = new LinkedHashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        assertEquals("Electronics", operator.showCategory("Laptop"));
        assertEquals("Producto no encontrado", operator.showCategory("Phone"));
    }

    @Test
    public void testShowData(){
        LinkedHashMapOperator operator = new LinkedHashMapOperator();
        operator.addProduct("Furniture", "Chair");
        operator.addProduct("Electronics", "Laptop");
        operator.showData();
    }

    @Test
    public void testShowDataOrdered(){
        LinkedHashMapOperator operator = new LinkedHashMapOperator();
        operator.addProduct("Furniture", "Chair");
        operator.addProduct("Electronics", "Laptop");
        operator.showDataOrdered();
    }

    @Test
    public void testShowNameCategory(){
        LinkedHashMapOperator operator = new LinkedHashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        operator.addProduct("Drinks", "Coke");
        operator.showNameCategory();
    }

    @Test
    public void testShowNameCategoryOrdered(){
        LinkedHashMapOperator operator = new LinkedHashMapOperator();
        operator.addProduct("Electronics", "Laptop");
        operator.addProduct("Drinks", "Coke");
        operator.showNameCategoryOrdered();
    }
}
