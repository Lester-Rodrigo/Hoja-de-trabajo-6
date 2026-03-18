package Productos;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory {

    public static <T> Map<T, T> createMap(int type) {
        switch (type) {
            case 1:
                Map<String, Integer> HashMap = new HashMap<>();
                return new HashMap<>();
            case 2:
                Map<String, Integer> LinkedHashMap = new LinkedHashMap<>();
                return new LinkedHashMap<>();
            case 3:
                Map<String, Integer> TreeMap = new TreeMap<>();
                return new TreeMap<>();
            default:
                throw new IllegalArgumentException("Invalid map type: " + type);
        }
    }
}
