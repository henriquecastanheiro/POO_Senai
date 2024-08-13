package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:"));
		
		Funcionario funcionario = new Funcionario(nome, null, salario);
		
		CargoEnum cargoEscolhido = funcionario.escolherCargo();
		funcionario.setCargo(cargoEscolhido);
		
		JOptionPane.showMessageDialog(null, 
				"Nome: " + funcionario.getNome() + "\n" +
				"Salário: R$ " + funcionario.getSalario() + "\n" +
				"Cargo: " + funcionario.getCargo() + "\n" +
				"Salário com Desconto: R$ " + funcionario.calcularSalarioComDesconto());
	}
}
