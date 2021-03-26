package bankAccount1;

import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
        //Scanner esta = new Scanner(System.in);
        Scanner blanc = new Scanner(System.in);
        
        //input the amount 1000
        System.out.println("Enter amount to start the account:");
        double startBal = blanc.nextDouble();
        
        System.out.println("Enter the interest rate for this account:");
        double intrate = blanc.nextDouble();
        
       
		bankAccount s1306205 = new bankAccount(startBal,intrate);   //account relying on
    
		
       
        
        //input the deposit amount 1500
        System.out.println("Enter amount to Deposit in the account: "); //
        double amount = blanc.nextDouble();
        s1306205.deposit(amount);
        
        
        //input  3000
        System.out.println("Enter amount to withdraw from the account: ");
        amount = blanc.nextDouble();
        s1306205.withdraw(amount);
        
        //input 2000
        System.out.println("Enter amount to withdraw from the account: ");
        amount = blanc.nextDouble();
        s1306205.withdraw(amount);
        
        
        System.out.println("if you want me to generate interest, enter 'yes': ");
        String yes = blanc.next();
      
        if(yes.equalsIgnoreCase(yes)) {
        	s1306205.calcInterest();
        
        }
        
        System.out.print("The account balance is: $"+s1306205.getBalance());
        
        
        
         
       
        blanc.close();
        
        
        
        
        
        
        
        
        
	}

}
