package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre = "", estado = "", continuar = "S";
		int edad = 0, num_reg = 0, na = 0;
		
		//    |   -> ALT + 124
		while(continuar.equals("S") || continuar.equals("s")) {
			num_reg++;
			
			System.out.println("\n*****************************");
			System.out.println("**** R E G I S T R O [" + num_reg + "] ****");
			System.out.println("*****************************");
			
			System.out.print("Nombre del participante.........: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad del participante...........: ");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				na++;
			}
			else
				estado = "Menor de edad";
			
			System.out.println("Estado del participante.........: " + estado);
			
			// Reinicio de la lectura de texto
			sc.nextLine();
			
			System.out.print("�Desea continuar con otro participante <S/N>?: ");
			continuar = sc.nextLine();
		}
		
		System.out.println("\n... R E S U M E N ...");
		System.out.println("---------------------");
		System.out.println("Participantes registrados.......: " + num_reg);
		System.out.println("Participantes aptos para votar..: " + na);
	}
	
}
