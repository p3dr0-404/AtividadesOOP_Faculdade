package praticaP09_1;

import java.util.Scanner;

public class SistemaMercado {
	
	public static void main(String[] args) {
	
		int produtosCadastrados = 0, escolhaProduto, escolhaMenu1;
		double precoFinal = 0;
		Scanner input = new Scanner(System.in);
		int i = 0, j = 0;
		ControleProduto controleProduto = new ControleProduto();
		Produto produto = new Produto();
		
		do {
			
			System.out.println("Mercado Bom Preço");
			System.out.println("==============");
			System.out.println("Escolha uma opção: ");
			if (produtosCadastrados > 0) {
				System.out.println("2) Efetuar uma venda");
			}
			System.out.println("1) Cadastrar produtos ");
			System.out.println("0) Sair do programa");
			input = new Scanner(System.in);
			escolhaMenu1 = input.nextInt();
			
			if (escolhaMenu1 == 1) {
				controleProduto.cadastraProdutos();
				produtosCadastrados++;
			} else if (escolhaMenu1 == 2) {
			
				System.out.println("Produtos: ");
				for (i = 0; i <= (produtosCadastrados - 1); i++) {
					System.out.println((i + 1) + ") Nome: " + controleProduto.produtos[i].getNome() + ", Preço: R$" + controleProduto.produtos[i].getPreco() );
				}
				System.out.println("Escolha um produto: ");
				System.out.print("> ");
				input = new Scanner(System.in);
				escolhaProduto = (input.nextInt() - 1);
				controleProduto.setProdutos(controleProduto.produtos[escolhaProduto]);
				System.out.println();
				System.out.print("Escolha uma quantidade: ");
				input = new Scanner(System.in);
				produto.setQuantidade(input.nextInt());
				precoFinal += controleProduto.efetuaVenda(controleProduto.getProdutos(), produto.getQuantidade());
				System.out.println("Preço final: R$" + precoFinal);
				System.out.println("Deseja confirmar a venda? (s/n)");
				System.out.print("> ");
			    input = new Scanner(System.in);
			    
			    if (input.next().equals("s")) {
			    	System.out.println("Venda confirmada!");
			    } else if (input.next().equals("n")) {
			    	System.out.println("Venda cancelada!");
			    }
			}
			
		} while (escolhaMenu1 != 0);
	
	}

}
