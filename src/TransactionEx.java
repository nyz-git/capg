import java.util.Scanner;

public class TransactionEx {
	
	static long  balance = 10000;
	
	public static void transaction(long amount, long accountNo) {
		
		if (balance>amount) {
			balance-=amount;
			System.out.println(amount+ " has been deposited to "+accountNo);
			System.out.println("Updated balance is "+balance);
		} else {
			System.out.println("Insufficient funds!!!!!!!!!!!");
		}
		
	}

	public static void transaction(double amount) {
		balance+=amount;
		System.out.println(amount+" has been credited to your account");
		System.out.println("Updated balance is "+balance);
	}

	public static void main(String[] args) {
		int option;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Press 0 for Credit or 1 for Debit");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter the amount that you want to debit/withdraw : ");
				long amount = sc.nextLong();
				transaction(amount);
			} else {
				System.out.println("Enter the account number that you wish to credit the amount");
				long accountNo = sc.nextLong();
				System.out.println("Enter the amount that you want to credit/deposit : ");
				long amount = sc.nextLong();
				transaction(amount, accountNo);
			}
			System.out.println("Press 1 to continue");
			option = sc.nextInt();
		} while (option == 1);
	}

}
