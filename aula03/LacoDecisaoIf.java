package com.igor.cursojava.aula03;

import java.util.Scanner;

// Operador lógico && --> E
// E1      E2    SAÍDA
// V       V      V
// V       F      F
// F       V      F
// F       F      F

// Operador lógico || --> OU
// E1      E2    SAÍDA
// V       V      V
// V       F      V
// F       V      V
// F       F      F

public class LacoDecisaoIf {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		int x = 80;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeira nota:");
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com a seguda nota:");
		n2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota:");
		n3 = leia.nextFloat();

		media = (n1 + n2 + n3)/3;
		
		System.out.println("\nMédia Aritimética: " + media);
		System.out.printf("\nMédia aritimética: %.2f",media);
		
		
		if(media >= 7 && media <= 10) {
			System.out.println("\nAluno aprovade!!!");
		}else if(media >=5 && media <7) {
			System.out.println("\nAlune de exame");
		}else {
			System.out.println("\nAlune Reprovade!!!");
		}
		
		if (x % 2 == 0) {
			System.out.println("\nO número " + x + " é par...");
		}else {
			System.out.println("\nO número " + x + " é ímpar...");
		}
		
		
	}

}
