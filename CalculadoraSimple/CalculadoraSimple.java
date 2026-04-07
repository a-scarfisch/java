package CalculadoraSimple;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int numero1;
        int numero2;
        int resultado;

        System.out.println(" = CALCULADORA =");

        System.out.println("Ingrese el primer número: ");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();

        resultado = numero1 + numero2;
        System.out.println("Suma: " + resultado);

        resultado = numero1 -numero2;
        System.out.println("Resta:" + resultado);

        resultado = numero1 * numero2;
        System.out.println("Multiplación: " + resultado);

        if (numero2 !=0){
            resultado = numero1/numero2; 
            System.out.println("División: " + resultado);
        }else{
            System.out.println("División: no se puede dividir por cero");
        }
        scanner.close();
        }
    }

