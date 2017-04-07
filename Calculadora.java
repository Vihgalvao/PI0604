package tiposdematerias;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Valor 1 ");
        double a = console.nextDouble();
        System.out.print("Valor 2 ");
        double b = console.nextDouble();
        System.out.print("Insira a operação ");
        String operacao = console.next();

        switch (operacao) {
            case "+":
                
                    System.out.println("A soma é:" + (a + b) + ".");
                
                break;
            case "-":
                
                    System.out.println("A Subtração é:" + (a - b) + ".");
                
                break;
            case "/":
                
                    System.out.println("A Divisão é:" + (a / b) + ".");
                
                break;
            case "*":
                
                    System.out.println(" A multiplicação é:" + (a * b) + ".");
                
                break;
            default: System.out.println("Operação Invalida");   
        }

    }
}
