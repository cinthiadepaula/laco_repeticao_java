package laco_condicional;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, menos21 =0, mais50 =0;
		
		System.out.println("Digite uma idade");
		idade = in.nextInt();
		
		while(idade >=0 ) {
			if(idade < 21 ) {
				menos21++;
			}
			if(idade > 50) {
				mais50++;
			}
			System.out.println("Digite uma idade");
			idade = in.nextInt();
		}
		if(idade <=0) {
			System.out.println("Total de pessoas menores de 21 anos: " + menos21);
			System.out.println("Total de pessoas maiores de 50 anos: " + mais50);
		}

	}

}
