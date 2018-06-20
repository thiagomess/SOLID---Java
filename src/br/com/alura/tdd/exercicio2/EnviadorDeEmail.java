package br.com.alura.tdd.exercicio2;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {
	
	public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }

}
