package br.edu.ifrs.canoas.java.exercicio.excecao;

public class ChequeEspecialException extends Exception{

	private static final long serialVersionUID = 1003190266201286792L;

	private Double deficit;
	
	public ChequeEspecialException(String msg, Double deficit) {
		super(msg);
		this.deficit = deficit;		
	}
	
	public Double getDeficit() {
		return deficit;
	}

}
