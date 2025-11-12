package tp2_bieres_Arthus; 


/**
* TP2 – Ex.1 : BouteilleBiere
* Auteur : Arthus
*/
public class BouteilleBiere {

public String nom; 
public double degreAlcool; 
public String brasserie; 
public boolean ouverte; 


// Constructeur (3 paramètres) question 11
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false; 
}



public void lireEtiquette() {
System.out.println("Bouteille de " + nom + " (" + degreAlcool +
" degres)\nBrasserie : " + brasserie);
}



public boolean Decapsuler() {
if (!ouverte) {
ouverte = true;
return true;
} else {
System.out.println("Erreur : biere déjà ouverte");
return false;
}
}

@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true) chaine_a_retourner += "oui"; else chaine_a_retourner += "non";
return chaine_a_retourner;
}
}