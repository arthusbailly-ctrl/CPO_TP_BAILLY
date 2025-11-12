package tp2_relation_1_arthus;


/*
*/
public class Voiture {
public String modele;
public String marque;
public int nbPlaces;
public Personne proprietaire; 


public Voiture(String modele, String marque, int nbPlaces) {
this.modele = modele;
this.marque = marque;
this.nbPlaces = nbPlaces;
this.proprietaire = null; 
}


@Override
public String toString() {
String p = (proprietaire == null) ? "(sans propriétaire)" : ("(proprio: " + proprietaire.prenom + ")");
return modele + " " + marque + " " + nbPlaces + "p " + p;
}
}