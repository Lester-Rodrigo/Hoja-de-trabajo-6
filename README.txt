Lester Alvarez- 25196 | Diego Rodríguez - 25215

Inventory System - README

Descripción:
Este proyecto implementa un sistema de inventario utilizando diferentes estructuras de datos en Java: HashMap, LinkedHashMap y TreeMap. El sistema permite almacenar productos por categoría y realizar distintas operaciones sobre ellos.

Estructura del Proyecto:

- Product.java
  Representa un producto con nombre y cantidad.

- Operation.java
  Interfaz que define las operaciones básicas del sistema:
  agregar productos, buscar categorías y mostrar datos.

- HashMapOperator.java
  Implementa las operaciones usando HashMap (sin orden garantizado).

- LinkedHashMapOperator.java
  Implementa las operaciones usando LinkedHashMap (mantiene orden de inserción).

- TreeMapOperator.java
  Implementa las operaciones usando TreeMap (ordenado automáticamente por clave).

- MapFactory.java
  Clase que actúa como controlador y decide qué implementación usar según la opción del usuario.

- Main.java
  Punto de entrada del programa. Lee datos desde archivo y permite interacción con el usuario.

Funcionamiento:

1. El programa lee un archivo llamado "ListadoProducto.txt".
   Formato esperado por línea:
   categoria | nombreProducto

2. Cada producto se agrega a las tres estructuras:
   - HashMap
   - LinkedHashMap
   - TreeMap

3. El usuario puede seleccionar:
   - Tipo de mapa
   - Operación a ejecutar

Operaciones disponibles:

1. Agregar producto
2. Buscar categoría por nombre de producto
3. Mostrar todos los productos
4. Mostrar productos ordenados
5. Mostrar categoría y nombre
6. Mostrar categoría y nombre ordenados

Diferencias entre implementaciones:

- HashMap:
  No mantiene ningún orden.

- LinkedHashMap:
  Mantiene el orden en que se insertan los elementos.

- TreeMap:
  Ordena automáticamente las claves (categorías).

Consideraciones:

- Cada categoría solo almacena un producto.
- Si se agrega un producto a una categoría existente, se incrementa la cantidad.
- La búsqueda de categoría se realiza recorriendo el mapa.

Requisitos:

- Java 8 o superior
- Archivo "ListadoProducto.txt" en la misma ruta del programa

Compilación y ejecución:

1. Compilar:
   javac Inventory/*.java

2. Ejecutar:
   java Inventory.Main

