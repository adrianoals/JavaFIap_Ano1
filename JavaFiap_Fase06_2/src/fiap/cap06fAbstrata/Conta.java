package fiap.cap06fAbstrata;

import fiap.cap06ePolimorfismo.SaldoInsuficienteException;

public abstract class Conta {

	protected double saldo;

	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor > saldo){
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}
	public abstract double verificarSaldo();
}
