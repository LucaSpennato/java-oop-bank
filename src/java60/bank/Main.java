package java60.bank;

public class Main {

	public static void main(String[] args) {
		
		int withdrawal = 100;
		Conto cn = new Conto("Gianni Fantoni");
		
		cn.addMoney(200);
		boolean areMoneyTaken = false;
		areMoneyTaken = cn.getMoney(withdrawal);
		System.out.println(cn);
		System.out.println("Withdrawal attempt: " + withdrawal + "$" + "\nWithdrawal success: " + areMoneyTaken);
		
		System.out.println("---------------------------------------------------------------------");
		
		withdrawal = 101;
		areMoneyTaken = cn.getMoney(withdrawal);
		
		cn.setNomeProprietario("Antonello Fantoni");
		
		System.out.println(cn);
		System.out.println("Withdrawal attempt: " + withdrawal + "$" + "\nWithdrawal success: " + areMoneyTaken);
		
	}
	
}
