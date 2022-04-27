/*
Cristian Javier Jacobo Parada
Sistemas Computacionales
21550325
 */
package com.mycompany.saludos;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Saludos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v;
        System.out.println("Cuantas veces lo desea repetir");
        v = entrada.nextInt();
        for (int a = 1; a <= v; a++) {

            float hor;
            System.out.println("Cual es la hora:");
            hor = entrada.nextFloat();
            if (hor <= 11.59 && hor >= 0) {
                System.out.println("Buenos dias");

            } else if (hor <= 19.59 && hor >= 12) {
                System.out.println("Buenas tardes");

            } else if (hor <= 23.59 || hor >= 20) {
                System.out.println("Buenas noches");
            } else {
                System.out.println("hora incorrecta");
            }

        }
    }
}
