/* VERSION 0.1
 * -SOLL DAS BACKBONE WERDEN
 * -ALLE METHODEN UND SO HIER
 * 
 * 
 */
public class Backbone{

	static int[][] Buchungen = new int[11][5];
	
	
	public static void reserve(int nr, int start, int end, int pers, int knr) {
		
		Buchungen[nr][1] = start;
		Buchungen[nr][2] = end;
		Buchungen[nr][3] = pers;
		Buchungen[nr][4] = knr;
	}
}
