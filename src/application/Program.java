/*Programa que lê 20 números aleatórios (entre 1 e 100) e armazena-os em um vetor.
Ao final, mostra os números e seus sucessores.
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
		
		System.out.println("Números Aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.println(numero + " ");
		}
		
		System.out.println("\nSucessores dos Números Aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.println((numero+1) + " ");
		}
	}
}
