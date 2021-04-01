package AgeCalculations;



import java.awt.Frame;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.LocalDate;
import javax.swing.JOptionPane;
public class AgeStimulationnn {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Frame BD=new Frame();
		        String [] Birthday = JOptionPane.showInputDialog(BD," Enter your Birthday (MM/DD/YYYY): ").split("/");
		        String [] Today = JOptionPane.showInputDialog(BD," Enter today's date (MM/DD/YYYY): ").split("/");
			  
		        ///covert string into local date
		        LocalDate BirthdayLD = LocalDate.of(Integer.parseInt(Birthday[2]),Integer.parseInt(Birthday[0]),Integer.parseInt(Birthday[1]));
		        LocalDate TodayLD = LocalDate.of(Integer.parseInt(Today[2]),Integer.parseInt(Today[0]),Integer.parseInt(Today[1]));

		        
		        
		        
		        //LocalDate BirthdayLD = LocalDate.parse(Birthday, DateTimeFormatter.ofPattern("MM/DD/YYYY"));
		        //LocalDate TodayLD = LocalDate.parse(Today, DateTimeFormatter.ofPattern("MM/DD/YYYY"));
		        
		        //calculation between the birdthday and date of today 
		        Period p = Period.between(BirthdayLD, TodayLD);
		        
		        
		        //output age 
		       JOptionPane.showMessageDialog(null," you are " + p.getYears()+"years and "+ p.getMonths()+"Month(s) old.");
		        
		       
		        
			}
			
		        }
	
