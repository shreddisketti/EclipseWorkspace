package promineotech.com;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("My first Java Program!");
/// Savings account  examples of operations below
		
		double savingsAccountBalance = 29.00;
		double depositAmount = 100.00;
		double withdrawalAmount = 50.00;
		double newSavingsAccountBalance = 0.00;
/// Balance Inquiry
		System.out.println("The balance in your acount is: $" + savingsAccountBalance);

/// Check Deposit
		
		newSavingsAccountBalance = savingsAccountBalance + depositAmount;
		System.out.println("You have deposited: $" + depositAmount);
		System.out.println("Your new balance is: $" + newSavingsAccountBalance);
		
/// Now Make A Withdrawal
		newSavingsAccountBalance = newSavingsAccountBalance - withdrawalAmount;
		System.out.println("You have withdrawn: $" + withdrawalAmount);
		System.out.println("Your new balance is: $" + newSavingsAccountBalance);
		
				
				
		
		
	}

}
