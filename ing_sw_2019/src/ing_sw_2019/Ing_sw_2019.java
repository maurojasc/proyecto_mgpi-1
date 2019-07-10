/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_sw_2019;

import java.util.Scanner;

/**
 *
 * @author Andres Romero
 */
public class Ing_sw_2019 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float sue, nsue = 0;
        System.out.print("ingrese sueldo: ");
        sue = teclado.nextFloat();
        if (sue != 1000) {
            if (sue < 1000) {
                nsue = (float) (sue * 1.15);
            }
            if (sue > 1000) {
                nsue = (float) (sue * 1.12);
            }
            System.out.println("el sueldo final es: " + nsue);
        }
        if (sue == 1000) {
            System.out.println("el sueldo final es: " + sue);
        }
        System.out.println.("Revisión Mauricio Rojas C.");
    }

}
