package oito_cap_b;

import java.io.Serializable;

public class Conta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double saldo;
	private int agencia;
	private int numeroConta;
	
	
	//Método Construtor
	public Conta() {
		
	}
	
	//Método Construtor com 3 argumentos
	
	public Conta (double saldo, int agencia, int numeroConta) {
		
		this.saldo = saldo;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
				
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	

}
