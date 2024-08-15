package Aula01.exercicio;

public class Exercicio08 {
	public static void main(String[] args) {
	
		Carro meuCarro = new Carro("Toyota", "Corolla");

		meuCarro.exibirVelocidade();

		meuCarro.acelerar(20);
		meuCarro.acelerar(30); 

		meuCarro.frear(10);
		meuCarro.frear(50); 

		meuCarro.exibirVelocidade();
	}
}