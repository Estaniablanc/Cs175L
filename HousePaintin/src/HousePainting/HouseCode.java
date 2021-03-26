package HousePainting;
import java.util.Scanner;

public class HouseCode {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner estania = new Scanner(System.in);
         
        System.out.println("enter the cost of paint per sqr/ft");
        double paintCost = estania.nextDouble();
        
        System.out.println("input the length of the walls");
        double length = estania.nextDouble();
        
        System.out.println("input the width of the walla");
        double width = estania.nextDouble();
        
        System.out.println("input the height of the walls");
        double height = estania.nextDouble();
        
        System.out.println("input the number of window");
        double numWindow = estania.nextDouble();
        
        System.out.println("input the window length");
        double windowlength = estania.nextDouble();
        
        System.out.println("input the window height");
        double windowHeight = estania.nextDouble();
        
        System.out.println("input the number of doors");
        double numDoors = estania.nextDouble();
        
        System.out.println("input the door length");
        double doorLength = estania.nextDouble();
        
        System.out.println("input the door height");
        double doorHeigth = estania.nextDouble();
        
        double peakSide = (length*width + 0.5*(length*(height-width)))*2;
         
        double normSide = (length * width)*2;
        
        double totalDoors = doorLength * doorHeigth * numDoors;
        double totalWindows = windowlength * windowHeight * numWindow;
        
        double walls = (normSide)+(peakSide)-(totalWindows+totalDoors);
        
        double totalCost = walls * paintCost;
        System.out.println(walls + "sqr/ft");
        System.out.println("The total cost is $" + totalCost);
        estania.close();
        
        
        
	}

}
