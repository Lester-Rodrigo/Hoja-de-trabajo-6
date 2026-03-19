package Inventory;

public class MapFactory {

    public void createMap(int type, int operation, String category, String name) {
        switch (type) {
            case 1:
                HashMapOperator hash = new HashMapOperator();
                switch (type) {
                case 1:
                    hash.addProduct(category, name);
                case 2:
                    hash.showCategory(name);               
                case 3:
                    hash.showData();
                case 4:
                    hash.showDataOrdered();
                case 5:
                    hash.showNameCategory();
                case 6:
                    hash.showNameCategoryOrdered();        
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
                }
                
            case 2:
                LinkedHashMapOperator linked = new LinkedHashMapOperator();
                switch (type) {
                case 1:
                    linked.addProduct(category, name);                
                case 2:
                    linked.showCategory(name);           
                case 3:
                    linked.showData();
                case 4:
                    linked.showDataOrdered();
                case 5:
                    linked.showNameCategory();
                case 6:
                    linked.showNameCategoryOrdered();               
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
                }                
            case 3:
                TreeMapOperator tree = new TreeMapOperator();
                switch (type) {
                case 1:
                    tree.addProduct(category, name);      
                case 2:
                    tree.showCategory(name);     
                case 3:
                    tree.showData();
                case 4:
                    tree.showDataOrdered();
                case 5:
                    tree.showNameCategory();
                case 6:
                    tree.showNameCategoryOrdered();             
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
                }                
            default:
                throw new IllegalArgumentException("Invalid map type: " + type);
        }
    }
}
