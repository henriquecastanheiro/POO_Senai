package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Aluno {
	
	String nome;
	String matricula;
	int nota;
	
	public Aluno(String nome, String matricula, int nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void calculaMedia(double qtddMedia) {
		double media = 0;
		double soma = 0;
		for(int i = 0; i < qtddMedia; i++) {
			this.nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a " +(i+1)+"ª nota de "+this.nome + " : "));
			soma += this.nota;
			System.out.println(soma);
		}
		media = soma/qtddMedia;
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, this.nome + " está APROVADO! \nSua média é de " + media + ", \nParabéns!!");
		}
		if(media < 7) {
			JOptionPane.showMessageDialog(null, this.nome + " está REPROVADO! \nSua média é de " + media + ",\nSe esforçe mais ano que vem vai ser melhor.");
		}
	}
}
