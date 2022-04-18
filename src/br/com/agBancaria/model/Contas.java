package br.com.agBancaria.model;

import br.com.agBancaria.utilitarios.Utils;

public class Contas {
	
	private static int contadorDeContas = 1;
	
	private int numeroConta;
	private Cliente cliente;
	private Double saldo =0.0;
	
	public Contas() {
		// TODO Auto-generated constructor stub
	}

	public Contas(Cliente cliente) {		
		this.numeroConta = contadorDeContas;
		this.cliente = cliente;
		this.saldo = saldo;
		contadorDeContas += 1;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroConta() + 
				"\nNome: " + this.cliente.getNome() + 
				"\nCPF: " + this.cliente.getcpf() +
				"\nEmail: " + this.cliente.getEmail() +
				"\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
				"\n";
	}
	
	public void depositar(Double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu deposito foi realizado com sucesso;");
		}else {
			System.out.println("Não foi possivel realizar o depósito;");
		}
	}
	
	public void sacar(Double valor) {
		if (valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Seu saque foi realizado com sucesso;");
		}else {
			System.out.println("Não foi possivel realizar o saque!;");
		}
	}
	
	public void transferir(Contas contaParaDeposito, Double valor) {
		if (valor > 0 && this.getSaldo() >= valor) {
			
		}
	}
	

}
