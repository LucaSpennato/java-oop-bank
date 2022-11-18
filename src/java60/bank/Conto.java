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
		 saldo = saldo + addMoney;
	}
	
	public boolean getMoney(int takenMoney) {
		if(saldo > 0 && saldo + 1 > takenMoney) {			
			saldo = saldo - takenMoney;
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
