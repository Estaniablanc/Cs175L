import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//input and output
		
		System.out.print("please input the number of bottle: ");
        Scanner in=new Scanner(System.in);
        int bottle=in.nextInt();
        //if its int it has to eqaul to next int same as double
        System.out.println(bottle);
        
        System.out.print("how much is one bottle? ");
        double price=in.nextDouble();
        System.out.println(price);
        
        double payment=bottle*price;
        
        System.out.printf("%6.3f" ,payment);
        //that 6 means use 6 value or characters
        //the 3 is how many decimal you wants to show 
        System.out.println();
        //System.out.println(payment);
            
	}

}
