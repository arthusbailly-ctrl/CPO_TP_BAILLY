/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_arthus;

/**
 *
 * @author Arthus
 */
import java.util.Scanner;

public class TP2_convertisseurObjet_Arthus {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Convertisseur c1 = new Convertisseur();
Convertisseur c2 = new Convertisseur();


boolean continuer = true;
while (continuer) {
System.out.println("\n--- MENU CONVERTISSEUR ---");
System.out.println("1) Celsius -> Kelvin");
System.out.println("2) Kelvin -> Celsius");
System.out.println("3) Celsius -> Fahrenheit");
System.out.println("4) Fahrenheit -> Celsius");
System.out.println("5) Kelvin -> Fahrenheit");
System.out.println("6) Fahrenheit -> Kelvin");
System.out.println("7) Afficher compteurs");
System.out.println("0) Quitter");
System.out.print("Votre choix : ");
int choix = sc.nextInt();


switch (choix) {
case 1 -> {
System.out.print("Température (°C) : ");
double v = sc.nextDouble();
System.out.println("= " + c1.CelciusVersKelvin(v) + " K");
}
case 2 -> {
System.out.print("Température (K) : ");
double v = sc.nextDouble();
System.out.println("= " + c1.KelvinVersCelcius(v) + " °C");
}
case 3 -> {
System.out.print("Température (°C) : ");
double v = sc.nextDouble();
System.out.println("= " + c1.CelciusVersFahrenheit(v) + " °F");
}
case 4 -> {
System.out.print("Température (°F) : ");
double v = sc.nextDouble();
System.out.println("= " + c2.FahrenheitVersCelcius(v) + " °C");
}
case 5 -> {
System.out.print("Température (K) : ");
double v = sc.nextDouble();
System.out.println("= " + c2.KelvinVersFahrenheit(v) + " °F");
}
case 6 -> {
System.out.print("Température (°F) : ");
double v = sc.nextDouble();
System.out.println("= " + c2.FahrenheitVersKelvin(v) + " K");
}
case 7 -> {
System.out.println("Compteur c1 : " + c1);
System.out.println("Compteur c2 : " + c2);
}
case 0 -> continuer = false;
default -> System.out.println("Choix invalide");
}
}
sc.close();
}
}