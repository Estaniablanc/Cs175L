package bankAccount01;

import java.util.Scanner;

public class Threshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       
       System.out.println("please enter a starting balance: ");
       double openBal = in.nextDouble();
       
       System.out.println("Please enter interest: ");
       double interestPct = in.nextDouble();
       
       BankAccount s1306205 = new BankAccount(openBal,interestPct);
       
       System.out.println("Enter a threshold: ");
       
       while(in.hasNextDouble())
       {
    	   double threshold= in.nextDouble();
    	   s1306205 = new BankAccount(openBal,interestPct);
    	   int months = 0;
    	   
    	 if (openBal <= interestPct)
    	 {
    		 while(s1306205.getBalance() < threshold)
    		 {
    			 s1306205.calcInterest();
    			 months++;
    		 }
    		 System.out.print("Months to reach threshold: "+months);
    		 System.out.println("\nBalance: "+s1306205.getBalance());
    	 }
    	 else
    	 {
    		 System.out.println("The balance is greater. balance: "+s1306205.getBalance());
    	 }
    	 System.out.println("Please enter a threshold or type to end: ");
       }
       in.close();
	}

}
