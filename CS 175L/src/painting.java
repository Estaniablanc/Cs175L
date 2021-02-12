import java.util.Scanner;

public class painting {

	public painting() {
		// TODO Auto-generated constructor stub
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner in = new Scanner(System.in);
	        
	         
	        System.out.println("enter the cost of paint per sqr/ft");
	        double paintCost = in.nextDouble();
	      
	        System.out.println("input the length of the walls");
	        double length = in.nextDouble();
	        
	        
	        
	        System.out.println("input the width of the walls");
	        double width = in.nextDouble();
	        
	        
	        System.out.println("input the height of the walls");
	        double height = in.nextDouble();
	        
	        
	        System.out.println("input the number of window");
	        double numWindow = in.nextDouble();
	        
	        
	        System.out.println("input the window length");
	        double windowLength = in.nextDouble();
	        
	        
	        System.out.println("input the window height");
	        double windowHeight = in.nextDouble();
	        
	        
	        System.out.println("input the number of doors");
	        double numDoors = in.nextDouble();
	        
	        
	        System.out.println("input the door length");
	        double doorLength = in.nextDouble();
	        
	        
	        System.out.println("input the door height");
	        double doorHeight = in.nextDouble();
	        
	        
	        double peakSide = (length*width + 0.5*(length*(height-width)))*2;
	         
	        double normSide = (length * width)*2;
	        
	        double totalDoors = doorLength * doorHeight * numDoors;
	        double totalWindows = windowLength * windowHeight * numWindow;
	        
	        double walls = (normSide)+(peakSide)-(totalWindows+totalDoors);
	        
	        double totalCost = walls * paintCost;
	        System.out.println(walls + "sqr/ft");
	        System.out.println("The total cost is $" + totalCost);
	        in.close();
	        
	        
	        
		}

	}
