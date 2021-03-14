package RoachPopulation;


public class Roachpopulation {

	
	
		// TODO Auto-generated method stub
      private double Population;
      
      public Roachpopulation(int population)
      {
       this.Population = population;
	 }
      public void breed()
	   {
	     
		this.Population = this.Population*2;
	   }
      public void spray(double percent)
	   {
		   
		this.Population=this.Population-(int)(this.Population*percent/100);
	   } 
      public int getRoaches() {
	      return (int) this.Population;
	      
	   }
}
