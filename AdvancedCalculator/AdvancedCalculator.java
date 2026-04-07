import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double numero1;
        double numero2;

        System.out.println(" = CALCULADORA = ");

        System.out.print("Ingrese el primer numero: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = scanner.nextDouble();

    
        System.out.println("Suma: " + sumar(numero1, numero2));
        System.out.println("Resta: " + restar(numero1, numero2));
        System.out.println("Multiplicacion: " + multiplicar(numero1, numero2));
        System.out.println("Potencia: " + potencia(numero1, numero2));
        System.out.println("RaizCuadrada: " + raizCuadrada(numero2));

        if (numero2 != 0) {
            System.out.println("Division: " + dividir(numero1, numero2));
        } else {
            System.out.println("Division: no se puede dividir por cero");
        }

        scanner.close(); 
    } 

    

    static double sumar(double a, double b) {
        return a + b; 
    }

    static double restar(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        return a / b;
    }


    static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    static double modulo(double a, double b) {
        return a % b;
    }

} 
