package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Funcionario {
/*
 * Crie uma classe chamada “Funcionário” com atributos para armazenar 
 * o nome, o salário e o cargo do funcionário. 
 * Implemente métodos para calcular o salário líquido, 
 * considerando descontos de impostos e benefícios.
 */
	
	String nome;
	CargoEnum cargo;
	double salario;
	
	public Funcionario(String nome, CargoEnum cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public CargoEnum getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setCargo(CargoEnum cargo) {
		this.cargo = cargo;
	}

	public CargoEnum escolherCargo() {
		int opcaoCargo = Integer.parseInt(JOptionPane.showInputDialog(
	"Informe a sua profissão: \n1 - OUTROS \n2 - PEDREIRO \n3 - CARPINTEIRO \n4 - JOGADOR"));

		for(CargoEnum cargo : CargoEnum.values()) {
			if (cargo.getOpcao() == opcaoCargo) {
				return cargo;
		}
	}
		JOptionPane.showMessageDialog(null, "Opção inválida!");
		return null;
}
	public double calcularSalarioComDesconto() {
		return salario - (salario * cargo.getDesconto());
	}
}
