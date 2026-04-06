import java.util.Scanner;

public class MiniDesafio {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do{
                System.out.println("/n ===MINI DESAFIO ===");
                System.out.println("1. Números Enteros");
                System.out.println("2. Números décimales");
                System.out.println("3. Salir");
                System.out.println("Ingrese una opción: ");

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        int num =10;
                        System.out.println("Has elegido Decimales. Ejemplo:"+ num);
                        break;
                    case 2: 
                        double decimal = 10.5;
                        System.out.println("Has elegido Decimales. Ejemplo:" + decimal);
                        break;
                    case 3:
                        System.out.println("Saliendo…");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
        } while (opcion != 3);

        scanner.close(); // Ahora está dentro del main, donde corresponde
    }
}