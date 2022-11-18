package java60.bank;

public class Conto {

	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	
	public Conto(String nomeProprietario) {
		saldo = 0;
		this.nomeProprietario = nomeProprietario;
		numeroConto = 0;
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
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

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Num conto: " + numeroConto
				+ "\nName: " + nomeProprietario
				+ "\nSaldo: " + saldo;
	}
	
}
