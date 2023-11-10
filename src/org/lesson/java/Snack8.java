package org.lesson.java;

import java.util.Scanner;

public class Snack8 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una parola: ");
		String parola = in.nextLine();
		
		in.close();
		
		String risultato = "";
		
		for (int i = 0; i < parola.length(); i++) {
			
			char c = parola.charAt(i);
			
			if (c == 'a') {
				risultato += 'o';
			}else if (c == 'o') {
				risultato += 'a';
			}else {
				risultato += c ;
			}
		}
		
		System.out.println("Nuova parola: " + risultato);
	}
}
