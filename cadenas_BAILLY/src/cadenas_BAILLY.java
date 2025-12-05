/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ME
 */
import java.util.Random;
public class cadenas_BAILLY {


    private int[] secret; // Stocke les 4 chiffres secrets

    public cadenas_BAILLY() {
        genererCombinaison();
    }

    // Méthode qui génère les 4 chiffres secrets entre 1 et 9
    public void genererCombinaison() {
        secret = new int[4];
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            secret[i] = r.nextInt(9) + 1; // Génère un entier de 1 à 9
        }
    }

    // Permet à la fenêtre d'accéder à un chiffre secret
    public int getChiffre(int index) {
        return secret[index];
    }
}



