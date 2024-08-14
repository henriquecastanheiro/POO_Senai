package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Produto {

	String nome;
	double valor;
	int qtddEstoque;
	
	public Produto(String nome, double valor, int qtddEstoque) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.qtddEstoque = qtddEstoque;
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

	public int getQtddEstoque() {
		return qtddEstoque;
	}

	public void setQtddEstoque(int qtddEstoque) {
		this.qtddEstoque = qtddEstoque;
	}
	
	public void verificarDisponibilidade() {
		if(this.qtddEstoque <= 0) {
			JOptionPane.showMessageDialog(null, "Produto Indisponível em estoque!");
		}else {
			calculaValorEmEstoque();
		}
	}
	
	public void calculaValorEmEstoque(){
		double valorEmEstoque = this.valor * this.qtddEstoque;
		JOptionPane.showMessageDialog(null, "ESTOQUE " + this.nome 
				+ "\n\nQuantidade Unitária: " + this.qtddEstoque 
				+ "\nValor Unitário: R$" + this.valor
				+ "\n\nValor total: " + valorEmEstoque);
	}
}
