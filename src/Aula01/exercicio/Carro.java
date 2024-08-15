package Aula01.exercicio;

public class Carro {

	private String marca;
	private String modelo;
	private int velocidadeAtual;


	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadeAtual = 0; 
	}

	public void acelerar(int incremento) {
		if (incremento > 0) {
			velocidadeAtual += incremento;
			System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
		} else {
			System.out.println("O valor de aceleração deve ser positivo.");
		}
	}

	public void frear(int decremento) {
		if (decremento > 0) {
			velocidadeAtual -= decremento;
			if (velocidadeAtual < 0) {
				velocidadeAtual = 0; 
			}
			System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
		} else {
			System.out.println("O valor de frenagem deve ser positivo.");
		}
	}

	public void exibirVelocidade() {
		System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}
