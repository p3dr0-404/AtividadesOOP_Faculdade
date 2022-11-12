package praticaP08_3;

public class Estudante {
	
	private String nome;
	private double nota[] = new double[3];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double nota[]) {
		this.nota = nota;
	}
	
	double notaFinal = 0;
	public double calculaNota() {
		for (int i = 0; i < 3; i++) {
			notaFinal += nota[i];
		}
		return notaFinal;
	}
	
	boolean aprovado;
	public boolean calculaAprov() {
		if (notaFinal >= 60) {
			aprovado = true;
		} else {
			aprovado = false;
		}
		return aprovado;
	}
	public void mostraInfo() {
		System.out.println();
		System.out.print("Aluno: " + nome);
		System.out.println();
		System.out.print("NOTA FINAL = " + notaFinal);
		System.out.println();
		if (aprovado == true) {
			System.out.println("PASSOU");
		} else {
			System.out.println("FALHOU");
			System.out.println("Necessita de " + (60 - notaFinal) + " pontos");
		}
	}
}
