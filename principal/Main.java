package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.Poupanca;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bem-Vindo ao Banco Seduc 1");
		List<Conta> lista = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas contas você deseja cadastrar? ");
		int n = sc.nextInt();
				
		for(int i = 1; i <= n;i++) {
		
			System.out.println("Escolha sua Conta, Digite C parar Conta Corrente ou P Conta Poupança");
			String x = sc.next();
			if(x.equals("C")) {
			
				System.out.println("Digite o nome do dono da Conta: " + i);
				String nome = sc.next();
				
				System.out.println("Digite o numero: ");
				int numero = sc.nextInt();
				
				System.out.println("Digite o saldo:");
				double saldo = sc.nextDouble();
				
				System.out.println("Digite o Limite: ");
				double limite = sc.nextDouble();
				
				Conta conta = new Conta(nome, numero, saldo, limite);
				
				lista.add(conta);
			}	
			else {
				System.out.println("Digite o nome do dono da Conta: " + i);
				String nome = sc.next();
															
				System.out.println("Digite o numero: ");
				int numero = sc.nextInt();
				
				System.out.println("Digite o saldo:");
				double saldo = sc.nextDouble();
				
				lista.add(new Poupanca(nome, numero, saldo));
		
			}
			
		}
		
		
	   System.out.println(lista);
		
	}

}
