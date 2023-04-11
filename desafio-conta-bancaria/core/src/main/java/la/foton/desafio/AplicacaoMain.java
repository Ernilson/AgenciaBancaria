package la.foton.desafio;

import java.util.Scanner;

import la.foton.desafio.Contas.ContaCorrente;
import la.foton.desafio.Contas.ContaPoupanca;

public class AplicacaoMain {

	public static void main(String... args) {		
		Scanner input = new Scanner(System.in);
		
		int operacao = 0;
		int conta=1;
		ContaCorrente cc = null;
		ContaPoupanca cp = null;
		
		do {
			System.out.println("Escolha uma operação:");
	        System.out.println("1. Criar Conta");
	        System.out.println("2. Realizar Depósito");
	        System.out.println("3. Realizar Saque");
	        System.out.println("4. Ver Saldo");
	        System.out.println("5. Sair");
	        operacao = input.nextInt();		

	        if (operacao == 1) {
	            System.out.println("Digite o número da agência:");
	            String agencia = input.next();
	            System.out.println("Digite o número da conta:");
	            int numero = input.nextInt();
	            System.out.println("Digite o tipo de conta:");
	            System.out.println("1. Poupança");
	            System.out.println("2. Corrente");
	            int tipo = input.nextInt();
	            if (tipo == 1) {
	                cp = new ContaPoupanca();
	                System.out.println("Conta poupança criada com sucesso!");
	            } else {
	                cc = new ContaCorrente();
	                System.out.println("Conta corrente criada com sucesso!");
	            }
	        } else if (operacao == 2) {
	            System.out.println("Digite o valor do depósito:");
	            double valor = input.nextDouble();
	            if (cp != null) {
	                cp.depositar(valor);
	                System.out.println("Depósito realizado com sucesso na conta poupança!");
	            } else {
	                cc.depositar(valor);
	                System.out.println("Depósito realizado com sucesso na conta corrente!");
	            }
	        } else if (operacao == 3) {
	            System.out.println("Digite o valor do saque:");
	            double valor = input.nextDouble();
	            if (cp != null) {
	                if (cp.sacar(valor) != null) {
	                    System.out.println("Saque realizado com sucesso na conta poupança!");
	                } else {
	                    System.out.println("Saldo insuficiente na conta poupança!");
	                }
	            } else {
	                if (cc.sacar(valor) != null) {
	                    System.out.println("Saque realizado com sucesso na conta corrente!");
	                } else {
	                    System.out.println("Saldo insuficiente na conta corrente!");
	                }
	            }
	        } else if (operacao == 4) {
	            if (cp != null) {
	                System.out.println("Saldo disponível na conta poupança: " + cp.getsaldo());
	            } else {
	                System.out.println("Saldo disponível na conta corrente: " + cc.getsaldo());
	            }
	        }
	    } while (operacao != 5);
	    System.out.println("Obrigado por utilizar nosso sistema!");
}
}
