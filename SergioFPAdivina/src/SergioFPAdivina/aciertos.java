package SergioFPAdivina;

import java.util.Scanner;

/**
 * @author Sergio Fern�ndez Pina
 * @version 22.1 
 */

public class aciertos {

    /**
     * @param args (array de Strings obligatorio para el m�todo main de java)
     */
	
    public static void main(String[] args) {
    	
    	/** 
    	 * @param n =  variable que contiene el n�mero introducido por teclado
    	 * @param x = n�mero aleatorio generado por Math.random
    	 * @param cont = contador del numero de intentos
    	 */
    	
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        
        /**
         * Si descomentamos la siguiente l�nea veremos impreso el valor del n�mero generado por Math.random
         */
        //System.out.print(x);
        
        Scanner sc = new Scanner(System.in);
        
        /**
         *  en el siguiente bucle do-while se comprueba si el n�mero introducido es mayor n>x (Te pasaste amigo), 
         *  o menor n<x (Casi cerca) y se a�ade 1 al parametro contador "cont", siempre que el n�mero introducido sea distinto de x,
         *  en el caso de ser el mismo n�mero el bucle termina y continua el programa con el mensaje de acierto y el n�mero del parametro contador
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
