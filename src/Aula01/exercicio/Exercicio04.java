package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Exercicio04 {
/*
 * Implemente uma classe chamada “Aluno” que possua atributos para armazenar
 * o nome, a matrícula e as notas de um aluno. 
 * Adicione métodos para calcular a média das notas 
 * e verificar a situação do aluno (aprovado ou reprovado).
 */
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(null, null, 0);
		
		int qtddMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas deste semestre: "));
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: ")); 
		aluno.setMatricula(JOptionPane.showInputDialog("Digite a matricula de " + aluno.getNome()));

		aluno.calculaMedia(qtddMedia);
		
	}
}
