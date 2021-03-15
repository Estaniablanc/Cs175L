package bankAccount1;

public class bankAccount {

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
		   public bankAccount(double amount, double interestPct) 
		   //After entering the amount of money started of with and interest rate will print out the message stating the imformation back
		   {
		      balance = amount;
		      //modiffied
		      this.interestPct = interestPct;
		      System.out.println("\tCreated new account with "+balance+"balance and interest rate "+interestPct);
		      //calcInterest = amount;
}

		   /**
		      Makes a deposit into this account.
		      @param amount the amount of the deposit
		   */
		   public void deposit(double amount)
		   {
			   if (amount>0) {
		      balance += amount;
		      System.out.println("\tDeposited: $"+amount);
			   }
		   }

		   /**
		      Makes a withdrawal from this account, or charges a penalty if
		      sufficient funds are not available.
		      @param amount the amount of the withdrawal
		   */
		   
		   public void withdraw(double amount)
		   { 
			   // this part is when a withdraw is happening and the account dont have enough 
			   if (0 > amount) return;
				   //balance = balance - amount;
			   else if(amount>balance) {   
				   System.out.println("\tInsufficient Funds to support withdrawal: ");
			   } else {  
				   balance-=amount;
				   System.out.println("\tWithdraw: $"+amount);
				   
			   }
           }
		   
		   public void calcInterest()
		   {
			System.out.print("\tInterest: $"+ balance*interestPct); //im not sure why the interest and balance is being printed on the sam line
		      balance+=balance*interestPct;
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
	
