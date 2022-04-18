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
		
		System.out.println("1.Digite o numero da agência:");
		String agencia = input.next();
		System.out.println("Agência:" + agencia);
		System.out.println("2.Digite o numero do tipo de conta:");
		System.out.println("3.Digite o numero da conta:");
		System.out.println("4.Digite o valor do depoisto:");
		System.out.println("5.Digite o valor do saque:");
		operacao = input.nextInt();

		if (operacao == 1) {
		
			System.out.println("5.Digite o tipo de conta?\n1.Poupança\n2.Corrente:");
			conta = input.nextInt();
			if (conta == 1) {
			cc = new ContaCorrente();
			}else{
				cp = new ContaPoupanca();
			}			
			System.out.println("Conta criada com sucesso:");
			
		}else if(operacao==2){
			
		}else if(operacao==3){
			
		}else if(operacao==4){
			System.out.println("5.Digite o tipo de conta?\n1.Poupança\n2.Corrente:");
			conta = input.nextInt();
			if (conta==1) {
				System.out.println("Saldo disponivel da sua poupança  é:" + cp.depositar(conta));
			}else {
				System.out.println("Saldo disponivel da conta corrente é:" + cc.getsaldo());
			}
		}
		}while(operacao!=5);
	}
}
