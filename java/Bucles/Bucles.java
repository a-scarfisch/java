import java.util.Scanner;
    public class Bucles {
        public static void main(String[]args) {
        Scanner scanner = new Scanner(System. in);
        int opcion;
        String[] numeroStrings ={"1", "5", "10", "15", "20"};

        do{ 
            System.out.println("\n--- Menú de conteo----");
            System.out.println("1. Contar del 1 al 20");
            System.out.println("2. Contal del 1 al 10");
            System.out.println("3. Multiplos de 5");
            System.out.println("Elige una opción");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Contando del 1 al 20");
                    for (int i= 1; i<= 20; i++){
                    System.out.println(i + "" );
                    }
                    System.out.println();
                    break;
                case 2: 
                    System.out.println("Cuenta regresiva del 10 al 1");
                    int escala = 10; 
                    while (escala > 0){
                        System.out.println(escala);
                        escala --; 
                    }
                    System.out.println();
                    break;
                case 3:  
                    System.out.println("Multiplos x5:");
                    for (String n: numeroStrings){
                        System.out.println("-"+ n);
                    }
                    break; 
                case 4: 
                     System.out.println("Saliendo del programa…");
                    break; 
                    
                default: 
                    System.out.println("Opción no válida, intenta de nuevo");
            }
        } while (opcion != 3); 
        scanner.close();
        }
    
    }

    

    