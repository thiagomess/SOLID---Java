package br.com.alura.tdd.exercicio3;

public class Teste {
	
	public static void main(String[] args) {
		
		TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
		CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
		Compra produto = new Compra(5000.0, "Sao Paulo");
		
		calculadora.calcula(produto);
	}
	
}
