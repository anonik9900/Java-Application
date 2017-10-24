package triangolox;

import java.util.Scanner;

public class triangolox {

	
	

		public static void main(String[] args) {	
			//Read a byte - nextByte()
			//	Read a short - nextShort()
			//	Read an int - nextInt()
			//	Read a long - nextLong()
			//	Read a float - nextFloat()
			//	Read a double - nextDouble()
			//	Read a boolean - nextBoolean()
			//	Read a complete line - nextLine()
			//	Read a word - next()
				
			// scanner clicca sulla lampadina per importare la libreria Scanner	
			// System.out.println(var.nextLine()); per input senza valore	
			// System.out.println() per avere una riga vuota
			
			int base;
			int altezza;
			
			
			
				
			
			do {
				System.out.println("Inserisci la base del triangolo:  ");
				Scanner var = new Scanner (System.in);
				base = var.nextInt();
			}while(base<0);
			System.out.println();
			System.out.println("La base inserita e' di cm:  "+base);
			System.out.println();
			
			do {
				System.out.println("Inserisci l'altezza del triangolo:  ");
				Scanner var = new Scanner (System.in);
				altezza = var.nextInt();
			}while(altezza<0);
			System.out.println();
			System.out.println("L'altezza inserita è di cm:  "+altezza);
			System.out.println("L'area del triangolo sarà di cm:  ");
			System.out.println(base*altezza/2);