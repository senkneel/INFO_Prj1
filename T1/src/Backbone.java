/* VERSION 0.7
 * -SOLL DAS BACKBONE WERDEN
 * -ALLE METHODEN UND SO HIER
 * 
 * 
 */
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class Backbone{

	static int[][] Buchungen = new int[11][5];
	static int nr=0;
	
	
	public static void reserve(int bnr, int start, int end, int pers, int knr) {
		
		for (int i = 0; i < nr+1; i++) {
			 if(Buchungen[i][0]== bnr) {
				 if(start > Buchungen[i][1] && start < Buchungen[i][2] || end > Buchungen[i][1] && end < Buchungen[i][2]) {
					 
					Buchungen[nr][0] = bnr;
					Buchungen[nr][1] = start;
					Buchungen[nr][2] = end;
					Buchungen[nr][3] = pers;
					Buchungen[nr][4] = knr;
				 }
				 else {
					 //FEHLER
				 }
			 }
			 
			 else {
				 
				 Buchungen[nr][0] = bnr;
				 Buchungen[nr][1] = start;
				 Buchungen[nr][2] = end;
				 Buchungen[nr][3] = pers;
				 Buchungen[nr][4] = knr;
			 }
			 
			}
	
	}
	
	public static void see() {
	
		
		
		
	}
}
