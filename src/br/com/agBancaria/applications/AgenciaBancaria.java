package br.com.agBancaria.applications;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import br.com.agBancaria.model.Cliente;
import br.com.agBancaria.model.Contas;

public class AgenciaBancaria {

	static Scanner input = new Scanner(System.in);
	static ArrayList<Contas> contasBancarias;

	public static void main(String[] args) {
		contasBancarias = new ArrayList<Contas>();
		operacoes();
	}

	private static void operacoes() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("--------------------Bem vindos a nossa Ag�ncia-----------------------------");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("----------------------Selecione uma opera��o-----------------------------------");
		System.out.println("|	Op��o 1 - Criar conta ");
		System.out.println("|	Op��o 2 - Depositar");
		System.out.println("|	Op��o 3 - Sacar");
		System.out.println("|	Op��o 4 - Transferir");
		System.out.println("|	Op��o 5 - Listar");
		System.out.println("|	Op��o 6 - Sair");

		int operacao = input.nextInt();

		switch (operacao) {
		case 1:
			criarConta();
			break;
		case 2:
			depositar();
			break;
		case 3:
			sacar();
			break;
		case 4:
			transferir();
			break;
		case 5:
			listar();
			break;
		case 6:
			System.out.println("Opera��o finalizada!");
			System.exit(0);

		default:
			System.out.println("Op��o invalida!");
			operacoes();
			break;
		}

	}

	private static void criarConta() {
		System.out.println("\nNome : " );
		String nome = input.next();

		System.out.println("\nCPF : ");
		String cpf = input.next();

		System.out.println("\nEmail : ");
		String email = input.next();

		Cliente cliente = new Cliente(nome, cpf, email);

		Contas conta = new Contas(cliente);

		contasBancarias.add(conta);
		System.out.println("Sua conta foi criada com sucesso!");
		operacoes();

	}

	private static Contas encontrarConta(int numeroConta) {
		Contas conta = null;
		if (contasBancarias.size() > 0) {
			for (Contas c : contasBancarias) {
				if (c.getNumeroConta() == numeroConta) {
					conta = c;
				}
			}
		}
		return conta;
	}

	private static void depositar() {
		System.out.println("N�mero da conta: ");
		int numeroConta = input.nextInt();

		Contas conta = encontrarConta(numeroConta);

		if (conta != null) {
			System.out.println("Qual o valor que deseja depositar? ");
			Double valorDeposito = input.nextDouble();
			conta.depositar(valorDeposito);
			//System.out.println("Valor depositado com sucesso!");
		} else {
			System.out.println("Conta n�o encontrada!");
		}
		operacoes();
	}

	private static void sacar() {
		System.out.println("N�mero da conta: ");
		int numeroConta = input.nextInt();

		Contas conta = encontrarConta(numeroConta);

		if (conta != null) {
			System.out.println("Qual o valor que deseja sacar? ");
			Double valorSaque = input.nextDouble();
			conta.sacar(valorSaque);
			System.out.println("Valor depositado com sucesso!");
		} else {
			System.out.println("Conta n�o encontrada!");
		}
		operacoes();
	}

	private static void transferir() {
		System.out.println("N�mero da conta do remetente: ");
		int numeroContaRemetente = input.nextInt();

		Contas contaRemetente = encontrarConta(numeroContaRemetente);
		if (contaRemetente != null) {
			System.out.println("N�mero da conta do destinat�rio ");

			int numeroContaDestinatario = input.nextInt();

			Contas contaDestinatario = encontrarConta(numeroContaDestinatario);

			if (contaDestinatario != null) {
				System.out.println("N�mero da conta do destinat�rio ");
				Double valor = input.nextDouble();

				contaRemetente.transferir(contaDestinatario, valor);
			}
		}
		operacoes();
	}

	private static void listar() {
		if (contasBancarias.size() > 0) {
			for (Contas contas : contasBancarias) {
				System.out.println(contas);
			}
		} else {
			System.out.println("N�o ha contas cadastradas!");
		}
		operacoes();

	}

}
