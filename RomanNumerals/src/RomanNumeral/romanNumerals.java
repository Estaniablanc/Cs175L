package RomanNumeral;
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner roman = new Scanner(System.in);
		        
        int entered;
        
       
       String[] inRoman= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
       int [] digit= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
       StringBuilder romanNum = new StringBuilder();
        
       System.out.println("Please enter an integer: ");
        entered = roman.nextInt();
       Scanner.close();
       if (entered>=3999) {
    	   System.out.println("Invalid, must be >= 3999");
    	   System.exit(1);
       }
        
        //int i=0;
       for ( int i=0;
    		   i<digit.length;
    		   i++) 
       {
           while (entered >= inRoman[i]) 
       {
        	   entered-= inRoman[i];
       }
        	
        	 romanNum.append(inRoman[i]);
       
        }	
       System.out.println(entered+" in roman numerals is:"+ romanNum);
        	}
}
	
		
	
	
	


