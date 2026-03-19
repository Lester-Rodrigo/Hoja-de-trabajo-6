package Inventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Main class that runs the inventory system.
 * 
 * <p>This program:
 * <ul>
 *   <li>Reads product data from a text file</li>
 *   <li>Stores the data in different Map implementations</li>
 *   <li>Allows the user to interact through a console menu</li>
 * </ul>
 * </p>
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        String txt = "ListadoProducto.txt";
        Scanner scanner = new Scanner(System.in);
        MapFactory factory = new MapFactory();

        /**
         * Reads the file and loads initial data into all map types.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(txt))) {

            String lyne;

            while ((lyne = br.readLine()) != null) {

                lyne = lyne.trim();

                if (lyne.isEmpty()) continue;

                String[] parts = lyne.split("\\|");

                if (parts.length != 2) continue;

                String category = parts[0].trim();
                String name = parts[1].trim();

                factory.executeOperation(1, 1, category, name);
                factory.executeOperation(2, 1, category, name);
                factory.executeOperation(3, 1, category, name);
            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        int opc = 0;

        /**
         * Main menu loop for user interaction.
         */
        while (opc != 1){

            System.out.println("Ingrese el map a utilizar");
            System.out.println("1) HashMap");
            System.out.println("2) LinkedMap ");
            System.out.println("3) TreeMap");
            int map = scanner.nextInt();

            System.out.println("Ingrese la operación que desea");
            System.out.println("1) Agregar producto");
            System.out.println("2) Buscar categoria por nombre ");
            System.out.println("3) Mostrar productos");
            System.out.println("4) Mostrar productos ordenados");
            System.out.println("5) Mostrar categoria y nombre ");
            System.out.println("6) Mostrar categoria y nombre ordenados");
            int operate = scanner.nextInt();

            if (operate == 1){
                scanner.nextLine(); 
                System.out.println("Ingrese su categoria");
                String category = scanner.nextLine();
                System.out.println("Ingrese el nombre del producto");
                String product = scanner.nextLine();
                factory.executeOperation(map, operate, category, product);

            } else if (operate == 2){
                scanner.nextLine(); 
                System.out.println("Ingrese el nombre del producto");
                String product = scanner.nextLine();
                System.out.println("Categoria: " + factory.executeOperationWithReturn(map, operate, product));

            } else {
                factory.executeOperation(map, operate, "", "");
            }

            System.out.println("¿Desea salir? ");
            System.out.println("1) Si");
            System.out.println("2) No");
            opc = scanner.nextInt();
        }

        scanner.close();
    }
}