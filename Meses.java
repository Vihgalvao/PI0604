
package tiposdematerias;

import java.util.Random;
import java.util.Scanner;


public class Meses {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rnd = new Random();

        int dias;

        //int i = rnd.nextInt(12);
        //ENTRADA
        System.out.println("Mês: ");
        int mes = console.nextInt();
        switch(mes) {
            case "1"
        }
        





//PROCESSAMENTO
        if (mes == 2) {
            dias = 28;
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 31;
            }

        }

        //SAIDA
        System.out.println(dias);

    }

}