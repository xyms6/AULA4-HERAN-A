package entidade;

public class Conta {
    private String nome;
    private int numero;
    private double saldo;
    
	public Conta(String nome, int numero, double saldo, double limite) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
    


	public void sacar(double sacar) {
		saldo = saldo - sacar;
    }
    public void depositar(double depositar) {
        saldo = saldo + depositar;
    }
    
    public String mostrar() {
    	return " O nome é " + nome + " O saldo é "+ saldo;
    }
}