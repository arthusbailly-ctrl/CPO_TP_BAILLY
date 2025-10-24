/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author Arthus BAILLY
 */
public class TP0_Calculette {

    /**
     * @param args the command line arguments
     */
    public class TP0_calculette {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float resultat = 0;

            System.out.println("Please enter the operator:\n"
                    + "1) add\n"
                    + "2) substract\n"
                    + "3) multiply\n"
                    + "4) divide\n"
                    + "5) modulo");

            int operateur = sc.nextInt();

            System.out.println("Please enter the first number:");
            float operande1 = sc.nextFloat();

            System.out.println("Please enter the second number:");
            float operande2 = sc.nextFloat();

            if (operateur == 1) {
                resultat = operande1 + operande2;
            } else if (operateur == 2) {
                resultat = operande1 - operande2;
            } else if (operateur == 3) {
                resultat = operande1 * operande2;
            } else if (operateur == 4) {
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                } else if (operateur == 5) {
                    if (operande2 != 0) {
                        resultat = operande1 % operande2;
                    }
                }

                System.out.println("Résultat : " + resultat);
            }
        }
    }
}
