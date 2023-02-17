package esercizio_01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programma {
	
	public static void menu(Scanner scanner, Set<String> nominativi) {
		System.out.println("1 - Inserisci nominativo");
		System.out.println("2 - controllare esistenza di un nominativo");
		System.out.println("3 - rimuovere un nominativo");
		System.out.println("0 - esci");
		scelta(scanner, nominativi);
	}
	public static void scelta(Scanner scanner, Set<String> nominativi) {
		int scelta = scanner.nextInt();
		scanner.nextLine();
		while ( scelta < 0 || scelta > 3 ) {
			System.out.println("scelta non valida. inserire un numero da 1 a 3. digita 0 per uscire");
			scelta = scanner.nextInt();
			scanner.nextLine();
		}
		switch ( scelta ) {
		case 1:
			programma1(scanner, nominativi);
			break;
		case 2:
			programma2(scanner, nominativi);
			break;
		case 3:
			programma3(scanner, nominativi);
			break;
		case 0:
			System.exit(0);
		}
	}
	
	public static void programma1(Scanner scanner, Set<String> nominativi ) {
		System.out.println("inserisci nominativo");
		String nome = scanner.nextLine();
		nominativi.add(nome);
		menu(scanner, nominativi);
	}
	public static void programma2(Scanner scanner, Set<String> nominativi) {
		System.out.println("inserisci nominativo da cercare");
		String nome = scanner.nextLine();
		
		if ( nominativi.contains(nome) ) {
			System.out.println("nominativo presente");
		}
		else {
			System.out.println("nominativo non presente");
		}
		menu(scanner, nominativi);
	}
	public static void programma3(Scanner scanner, Set<String> nominativi) {
		System.out.println("inserisci nominativo da eliminare");
		String nome = scanner.nextLine();
		if ( !nominativi.contains(nome) ) {
			System.out.println("nominativo non presente");
		}
		else {
			nominativi.remove(nome);
		}
		menu(scanner, nominativi);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Set<String> nominativi = new HashSet<String>();
		menu(scanner, nominativi);
		

	}

}
