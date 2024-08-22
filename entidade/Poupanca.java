package entidade;

public class Poupanca extends Conta {

	public Poupanca(String nome, int numero, double saldo) {
		super(nome, numero, saldo, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Poupanca = "+ mostrar();
	}
     
	
	
}
