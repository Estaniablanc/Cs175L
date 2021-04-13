package bankAccount01;

public class BankAccount {

	public static void main(String[] args) {
	}
	
		// TODO Auto-generated method stub
		/**
		   A bank account has a balance and a mechanism for
		   applying interest or fees at the end of the month.
		*/
		
		
		   private double balance;
		   //modiffied 
           private double interestPct;
           
           
           /**
		      Constructs a bank account with zero balance.
		   */ //modified
		   public BankAccount(double amount, double interestPct) 
		   {
		      balance = amount;
		      //modiffied
		      this.interestPct = interestPct;
		      
}

		   /**
		      Makes a deposit into this account.
		      @param amount the amount of the deposit
		   */
		   public void deposit(double amount)
		   {
			  // if (amount>0) {
		      balance += amount;
		      //System.out.println("\tDeposited: $"+amount);
			   }
		  // }

		   /**
		      Makes a withdrawal from this account, or charges a penalty if
		      sufficient funds are not available.
		      @param amount the amount of the withdrawal
		   */
		   
		   public void withdraw(double withdrawAmount)
		   { 
			   // this part is when a withdraw is happening and the account dont have enough 
			   if (withdrawAmount <= balance) 
			   {
				  balance-=withdrawAmount;  
				  System.out.println("\tWithdraw: $"+withdrawAmount);
				  
				  
				   
			   } else {  
				   
				   System.out.println("\tInsufficient Funds to support withdrawal: ");
				   
			   }
           }
		   
		   public void calcInterest()
		   {
			System.out.print("\tInterest: $"+ balance*interestPct+"      "); 
             }

		   /**
		      Gets the current balance of this bank account.
		      @return the current balance
		   */
		   public double getBalance()
		   {
		      return balance;
		   }
		
		   {
			 
		      
		   }
		}
	
