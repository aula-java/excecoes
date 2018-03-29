package br.edu.ifrs.canoas.java.exercicio.entidade;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.ifrs.canoas.java.exercicio.excecao.ChequeEspecialException;

public class ContaCorrenteTest {

	ContaCorrente cc ;
	
	@Test(expected = ChequeEspecialException.class)
	public void testSaqueSemSucesso() throws ChequeEspecialException {
		cc = new ContaCorrente(100.0, 50.0);
		try{
			cc.saca(151.0);	
		}catch(ChequeEspecialException e){
			assertEquals(e.getDeficit(),-1.0,0);
			throw e;
		}
	}
	
	@Test
	public void testSaqueComSucessoSemChequeEspecial() throws ChequeEspecialException {
		cc = new ContaCorrente(100.0, 50.0);
		assertTrue("Deixa sacar o saldo da conta e não entra no cheque especial", cc.saca(100.0));
		assertEquals(cc.getChequeEspecial(),50.0, 0);
	}

	@Test
	public void testSaqueComSucessoComChequeEspecial() throws ChequeEspecialException {
		cc = new ContaCorrente(100.0, 50.0);
		assertTrue("Deixa sacar o saldo da conta e entra no cheque especial com 20", cc.saca(120.0));
		assertEquals(cc.getChequeEspecial(),30.0, 0);
	}

	@Test
	public void testSaqueComSucessoComChequeEspecialNoLimite() throws ChequeEspecialException {
		cc = new ContaCorrente(100.0, 50.0);
		assertTrue("Deixa sacar o saldo da conta e não entra no cheque especial com Zero", cc.saca(150.0));
		assertEquals(cc.getChequeEspecial(),0.0, 0);
	}


	
}
