package tp2_convertisseurobjet_arthus;


/**
author : Arthus
*/
public class Convertisseur {
private int nbConversions; 



public Convertisseur() {
nbConversions = 0;
}


public double CelciusVersKelvin(double tC) {
nbConversions++;
return tC + 273.15;
}


public double KelvinVersCelcius(double tK) {
nbConversions++;
return tK - 273.15;
}


public double CelciusVersFahrenheit(double tC) {
nbConversions++;
return tC * 9.0 / 5.0 + 32.0;
}


public double FahrenheitVersCelcius(double tF) {
nbConversions++;
return (tF - 32.0) * 5.0 / 9.0;
}


public double KelvinVersFahrenheit(double tK) {
nbConversions++;
double tC = KelvinVersCelcius(tK); 
return CelciusVersFahrenheit(tC);
}


public double FahrenheitVersKelvin(double tF) {
nbConversions++;
double tC = FahrenheitVersCelcius(tF);
return CelciusVersKelvin(tC);
}


@Override
public String toString() {
return "nb de conversions" + nbConversions; 
}
}
