package Aula01.exercicio;

public enum CargoEnum {
	OUTROS(1, 0.10),
	PEDREIRO(2, 0.07),
	CARPINTEIRO(3, 0.08),
	JOGADOR(4, 0.20);
	
	private final int opcao;
	private final double desconto;

	private CargoEnum(int opcao, double desconto) {
		this.opcao = opcao;
		this.desconto = desconto;
	}

	public int getOpcao() {
		return opcao;
	}
	public double getDesconto() {
		return desconto;
	}
	
}
