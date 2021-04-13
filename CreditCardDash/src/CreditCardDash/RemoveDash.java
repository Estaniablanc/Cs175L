package CreditCardDash;

import java.util.Scanner;

public class RemoveDash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner remove=new Scanner(System.in);
      
      
      
      System.out.println("Enter a credit card number: ");
      String cardNum = remove.nextLine();
      
      char ch;
      int i=0;
      
      int end =-99;
      
      
      
      while(i<cardNum.length()) 
      {
    	  ch=cardNum.charAt(i);
    	  if(ch==' '|| ch=='-') 
    	  {
    		  String Before = cardNum.substring(0, i);
    		  String After = cardNum.substring(i+1);
    		  cardNum = Before+ After;
    	  }
    	  else
    	  {
    		  i+=1;
      System.out.println(cardNum);
      }
      

}}}
