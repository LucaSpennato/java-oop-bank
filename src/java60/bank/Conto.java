package java60.bank;

import java.util.Random;

public class Conto {

	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	
	public Conto(String nomeProprietario) {
		saldo = 0;
		this.nomeProprietario = nomeProprietario;
		setNumeroConto();
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	private void setNumeroConto() {
		Random rnd = new Random();
		
		this.numeroConto = rnd.nextInt(999999999);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public int getSaldo() {
		return saldo;
	}

	public void addMoney(int addMoney) {
		 saldo += addMoney;
	}
	
	public boolean getMoney(int withdrawal) {
		if(saldo >= withdrawal) {			
			saldo -= withdrawal;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Num conto: " + numeroConto
				+ "\nName: " + nomeProprietario
				+ "\nSaldo: " + saldo + "$";
	}
	
}
