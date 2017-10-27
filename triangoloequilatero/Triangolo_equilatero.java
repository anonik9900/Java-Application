// Devolved By Anonik 

// Free Open Source Java Apps

// GNU LV3 

package triangoloequilatero;

import java.util.Scanner;

public class Triangolo_equilatero {
	
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
	
	
	int alato;
	int blato;
	int clato;

	// Cicle  Dove l'utente inserisce i dati 
	
	
	System.out.println("***Triangle Perimeter Calculator***");
	System.out.println("By Nicholas Impieri");
	System.out.println();
	
	
	do {
		System.out.println("Inserisci il primo lato :");
		Scanner var = new Scanner (System.in);
		alato = var.nextInt();
	}while (alato<0);
	System.out.println();
	System.out.println();
	
	do {
		System.out.println("Inserisci il secondo lato:  ");
		Scanner var = new Scanner (System.in);
		blato = var.nextInt();
	}while (blato<0);
	System.out.println();
	System.out.println();
	
	do {
		System.out.println("Inserisci il terzo lato:  ");
		Scanner var= new Scanner (System.in);
		clato = var.nextInt();
	}while (clato<0);
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println("Il perimetro del triangolo sarà di cm:  ");
	
	//Finestra di print in cui viene inserita l'operazione
	
	System.out.println(alato+blato+clato);


}

}
