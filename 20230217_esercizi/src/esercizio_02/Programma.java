package esercizio_02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programma {
	
	public static void menu(Scanner scanner, Set<Integer> numeri) {
		System.out.println("1 - Inserisci numero");
		System.out.println("2 - controllare esistenza di un numero");
		System.out.println("3 - rimuovere un numero");
		System.out.println("0 - esci");
		scelta(scanner, numeri);
	}
	public static void scelta(Scanner scanner, Set<Integer> numeri) {
		int scelta = scanner.nextInt();
		scanner.nextLine();
		while ( scelta < 0 || scelta > 3 ) {
			System.out.println("scelta non valida. inserire un numero da 1 a 3. digita 0 per uscire");
			scelta = scanner.nextInt();
			scanner.nextLine();
		}
		switch ( scelta ) {
		case 1:
			programma1(scanner, numeri);
			break;
		case 2:
			programma2(scanner, numeri);
			break;
		case 3:
			programma3(scanner, numeri);
			break;
		case 0:
			System.exit(0);
		}
	}
	
	public static void programma1(Scanner scanner, Set<Integer> numeri ) {
		System.out.println("inserisci numero");
		Integer numero = scanner.nextInt();
		numeri.add(numero);
		menu(scanner, numeri);
	}
	public static void programma2(Scanner scanner, Set<Integer> numeri) {
		System.out.println("inserisci numero da cercare");
		Integer numero = scanner.nextInt();
		
		if ( numeri.contains(numero) ) {
			System.out.println("numero presente");
		}
		else {
			System.out.println("numero non presente");
		}
		menu(scanner, numeri);
	}
	public static void programma3(Scanner scanner, Set<Integer> numeri) {
		System.out.println("inserisci numero da eliminare");
		Integer numero = scanner.nextInt();
		if ( !numeri.contains(numero) ) {
			System.out.println("nominativo non presente");
		}
		else {
			numeri.remove(numero);
		}
		menu(scanner, numeri);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> numeri = new HashSet<Integer>();
		menu(scanner, numeri);
		

	}

}
