package la.foton.desafio.Contas;

import java.util.Date;

public class ContaCorrente {

	private String nomeCliente;
	private String senhaCliente;
	private String numeroAgencia;
	private Integer numeroConta;
	private double saldo;
	private int tipoConta;
	private Date aniversario;	

	public ContaCorrente(String nomeCliente, String senhaCliente, String numeroAgencia, Integer numeroConta,
			double saldo, int tipoConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.senhaCliente = senhaCliente;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}
	
	public ContaCorrente() {

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

	public String getnumeroAgencia() {
		return numeroAgencia;
	}

	public void setnumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public Integer getnumeroConta() {
		return numeroConta;
	}

	public void setnumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getsaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

	public int gettipoConta() {
		return tipoConta;
	}

	public void settipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
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
	
	public String depositar(double valor) {
		if (saldo == 0) {
			return "Saque realizado com sucesso!!";
		}
		saldo = saldo + valor;
		return "-->" + saldo;
	}

	
}
