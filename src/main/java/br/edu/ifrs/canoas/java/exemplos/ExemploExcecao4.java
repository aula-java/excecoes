package br.edu.ifrs.canoas.java.exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExemploExcecao4 {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Quantos anos voce tem ?");
			String inputLine = in.readLine();
			int idade = Integer.parseInt(inputLine);
			idade++;
			System.out.println("No proximo ano voce tera: " + idade);
		} catch (Exception exception) {
			// detonamos as excecoes
			// na verdade elas nao foram tratadas
		}
	}

}
