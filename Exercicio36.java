package aula_19_Arrays;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
//		Criar um vetor A com 11 elementos, indexados de 0 até 10. sendo que cada
//		elemento de vetor A é formado pela potência de base 2 elevado ao expoente
//		igual a posição do respectivo elemento, ou seja: vetorA[x] = Math.pow(2,x);
//		sugestão double A[11];
		
		Scanner ler = new Scanner(System.in);
		double[] vetorA = new double[11];

		System.out.print("Vetor A: ");
		for (int x = 0; x < vetorA.length; x++) {

			vetorA[x] = Math.pow(2, x);

			System.out.print(vetorA[x] + " ");
		}
	}
}
