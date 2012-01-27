package br.com.palestra.calculadora;

public class Operacao {

	public static double multiplicacao(double a, double b) {
		return a*b;
	}
	
	public int limpar(){
		return 0;
	}

	public static double Divisao(double a, double b) {
		// Divisão por zero retorna 0. Só por convenção.
		if (b == 0.0) return 0;
		
		return a/b;
	}
}
