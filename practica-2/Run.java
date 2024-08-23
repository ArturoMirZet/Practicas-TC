
// 1. Un numero par es aquel que es divisible en 2 y un 
// numero impar es aquel que no es divisible en 2.Con base en la 
// afirmacion anterior,implemente un algoritmo que permita 
// verificar si un numero es par o inpar.

//Se importa la libreria Scanner para leer el dato
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        //Se implementa la libreria
        Scanner read = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int numero = read.nextInt();
// Ya que el inciso dice que mientras un numero sea divisible entre 2 siempre sera par
// este debe dividirse entre 2 y si su residuo es 0 sera par.
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }
}
