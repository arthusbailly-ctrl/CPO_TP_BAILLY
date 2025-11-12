package tp2_relation_1_arthus;


/**
* Auteur : Arthus
*/
public class TP2_relation_1_arthus {
public static void main(String[] args) {
// Création des voitures
Voiture uneClio = new Voiture("Clio", "Renault", 5);
Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
Voiture une2008 = new Voiture("2008", "Peugeot", 6);
Voiture uneMicra = new Voiture("Micra", "Nissan", 4);


// Création des personnes
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");


System.out.println("liste des voitures disponibles \n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);


// Relations (Q8, Q9) via la méthode ajouter_voiture (Q10)
boolean ok1 = bob.ajouter_voiture(uneClio);
boolean ok2 = bob.ajouter_voiture(uneAutreClio);
boolean ok3 = reno.ajouter_voiture(une2008);
boolean ok4 = reno.ajouter_voiture(uneMicra);


System.out.println("Bob => " + bob);
System.out.println("Reno => " + reno);
System.out.println("Clio proprietaire ? " + (uneClio.proprietaire == null ? "aucun" : uneClio.proprietaire.prenom));



boolean ko = reno.ajouter_voiture(uneClio); 
System.out.println("Tentative d'ajout d'une voiture déjà possédée (Reno prend la Clio de Bob) : " + ko);
}
}