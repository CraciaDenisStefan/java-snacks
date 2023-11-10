package org.lesson.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        String primo = in.nextLine();
		int primoNumero =  Integer.valueOf(primo);

        System.out.print("Inserisci il secondo numero: ");
        String secondo = in.nextLine();
		int secondoNumero =  Integer.valueOf(secondo);

        in.close();

        int somma = 0;
        for (int i = primoNumero; i <= secondoNumero; i++) {
            somma += i;
        }

        System.out.println("Risultato tra " + primoNumero + " e " + secondoNumero + " è: " + somma);
	}
}
