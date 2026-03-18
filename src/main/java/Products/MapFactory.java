package Products;

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
                switch (type) {
                case 1:
                                        
                case 2:
                                       
                case 3:

                case 4:

                case 5:

                case 6:
                                        
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
                }                
            case 3:
                switch (type) {
                case 1:
                                        
                case 2:
                                       
                case 3:

                case 4:

                case 5:

                case 6:
                                        
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
                }                
            default:
                throw new IllegalArgumentException("Invalid map type: " + type);
        }
    }
}
