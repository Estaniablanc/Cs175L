package bankAccount1;

import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
        Scanner esta = new Scanner(System.in);
        Scanner blanc = new Scanner(System.in);
        
        //input the amount 1000
        System.out.println("Enter starting balance:");
        double startBal = blanc.nextDouble();
        
        bankAccount s1306205 = new bankAccount(startBal);
        
        //input the withdraw amount 500
        System.out.println("Enter Withdraw Amount: ");
        double withdraw = blanc.nextDouble();
        s1306205.withdraw(withdraw);
        
        //input the deposit amount 1500
        System.out.println("Enter Deposit Amount:");
        double deposit = blanc.nextDouble();
        s1306205.deposit(deposit);
        System.out.println("Your Balance Is: " + s1306205.getBalance());
         
        esta.close();
        blanc.close();
        
        
        
        
        
        
        
        
        //create a Bank Account called "myBankAccount" with a starting balance of 1000, withdraw 500, deposit 1500, get the balance and print the balance using the methods available in the BankAccount class.

        //All values should be accepted from the keyboard using the scanner.

       // For example: startBal, withDrawAmount, depositAmount
	}

}
