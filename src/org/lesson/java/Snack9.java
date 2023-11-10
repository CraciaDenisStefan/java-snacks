package org.lesson.java;

public class Snack9 {
	
	public static void main(String[] args) {
		
		int[] numeri = {1, 2, 3, 4, 5,6};

       
        int[] arrayPari = new int[numeri.length];
        int[] arrayDispari = new int[numeri.length];

      
        int indicePari = 0;
        int indiceDispari = 0;

       
        for (int i = 0; i < numeri.length; i++) {
            int numero = numeri[i];

            if (numero % 2 == 0) {
                arrayPari[indicePari++] = numero;
            } else {
                arrayDispari[indiceDispari++] = numero;
            }
        }

 
        System.out.print("Pari: [");
        for (int i = 0; i < indicePari; i++) {
            System.out.print(arrayPari[i]);
            if (i < indicePari - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Dispari: [");
        for (int i = 0; i < indiceDispari; i++) {
            System.out.print(arrayDispari[i]);
            if (i < indiceDispari - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
	}
}
