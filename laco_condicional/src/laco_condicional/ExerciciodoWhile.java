package laco_condicional;

import java.util.Scanner;
public class ExerciciodoWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um numero inteiro ou número 0 para finalizar: ");
			num = in.nextInt();
			if(num >0) {
				soma = soma + num;
			}
		}while (num != 0);
		
		System.out.println("A Soma dos números positibos é: " +soma);

	}

}
