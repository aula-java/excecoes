package br.edu.ifrs.canoas.java.exercicio.entidade;

import br.edu.ifrs.canoas.java.exercicio.excecao.ChequeEspecialException;

public class Conta {
	
	private Double saldo;
	
	public Conta(Double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void deposita(Double valor){
		this.saldo+= valor;
	}
	
	public Boolean saca(Double valor) throws ChequeEspecialException{
		if (valor <= saldo){
			this.saldo-= valor;
			return true;
		}
		return false;
	}

}
