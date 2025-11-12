package tp2_manip_arthus;

public class TP2_manip_arthus {
public static void main(String[] args) {

Tartiflette assiette1 = new Tartiflette(500);
Tartiflette assiette2 = new Tartiflette(600);
Tartiflette assiette3 = assiette2; 


System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);



assiette2.nbCalories += 100;
System.out.println("Après modification Assiette2 :");
System.out.println("Assiette2 = " + assiette2.nbCalories + ", Assiette3 = " + assiette3.nbCalories);

Tartiflette tmp = assiette1;
assiette1 = assiette2;
assiette2 = tmp;
System.out.println("Après swap, assiette1.nbCalories=" + assiette1.nbCalories + ", assiette2.nbCalories=" + assiette2.nbCalories);


// Q6 : exemples invalides (commentés car erreurs de compilation)
// Moussaka assiette666 = assiette1; // INVALIDE : types incompatibles
// Moussaka assiette667 = new Tartiflette(); // INVALIDE : constructeur et types

Moussaka[] table = new Moussaka[10];
for (int i = 0; i < table.length; i++) {
table[i] = new Moussaka(100 + i * 10); 
}
System.out.println("table[0].nbCalories=" + table[0].nbCalories + ", table[9].nbCalories=" + table[9].nbCalories);
}
}