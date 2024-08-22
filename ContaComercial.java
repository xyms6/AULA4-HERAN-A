package e;

public class ContaComercial extends Conta {
	private double limiteDeCredito;
	
	public ContaComercial(String titular, double saldo, String corCartao, double limiteDeCredito) {
		super(titular, saldo, corCartao);
		this.limiteDeCredito = limiteDeCredito;
		
	}
	public void exibirDetalhes() {
		System.out.println("Conta Comercial:");
		super.exibirDetalhes();
        System.out.println("Limite de Crédito: R$ " + limiteDeCredito);
	}
}

