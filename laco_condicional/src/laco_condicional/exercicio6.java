package laco_condicional;

import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name ;
		int codigo;
		float salario;
		
		System.out.println("Digite o nome do colaborador: ");
		name = in.nextLine();
		System.out.println("Digite o código do cargo: \n"
				+ "1 - Gerente \n"
				+ "2 - Vendedor \n"
				+ "3 - Supervisor \n"
				+ "4 - Motorista \n"
				+ "5 - Estoquista \n"
				+ "6 - Técnico de TI \n");
		codigo = in.nextInt();
		
		System.out.println("Digite o salário ");
		salario = in.nextFloat();
		
		switch(codigo) {
		
		case 1: System.out.println("Nome: " + name + "\n" + "Cargo: Gerente " + "\n" + 
		                            "Salario Reajustado:" + (salario + (salario * 10/100)) );
			break;
			
		case 2: System.out.println("Nome: " + name + "\n" + "Cargo: Vendedor"+ "\n" + 
                "Salario Reajustado:" + (salario + (salario * 7/100)) );
		break;
		
		case 3: System.out.println("Nome: " + name + "\n" + "Cargo: Supervisor"+ "\n" + 
                "Salario Reajustado:" + (salario + (salario * 9/100)) );
		break;

		case 4: System.out.println("Nome: " + name + "\n" + "Cargo: Motorista "+ "\n" + 
                "Salario Reajustado:" + (salario + (salario * 6/100)) );
		break;

		case 5: System.out.println("Nome: " + name + "\n" + "Cargo: Estoquista " + "\n" + 
                "Salario Reajustado :" + (salario + (salario * 5/100)) );
		break;

		case 6: System.out.println("Nome: " + name + "\n" + "Cargo: Tec. de TI"  + "\n" + 
                "Salario Reajustado:" + (salario + (salario * 8/100)) );
		break;
			
		default: System.out.println("Não existe esse código!");
		}
		
		
		

	}

}
