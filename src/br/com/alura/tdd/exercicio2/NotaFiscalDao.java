package br.com.alura.tdd.exercicio2;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal{
	
	public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

}
