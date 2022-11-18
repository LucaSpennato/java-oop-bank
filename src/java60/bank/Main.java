package java60.bank;

public class Main {

	public static void main(String[] args) {
		
		Conto cn = new Conto("Gianni Fantoni");
		
		cn.addMoney(200);
		boolean areMoneyTaken = false;
		areMoneyTaken = cn.getMoney(100);
		areMoneyTaken = cn.getMoney(100);
		areMoneyTaken = cn.getMoney(50);
		
		System.out.println("Success: " + areMoneyTaken);
		System.out.println(cn);
		
	}
	
}
