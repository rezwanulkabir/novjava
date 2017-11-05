package flights;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String flights [][]=new String [4][4];
		
		flights[0][0]="dallas";
		flights[0][1]="dallas";
		flights[0][2]="s";
		flights[0][3]="dal";
		

	    flights[1][0]="dallas";
		flights[1][1]="dallas";
		flights[1][2]="dallas";
		flights[1][3]="dallas";
		
		flights[2][0]="dallas";
		flights[2][1]="dallas";
		flights[2][2]="dallas";
		flights[2][3]="dallas";
		
		flights[3][0]="dallas";
		flights[3][1]="dallas";
		flights[3][2]="dallas";
		flights[3][3]="dallas";
		
		/*System.out.println(flights [0] [2]);*/
		int rows=flights.length;
		int cols = flights[0].length;
		
		//argument for row
		for (int rownum=0; rownum<rows; rownum++) {
			
		//argument for column
			
			for (int column=0;column<cols;column++) {
				//arg for printing  rows and column
				System.out.println(flights[rownum][column]);
			}
		}
	
	}
	

}
