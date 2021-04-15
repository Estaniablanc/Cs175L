
public class Car {

	//private static final double Miles ;
	double fuelEfficiency;
	double fuelLevel = 0;
	//car drive getGasinntank 
	public Car(double inMiles) 
	{
		fuelEfficiency = inMiles;
	}
	
	public void addGas(double gasoline) 
	{
		fuelLevel+=gasoline;
		
	}
	public void drive(double inMiles) 
	{
		double gas= inMiles/fuelEfficiency;
		fuelLevel-=gas;
	}
	public double getGasInTank() 
	{
		return this.fuelLevel;
	}
		
		

}
