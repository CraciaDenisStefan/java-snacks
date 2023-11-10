package org.lesson.java;

import java.util.Scanner;

public class Snack4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci una parola o una frase: ");
	    String input = in.nextLine();
	    
	    in.close();
	    
	    String senzaSpazi = input.replaceAll("\\s", "").toLowerCase();
	    
	    boolean ePalindroma = true;
	    int lunghezza = senzaSpazi.length();
	    
	    for (int i = 0; i < lunghezza; i++) {
            if (senzaSpazi.charAt(i) != senzaSpazi.charAt(lunghezza - 1 - i)) {
                ePalindroma = false;
                break;
            }
        }
	    if (ePalindroma) {
            System.out.println("La stringa inserita è palindroma.");
        } else {
            System.out.println("La stringa inserita non è palindroma.");
        }
	}
}
