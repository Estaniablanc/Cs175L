package bankAccount01;

import java.util.Scanner;

public class bankAccountTester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("please enter a starting balance: ");
        double amount = input.nextDouble();
        
        System.out.print("please enter an interest: ");
        double rate = input.nextDouble();
        
        BankAccount s1306205 = new BankAccount(amount,rate);
        
        System.out.println("Your started balance is: "+amount);
        
        System.out.println("please enter deposite amount: ");
        double deposit = input.nextDouble();
        s1306205.deposit(deposit);
        System.out.println("Balance after deposited amount: "+s1306205.getBalance());
        
        System.out.println("Please enter withdraw amount: ");
        double withdraw = input.nextDouble();
        s1306205.withdraw(withdraw);
        System.out.println("balance after withdrew: "+s1306205.getBalance());
        
        s1306205.calcInterest();
        
        System.out.println("Balance with calculated interest: "+s1306205.getBalance());
        
        input.close();
        
        
        		}
        		
        		

        	}

        
   
