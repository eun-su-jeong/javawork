package userDefineException02;

public class Bank {
	// 잔액 필드
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money)throws UserException {
		if(balance < money)
			throw new UserException("잔고 부족:" + (money - balance)+ "모자람");
		else
			balance -= money;
	}
	
	public int getBalance() {
		return balance;
	}
}
