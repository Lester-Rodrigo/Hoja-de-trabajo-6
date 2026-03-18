package Productos;
import java.util.Map;

public interface Operation {
    public void addProduct(String category, String name);
    public String showCategory(String name);
    public Map showData();
    public Map showDataOrdered();
    public Map showNameCategory();
    public Map showNameCategoryOrderes();
}
