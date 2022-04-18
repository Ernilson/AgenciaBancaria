package la.foton.desafio.Contas;

import java.util.Date;

public class ContaPoupança {

	private String nomeCliente;
	private String senhaCliente;
	private String numeroAgencia;
	private Integer numeroConta;
	private double saldo;
	private Date aniversario;
	
	
	public ContaPoupança() {
		
	}


	public ContaPoupança(String nomeCliente, String senhaCliente, String numeroAgencia, Integer numeroConta,
			double saldo, Date aniversario) {
		super();
		this.nomeCliente = nomeCliente;
		this.senhaCliente = senhaCliente;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.aniversario = aniversario;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getSenhaCliente() {
		return senhaCliente;
	}


	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}


	public String getNumeroAgencia() {
		return numeroAgencia;
	}


	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}


	public Integer getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Date getAniversario() {
		return aniversario;
	}


	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public String sacar(double valor) {
		if (valor < saldo) {
			saldo = saldo - saldo;
			return "Saque realizado com sucesso!!";
		}else {
			return "Saldo insuficiente";
		}		
	}
	
	public double depositar(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
		
}
