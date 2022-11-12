package praticaP08_2;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calculaSalarioLiquido () {
		return salarioBruto - imposto;
	}
	
	public void aumentaSalario(double porcentagem) {
		double aumento = (porcentagem / 100) * salarioBruto; 
		double aumentar = calculaSalarioLiquido() + aumento;
		System.out.println("Dados atualizados: ");
		System.out.print("Nome: " + nome + ", Salário: R$" + aumentar);
	}
	
}
