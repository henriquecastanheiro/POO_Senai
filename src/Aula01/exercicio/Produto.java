package Aula01.exercicio;

public class Produto {

	String nome;
	double valor;
	int qtdd;
	
	public Produto(String nome, double valor, int qtdd) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.qtdd = qtdd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtdd() {
		return qtdd;
	}

	public void setQtdd(int qtdd) {
		this.qtdd = qtdd;
	}
}
