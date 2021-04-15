
public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car myHybrid = new Car(50);
       myHybrid.addGas(20);
       myHybrid.drive(100);
       double gasLeft=myHybrid.getGasInTank();
       System.out.println("Remaining gas: "+ gasLeft);
	}

}
