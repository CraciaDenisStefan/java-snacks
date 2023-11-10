package org.lesson.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean continua = true;

	    while(continua) {
	    	System.out.print("Inserisci una stringa di lettere, numeri e caratteri speciali o 0 per uscire: ");
	        String input = in.nextLine();

	        	if (input.equals("0")) {
	                System.out.println("Sei uscito");
	                continua = false;
	            }else {
	                int lettere = 0;
	                int numeri = 0;
	                int cSpeciali = 0;

	                for(int i = 0; i < input.length(); i++) {
	                	
	                    char carattere = input.charAt(i);
	                    
	                    if (Character.isLetter(carattere)) {
	                        lettere++;
	                    }else if (Character.isDigit(carattere)) {
	                        numeri++;
	                    }else {
	                        cSpeciali++;
	                    }
	                }

	                System.out.println("N lettere: " + lettere);
	                System.out.println("N Numeri: " + numeri);
	                System.out.println("N caratteri speciali: " + cSpeciali);
	            }
	     }

	        in.close();
	}
}
