package org.lesson.java;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		System.out.print("Inserisci un numero:");
		String numero = in.nextLine();
		int n =  Integer.valueOf(numero);
		
		in.close();
		
		if (n % 2 == 0) {
			System.out.println("Il numero e pari:" + n);
		}else {
			int nSuccessivo = n+1;
			System.out.println("Il numero non e pari:" + nSuccessivo );
		}
	}
}
