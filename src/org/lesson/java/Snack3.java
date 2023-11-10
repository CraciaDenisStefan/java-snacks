package org.lesson.java;

public class Snack3 {
	public static void main(String[] args) {
		
		int[] arrayNumeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sommaPosizioneDispari = 0;
		
	    for (int i = 0; i < arrayNumeri.length; i++) {            
	        if (i % 2 != 0) {
	            sommaPosizioneDispari += arrayNumeri[i];
	         }
	     }
	    
	     System.out.println("Somma elementi in posizione dispari: " + sommaPosizioneDispari);   
	}
}
