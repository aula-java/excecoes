package br.edu.ifrs.canoas.java.exercicio.entidade;

import br.edu.ifrs.canoas.java.exercicio.excecao.ChequeEspecialException;

public class ContaCorrente extends Conta {

	private Double chequeEspecial;

	public ContaCorrente(Double saldo, Double chequeEspecial) {
		super(saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public Boolean saca(Double valor) throws ChequeEspecialException {
		
		if (super.saca(valor))
			return true;
		
		else if (valor <= (getSaldo() + chequeEspecial)) {
			chequeEspecial -= (valor-getSaldo());
			return super.saca(super.getSaldo());
			
		} else if (valor > (getSaldo() + chequeEspecial)) {
			Double deficit = (chequeEspecial + getSaldo()) - valor;
			throw new ChequeEspecialException(
					"Saldo insuficiente do cheque especial", deficit);
		}
		
		return false;

	}
}
