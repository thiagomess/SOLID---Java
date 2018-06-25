package br.com.alura.tdd.exercicio5;

public class ContaDeEstudante implements Conta {
	
	private int milhas;
	private ManipuladorDeSaldo manipulador;
	
	public ContaDeEstudante() {
		manipulador = new ManipuladorDeSaldo();
	
	}

    public void deposita(double valor) {
    	manipulador.deposita(valor);
    	this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

    public void rende() {
       
    }
    
    public double getSaldo() {
    	return manipulador.getSaldo();
    }

	@Override
	public void saca(double valor) {
		manipulador.saca(valor - 0.1);
	}
    

}
