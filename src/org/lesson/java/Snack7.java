package org.lesson.java;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il numero di secondi: ");
        int inputSecondi = in.nextInt();

        in.close();
        
        int ore = inputSecondi / 3600;
        int minuti = (inputSecondi % 3600) / 60;
        int restantiSecondi = inputSecondi % 60;
      
        String risultato = String.format("%02d:%02d:%02d", ore, minuti, restantiSecondi);

        System.out.println("Il risultato è: " + risultato);
    
	}
}
