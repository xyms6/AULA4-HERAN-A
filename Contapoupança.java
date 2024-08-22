package e;

public class Contapoupança extends Conta {
	public Contapoupança(String titular, double saldo, String corCartao) {
		super(titular, saldo, corCartao);
		
	}

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta Poupança:");
        super.exibirDetalhes(); // Usa o método da classe base
    }
}


