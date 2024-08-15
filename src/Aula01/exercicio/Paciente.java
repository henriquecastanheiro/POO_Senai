package Aula01.exercicio;

	import java.util.ArrayList;

	public class Paciente {
	    private String nome;
	    private int idade;
	    private ArrayList<String> historicoConsultas;

	    public Paciente(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	        this.historicoConsultas = new ArrayList<>();
	    }

	    public void adicionarConsulta(String consulta) {
	        historicoConsultas.add(consulta);
	        System.out.println("Consulta '" + consulta + "' adicionada ao histórico.");
	    }

	    public void exibirConsultas() {
	        System.out.println("Histórico de consultas de " + nome + ":");
	        for (String consulta : historicoConsultas) {
	            System.out.println("- " + consulta);
	        }
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public ArrayList<String> getHistoricoConsultas() {
	        return historicoConsultas;
	    }
	}

