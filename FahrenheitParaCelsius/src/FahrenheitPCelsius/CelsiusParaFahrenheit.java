package FahrenheitPCelsius;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
	//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite a temperatura em Celsius converter em Fahrenheit: ");
			
	final double  fator = 9.0/5.0; 	
	final double ajuste = 32;
	
	double Fahrenheit = entrada.nextDouble();
	
	double celsius = (Fahrenheit * fator) + ajuste ;
	
	System.out.printf("O valor em Fahrenheit é de %.1f: ",celsius);

}
}