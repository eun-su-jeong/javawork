package userDefineException02;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10000000);
		System.out.println("현재잔액 :" + bank.getBalance());
		
		try {
			bank.withdraw(2000);
		}catch(UserException e){
			System.out.println(e.getMessage());
		}
		
	}

}
