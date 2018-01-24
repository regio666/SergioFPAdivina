package SergioFPAdivina;

import java.util.Scanner;

/**
 * @author Sergio Fern�ndez Pina
 * @version 23.1.2018 
 */

public class aciertos {

    /**
     * M�todo "main" de java.
     * @param args (array de Strings obligatorio para el m�todo main de java).
     */
	
    public static void main(String[] args) {
    	
    	/** 
    	 *  Variables necesarias para el funcionamiento del programa:
    	 *  n =  variable que contiene el n�mero introducido por teclado.
    	 *  x = n�mero aleatorio generado por Math.random.
    	 *  cont = contador del numero de intentos.
    	 */
    	
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        
        /**
         * Si descomentamos la siguiente l�nea veremos impreso en el terminal el valor del n�mero generado por Math.random
         */
        //System.out.print(x);
        
        Scanner sc = new Scanner(System.in);
        
        /**
         *  En el siguiente bucle do-while se comprueba si el n�mero introducido es mayor "n>x" (Te pasaste amigo), 
         *  o menor "n<x" (Casi cerca) y se a�ade 1 a la variable contador "cont", siempre que el n�mero introducido en "n" sea distinto de "x",
         *  en el caso de sea el mismo n�mero el bucle termina y continua el programa con el mensaje de "Excelente..." y el n�mero de la variable contador.
         */
        
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
