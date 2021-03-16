package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class Testesaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(11, 2);

		conta.deposita(200);
		try {
			conta.saca(210);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(conta.getSaldo());
	}

}
