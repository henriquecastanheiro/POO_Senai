package Aula01.exercicio;

public class Exercicio09 {
	public static void main(String[] args) {

		Paciente paciente = new Paciente("João Silva", 45);

		paciente.adicionarConsulta("Consulta 1 - Check-up geral");
		paciente.adicionarConsulta("Consulta 2 - Exame de sangue");
		paciente.adicionarConsulta("Consulta 3 - Avaliação cardiológica");

		paciente.exibirConsultas();
	}
}
