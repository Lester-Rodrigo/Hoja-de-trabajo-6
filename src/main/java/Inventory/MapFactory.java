package Inventory;

public class MapFactory {

    private HashMapOperator hash = new HashMapOperator();
    private LinkedHashMapOperator linked = new LinkedHashMapOperator();
    private TreeMapOperator tree = new TreeMapOperator();

    public void executeOperation(int type, int operation, String category, String name) {
        switch (type) {
            case 1:
                switch (operation) {
                    case 1:
                        hash.addProduct(category, name);
                        break;
                    case 3:
                        hash.showData();
                        break;
                    case 4:
                        hash.showDataOrdered();
                        break;
                    case 5:
                        hash.showNameCategory();
                        break;
                    case 6:
                        hash.showNameCategoryOrdered();
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operation: " + operation);
                }
                break;

            case 2:
                switch (operation) {
                    case 1:
                        linked.addProduct(category, name);
                        break;
                    case 3:
                        linked.showData();
                        break;
                    case 4:
                        linked.showDataOrdered();
                        break;
                    case 5:
                        linked.showNameCategory();
                        break;
                    case 6:
                        linked.showNameCategoryOrdered();
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operation: " + operation);
                }
                break;

            case 3:
                switch (operation) {
                    case 1:
                        tree.addProduct(category, name);
                        break;
                    case 3:
                        tree.showData();
                        break;
                    case 4:
                        tree.showDataOrdered();
                        break;
                    case 5:
                        tree.showNameCategory();
                        break;
                    case 6:
                        tree.showNameCategoryOrdered();
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operation: " + operation);
                }
                break;

            default:
                throw new IllegalArgumentException("Invalid map type: " + type);
        }
    }

    public String executeOperationWithReturn(int type, int operation, String name) {
        switch (type) {
            case 1:
                if (operation == 2) return hash.showCategory(name);
                break;
            case 2:
                if (operation == 2) return linked.showCategory(name);
                break;
            case 3:
                if (operation == 2) return tree.showCategory(name);
                break;
            default:
                throw new IllegalArgumentException("Invalid map type: " + type);
        }

        throw new IllegalArgumentException("Invalid operation for return: " + operation);
    }
}