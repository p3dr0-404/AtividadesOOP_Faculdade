package praticaP08_2;

import java.util.Scanner;


public class programaP08_2 {

	public static void main(String args[]) {
		
			Funcionario Funcionario01 = new Funcionario();
			Scanner input;
			
			System.out.print("Nome: ");
			input = new Scanner(System.in);
			String nome = "";
			nome += input.nextLine();
			Funcionario01.setNome(nome);
			
			System.out.print("Salário Bruto(R$): ");
			input = new Scanner(System.in);
			Funcionario01.setSalarioBruto(input.nextDouble());
			
			System.out.print("Imposto: ");
			input = new Scanner(System.in);
			Funcionario01.setImposto(input.nextDouble());
			
			System.out.println("Empregado: " + Funcionario01.getNome() + ", R$" + Funcionario01.calculaSalarioLiquido());
			System.out.println();
			System.out.print("Qual o porcentual para aumentar o salário?: ");
			input = new Scanner(System.in);
			double porcentual = input.nextDouble();
			
			Funcionario01.aumentaSalario(porcentual);
			
		}
		
	}

