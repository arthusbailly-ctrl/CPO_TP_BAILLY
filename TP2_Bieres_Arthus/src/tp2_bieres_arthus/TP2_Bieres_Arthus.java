/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_Arthus;

/**
 *
 * @author ME
 */
public class TP2_Bieres_Arthus {
    public static void main(String[] args) {

BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
BouteilleBiere leffe = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
BouteilleBiere ipa = new BouteilleBiere("IPA Maison", 5.5, "Atelier");
BouteilleBiere blanche = new BouteilleBiere("Blanche", 4.8, "MicroBrasserie");



uneBiere.lireEtiquette();
leffe.lireEtiquette();



uneBiere.Decapsuler();
System.out.println(uneBiere);
System.out.println(leffe);
System.out.println(ipa);
System.out.println(blanche);
}
}
