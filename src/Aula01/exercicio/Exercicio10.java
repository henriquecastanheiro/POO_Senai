package Aula01.exercicio;

public class Exercicio10 {
	/*
	 * Implemente uma classe chamada “Livro” com atributos para armazenar o título,
	 * o autor e o número de páginas do livro. Adicione métodos para emprestar o
	 * livro, devolvê-lo e verificar se está disponível.
	 */
	    public static void main(String[] args) {

	        Livro livro = new Livro("2015", "Diario de um Banana", 328);

	        System.out.println(livro.verificarDisponibilidade());

	        livro.emprestar();

	        System.out.println(livro.verificarDisponibilidade());

	        livro.devolver();


	        System.out.println(livro.verificarDisponibilidade());
	    }
	}
