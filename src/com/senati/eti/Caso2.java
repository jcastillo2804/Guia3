package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero...: ");
		int n = sc.nextInt();
		
		int sumatoria = 0; // Acumulador
		int i = 1;
		
		while (i <= n) {
			sumatoria += i;
			
			System.out.print(i + " + ");
			
			i++;
		}
		
		// System.out.println("La sumatoria es: " + sumatoria);
	}

}
