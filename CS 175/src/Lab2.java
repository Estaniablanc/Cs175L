import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner doblas = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        int difference;
        int product;
        double average;
        int distance;
        int maximum;
        int minimum;
        
        
        System.out.print("Enter first number: ");
        number1 = doblas.nextInt();
        System.out.print("Enter second number: ");
        number2 = doblas.nextInt();
        doblas.close();
        
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        average = (number1 + number2) / 2.0;
        distance = Math.abs(difference);
        maximum = Math.max(number1, number2);
        minimum = Math.min(number1, number2);
        
        
        
	}

}
