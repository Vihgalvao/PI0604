package tiposdematerias;

import java.util.Scanner;

public class TiposdeMaterias {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean podetransportar = false;
        System.out.println("Insira o tipo");
        String tipo = console.next();
        tipo = tipo.toUpperCase();
        System.out.println("Insira o valor:");
        double t = console.nextDouble();

        switch (tipo) {
            case "A":
                if (t >= 10 && t <= 17) {
                    podetransportar = true;
                } else {
                    podetransportar = false;
                }
                break;
            case "B":
                if (t < 11 || t > 16) {
                    podetransportar = false;
                } else {
                    podetransportar = true;
                }
                break;
            case "C":
                podetransportar = (t < 12 && t > 15);
                break;
            case "D":
                podetransportar = !(t < 13 || t > 14);
                break;
        }

        if (podetransportar) {
            System.out.println("Podetransportar");
        } else {
            System.out.println("Não pode transportar");
        }

    }

}
