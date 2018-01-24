package SergioFPAdivina;

import java.util.Scanner;

/**
 * @author Sergio Fernández Pina
 * @version 23.1.2018 
 */

public class aciertos {

    /**
     * Método "main" de java.
     * @param args (array de Strings obligatorio para el método main de java).
     */
	
    public static void main(String[] args) {
    	
    	/** 
    	 *  Variables necesarias para el funcionamiento del programa:
    	 *  n =  variable que contiene el número introducido por teclado.
    	 *  x = número aleatorio generado por Math.random.
    	 *  cont = contador del numero de intentos.
    	 */
    	
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        
        /**
         * Si descomentamos la siguiente línea veremos impreso en el terminal el valor del número generado por Math.random
         */
        //System.out.print(x);
        
        Scanner sc = new Scanner(System.in);
        
        /**
         *  En el siguiente bucle do-while se comprueba si el número introducido es mayor "n>x" (Te pasaste amigo), 
         *  o menor "n<x" (Casi cerca) y se añade 1 a la variable contador "cont", siempre que el número introducido en "n" sea distinto de "x",
         *  en el caso de sea el mismo número el bucle termina y continua el programa con el mensaje de "Excelente..." y el número de la variable contador.
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
