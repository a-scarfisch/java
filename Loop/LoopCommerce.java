package Loop;
import java.util.Scanner;

public class LoopCommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fantasia = {"1.El Hobbit", "2.Harry Potter", "3. Juego de Tronos"};
        String[] cienciaFiccion = {"4.The Martian", "5. 1984", "6. Dune"};
        String[] carrito = new String[10]; // Corregido: nombre y tipo
        int contadorProductos = 0; 
        int opcion;
       
        do {
            System.out.println("\n ===BIENVENIDO A LA LIBRERÍA JAVALIMOS===");
            System.out.println("1. Catálogo de libros");
            System.out.println("2. Agregar al carrito");
            System.out.println("3. Checkout");
            System.out.println("4. Salir ");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // IMPORTANTE: Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n *** Catálogo de libros por categoría ***"); 
                    // Quitamos el if (contadorProductos == 0) para que siempre se vea el catálogo
                    System.out.println("\n [ Fantasía ]");
                    for (String libro : fantasia) {
                        System.out.println("  - " + libro);
                    }
                    System.out.println("\n [ Ciencia Ficción ]");
                    for (String libro : cienciaFiccion) {
                        System.out.println("  - " + libro);
                    }
                    System.out.println("\n ***********************");
                    break;

                case 2: 
                    
                     System.out.println("\n--- AGREGANDO POR NÚMERO DE CATÁLOGO ---");
                    while (contadorProductos < carrito.length) {
                        System.out.println("Elige el número de libro (1-3 Fantasía, 4-6 Ciencia Ficción) o '0' para terminar:");
                        int numLibro = scanner.nextInt();
                        scanner.nextLine(); // Limpiamos buffer

                        if (numLibro == 0) break;

    
                        if (numLibro >= 1 && numLibro <= 3) {
          
                        carrito[contadorProductos] = fantasia[numLibro - 1];
                        System.out.println(" ✅ Añadido: " + carrito[contadorProductos]);
                        contadorProductos++;
                    } else if (numLibro >= 4 && numLibro <= 6) {
                        carrito[contadorProductos] = cienciaFiccion[numLibro - 4];
                        System.out.println(" ✅ Añadido: " + carrito[contadorProductos]);
                        contadorProductos++;
                     } else {
                        System.out.println("❌ Número no válido.");
                        }
                     }
                    break;
                
                case 3: 
                    System.out.println("\n Iniciando Checkout…");
                    for (int i = 1; i <= 10; i++) { // Corregido: símbolo <=
                        System.out.println("Escaneando base de datos #" + i);
                    }
                    System.out.println("¡Todo en orden! Compra procesada.");
                    break; 
            
                case 4: 
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 4); // Corregido: salida con 4
        scanner.close();
    }
}