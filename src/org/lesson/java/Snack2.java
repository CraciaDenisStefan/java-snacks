package org.lesson.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		Random rnd = new Random();
		
		final int VALUE_COUNT = 10;
		
		for (int i = 0; i < VALUE_COUNT; i++) {
          
            int nome = rnd.nextInt(nomi.length);
            int cognome = rnd.nextInt(cognomi.length);

      
            String nomeCasuale = nomi[nome];
            String cognomeCasuale = cognomi[cognome];

         
            System.out.println((i + 1) + ". " + nomeCasuale + " " + cognomeCasuale);
        }
	}
}
