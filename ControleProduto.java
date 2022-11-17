package praticaP09_1;

import java.util.Scanner;

public class ControleProduto extends Produto  {
	int i = 0;
	int j = 0;
	protected Produto p;
	protected Produto[] produtos = new Produto[10];
	Scanner input =  new Scanner(System.in);
	
	public double efetuaVenda(Produto p, int quantidade) {
		
		double precoFinal = (p.getPreco() * quantidade);
		System.out.println("Produto escolhido: " + p.getNome());
		System.out.println("Preço do produto: " + p.getPreco());
		System.out.println("Quantidade escolhida: " + quantidade);
		System.out.println();
		System.out.println("Produtos: ");		
		return precoFinal;
	}
	
	public Produto cadastraProdutos() {

		produtos[j] = new Produto();
		do {
			
			System.out.println("Cadastro de produtos: ");
			System.out.println("Digite 1 para cadastrar um produto");
			System.out.println("Digite 0 para sair do cadastro");
			System.out.print("> ");
			input = new Scanner(System.in);
			
			if (input.nextInt() == 1) {
			
				System.out.println();
				System.out.print("Nome do produto: ");
				input = new Scanner(System.in);
				String nome = "";
				nome += input.nextLine();
				produtos[j].setNome(nome);
				System.out.print("Preço do produto: ");
				input = new Scanner(System.in);
				produtos[j].setPreco(input.nextDouble());
				System.out.println("Produto Cadastrado!");
				j++;
				break;
			}
			
		} while (input.nextInt() != 0);
		
		return produtos[j];
	}
	
	public void setProdutos(Produto produtos) {
		this.produtos[j] = produtos;
	}
	public Produto getProdutos() {
		return produtos[j];
	}
	
}
