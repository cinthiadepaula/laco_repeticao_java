package laco_condicional;

import java.util.Scanner;
public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int codigo_prod, quant;
		
		System.out.println("insita o código do item que deseja comprar: \n"
				+ "1 - Cachorro Quente - R$ 10,00 \n" +
					"2 - X Salada - R$ 15,00 \n" + 
					"3 - X Bacon - R$ 18,00 \n" +
					"4 - Bauru - R$ 12,00 \n" +
					"5 - Refrigerante - R$ 8,00 \n" +
					"6 - Suco de Laranja - R$ 13,00 \n" );
		
		codigo_prod = in.nextInt();
		
		System.out.println("Digite a quantidade: \n");
		quant = in.nextInt();
		
		switch(codigo_prod) {
		
		case 1: System.out.println(quant + " Cachorro Quente no valor total de R$" + (10.00 * quant));
			break;
		case 2: System.out.println(quant + " X-Salada no valor total de R$" + (15.00 * quant));
			break;
		case 3: System.out.println(quant + " X-Bacon no valor total de R$" + (18.00 * quant));
			break;
		case 4: System.out.println(quant + " Bauru no valor total de R$" + (12.00 * quant));
			break;
		case 5: System.out.println(quant + " Refrigerante no valor total de R$" + (8.00 * quant));
			break;
		case 6: System.out.println(quant + " Suco de Laranja no valor total de R$" + (13.00 * quant));
			break;
		default:
			System.out.println("Código Inválido!");
		
		}
		
		
	}
}


