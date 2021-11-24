/*Programa que l� 20 n�meros aleat�rios (entre 1 e 100) e armazena-os em um vetor.
Ao final, mostra os n�meros e seus sucessores.
*/

package application;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("N�meros Aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.println(numero + " ");
		}
		
		System.out.println("\nSucessores dos N�meros Aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.println((numero+1) + " ");
		}
	}
}
