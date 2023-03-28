package cap.seis.tres;

/**
 * Classe que abstrai uma conta bancária
 * @author drili
 * @version 1.0
 */

public class Conta {
	/**
	 * Número da conta
	 */
	public int numero;
	
	/**
	 * Número da Agência
	 */
	public int agencia;
	
	/**
	 * Saldo da Conta
	 */
	public double saldo;
	
	
	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que será depositado
	 */
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor
	 */
	public void retirar(double valor){
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	public double verificarSaldo(){
		return saldo;
	}
}