
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ME
 *import java.util.Random;
 */
public class Jeu {

    private int[] secret;

    public Jeu() {
        genererCombinaison();
    }

    public void genererCombinaison() {
        secret = new int[4];
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            secret[i] = r.nextInt(9) + 1;
        }
    }

    public int[] getSecret() {
        return secret;
    }
}
  
