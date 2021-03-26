package Roachpoopulation;
import javax.swing.JOptionPane;

import RoachPopulation.Roachpopulation;

import javax.swing.JOptionPane;
public class roachSimulation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter starting roach population: "));
		
		Roachpopulation bugs = new Roachpopulation(s);
		JOptionPane.showInputDialog(null, " The initial roach population is "+bugs.getRoaches());
		
		for(int y = 1; y <= 4;y++) {
			bugs.breed();
			JOptionPane.showInputDialog(null, " The roach population is "+y+"breading is "+bugs.getRoaches());
			double percent=Double.parseDouble(JOptionPane.showInternalInputDialog(null, " Enter the percentage for cycle 1: "));
			bugs.spray(percent);
			JOptionPane.showInputDialog(null, " The roach population after cycle is "+y+" "+percent+"percent spray is "+bugs.getRoaches());
		}
		
		
		 
	}
}


