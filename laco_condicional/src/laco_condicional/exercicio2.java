package laco_condicional;

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		
		System.out.println("Insira um valor inteiro ");
		a = in.nextInt();
		
		if(a%2 == 0) {
			if(a > 0) {
				System.out.println("número par, positivo");
			}else {
				System.out.println("número par, negativo");
			}
			
		}else {
			if(a > 0) {
				System.out.println("número impar, positivo");
			}else {
				System.out.println("número impar, negativo");
			}
		}
		

	}

}
