package br.com.alura.tdd.exercicio3;

public class CalculadoraDePrecos {
	
	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;

	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public void calcula(Compra produto) {
		

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());
        
        int total = (int) (produto.getValor() * (1-desconto) + frete);
        
        System.out.println(total);
        
	}
		
}
