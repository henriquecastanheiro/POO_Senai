package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Exercicio06 {
/*
 * Implemente uma classe chamada “Produto” que possua atributos para armazenar
 * o nome, o preço e a quantidade em estoque. 
 * Adicione métodos para calcular o valor total em estoque 
 * e verificar se o produto está disponível.
 */
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(
				"Digite o nome do produto: ").toUpperCase();
		double valor = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o valor de " + nome + " : "));
		int qtddEstoque = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a quantidade de " + nome + " em estoque: ")); 
		
		Produto produto = new Produto(nome, valor, qtddEstoque);
		
		produto.verificarDisponibilidade();
	}
}
