package br.com.alura.tdd.exercicio5;

public class ContaComum implements Conta {
	
	private ManipuladorDeSaldo manipulador;

    public ContaComum() {
        this.manipulador = new ManipuladorDeSaldo();
    }
     
    public void saca(double valor) {
    	manipulador.saca(valor - 0.05);
    }
    
    public void deposita(double valor) {
    	manipulador.deposita(valor);
    	
    }
    

    public void rende() {
        this.manipulador.rende(1.1); 
    }
    
    public double getSaldo() {
    	return manipulador.getSaldo();
    }

}
