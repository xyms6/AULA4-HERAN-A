package Principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import e.ContaComercial;
import e.Contapoupança;

public class Principal {

	public static void main(String[] args) {
		Scanner maria = new Scanner(System.in);

        // Escolher o tipo de conta
        int tipoConta = 0;
        while (tipoConta != 1 && tipoConta != 2) {
            System.out.println("Escolha o tipo de conta (1 para Poupança, 2 para Comercial): ");
            tipoConta = maria.nextInt();
            if (tipoConta != 1 && tipoConta != 2) {
                System.out.println("Tipo de conta inválido. Por favor, escolha 1 ou 2.");
            }
        }

        maria.nextLine(); // Consumir a nova linha após a leitura de inteiro

        // Ler informações da conta
        System.out.println("Digite o nome do titular: ");
        String titular = maria.nextLine();

        double saldo = -1;
        while (saldo < 0) {
            System.out.println("Digite o saldo inicial: ");
            saldo = maria.nextDouble();
            if (saldo < 0) {
                System.out.println("Saldo não pode ser negativo. Digite novamente.");
            }
        }

        maria.nextLine(); // Consumir a nova linha após a leitura de double

        // Escolher a cor do cartão
        List<String> coresValidas = new ArrayList<>();
        coresValidas.add("rosa");
        coresValidas.add("preto");
        coresValidas.add("vermelho");

        String corCartao = "";
        boolean corValida = false;
        while (!corValida) {
            System.out.println("Escolha a cor do cartão (rosa, preto, vermelho): ");
            corCartao = maria.nextLine();
            if (coresValidas.contains(corCartao.toLowerCase())) {
                corValida = true;
            } else {
                System.out.println("Cor inválida. Por favor, escolha entre rosa, preto ou vermelho.");
            }
        }

        if (tipoConta == 1) {
            // Criar uma conta poupança
            Contapoupança contaPoupanca = new Contapoupança(titular, saldo, corCartao);
            contaPoupanca.exibirDetalhes();
        } else if (tipoConta == 2) {
            double limiteDeCredito = -1;
            while (limiteDeCredito < 0) {
                System.out.println("Digite o limite de crédito: ");
                limiteDeCredito = maria.nextDouble();
                if (limiteDeCredito < 0) {
                    System.out.println("Limite de crédito não pode ser negativo. Digite novamente.");
                }
            }

            // Criar uma conta comercial
            ContaComercial contaComercial = new ContaComercial(titular, saldo, corCartao, limiteDeCredito);
            contaComercial.exibirDetalhes();
        }

        maria.close();
    }
	}

