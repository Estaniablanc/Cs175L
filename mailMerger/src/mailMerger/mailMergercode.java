package mailMerger;

import java.util.Scanner;

public class mailMergercode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner Blanc = new Scanner(System.in);
		
		
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";


        System.out.println("Please enter your first name: ");
        String firstName = Blanc.nextLine();
        replaceText1=replaceText1.replace("<firstName>", firstName);
        
        
     
        System.out.println("Please enter your last name: ");
        String lastName = Blanc.nextLine();
        replaceText1=replaceText1.replace("<lastName>", lastName);
        
        
        System.out.println("Please enter your house number: ");
        String houseNumber = Blanc.nextLine();
        replaceText2=replaceText2.replace("<houseNumber>", houseNumber);
        
        System.out.println("Please enter your street: ");
        String estania = Blanc.nextLine();
        replaceText2=replaceText2.replace("<street>", estania);

      
        
      
        
        System.out.println(replaceText1);
        System.out.println(replaceText2);
        
        
        System.out.println("Is this address correct? ");
        String address = Blanc.nextLine();
        replaceText3=replaceText3.replace("<yORn>", address);
        System.out.println(replaceText3);
        
	}

}
