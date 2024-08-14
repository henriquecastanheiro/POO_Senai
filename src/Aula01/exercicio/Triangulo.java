package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Triangulo {
/*
 * Crie uma classe chamada “Triângulo” com atributos para armazenar os três lados do triângulo. 
 * Implemente métodos para verificar se é um triângulo válido e calcular sua área.
 */
	int a;
	int b;
	int c;
	
	public Triangulo() {
		super();
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void verficarTriangulo(int a, int b, int c) {
		if(a + b > c && a + c > b && c + b > a) {
			if(a == b && a == c) {
				JOptionPane.showMessageDialog(null, "É um triângulo equilatero! \nA aréa deste triângulo é: ");
			}else if(a == b || a == c || b == c) {
				JOptionPane.showMessageDialog(null, "É um triângulo isósceles!");
			}else {
				JOptionPane.showMessageDialog(null, "É um triângulo escaleno!");
			}
			calculaArea(a, b, c);
		}else {
			JOptionPane.showMessageDialog(null, "Não é um triângulo!");
		}
	}
	
	public void calculaArea(int a, int b, int c) {
		int s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c) );
		JOptionPane.showMessageDialog(null, "A área deste triângulo é: " + area);
	}
	
	
}
