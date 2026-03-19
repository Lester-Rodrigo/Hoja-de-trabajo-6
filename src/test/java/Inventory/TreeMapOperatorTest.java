package Inventory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TreeMapOperatorTest {
    
    @Test
    public void testAddProduct(){
        TreeMapOperator operator = new TreeMapOperator();
        operator.addProduct("Electronics", "Laptop");
        assertEquals("Electronics", operator.showCategory("Laptop"));
    }

    @Test
    public void testShowCategory(){
        TreeMapOperator operator = new TreeMapOperator();
        operator.addProduct("Electronics", "Laptop");
        assertEquals("Electronics", operator.showCategory("Laptop"));
        assertEquals("Producto no encontrado", operator.showCategory("Phone"));
    }

    @Test
    public void testShowData(){
        TreeMapOperator operator = new TreeMapOperator();
        operator.addProduct("Furniture", "Chair");
        operator.addProduct("Electronics", "Laptop");
        operator.showData();
    }

    @Test
    public void testShowDataOrdered(){
        TreeMapOperator operator = new TreeMapOperator();
        operator.addProduct("Furniture", "Chair");
        operator.addProduct("Electronics", "Laptop");
        operator.showDataOrdered();
    }

    @Test
    public void testShowNameCategory(){
        TreeMapOperator operator = new TreeMapOperator();
        operator.addProduct("Electronics", "Laptop");
        operator.addProduct("Drinks", "Coke");
        operator.showNameCategory();
    }

    @Test
    public void testShowNameCategoryOrdered(){
        TreeMapOperator operator = new TreeMapOperator();
        operator.addProduct("Electronics", "Laptop");
        operator.addProduct("Drinks", "Coke");
        operator.showNameCategoryOrdered();
    }
}
