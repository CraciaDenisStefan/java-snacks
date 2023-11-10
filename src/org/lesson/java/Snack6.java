package org.lesson.java;

import java.util.Scanner;
public class Snack6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.print("Inserisci un numero : ");
        String input = in.nextLine();

        in.close();
        
        int convert = 0;

        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);

            String strC = carattere + "";
            int cifra = strC.charAt(0) - '0';

    
            convert = convert * 10 + cifra;
        }

        System.out.println("Il numero convertito è: " + convert);
    
	}

}
