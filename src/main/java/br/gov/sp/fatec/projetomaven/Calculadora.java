package br.gov.sp.fatec.projetomaven;

public class Calculadora {

	private double n1, n2;
	
	public Calculadora (double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public Calculadora() {
		this (1,1);
	}
	
	public double Soma() {
		return n1 + n2;
	}
	
	public double Subtracao() {
		return n1 - n2;
	}
	
	public double Multiplicacao() {
		return n1 * n2;
	}
	
	public double Divisao() {
		return n1 / n2;
	}
	
}
