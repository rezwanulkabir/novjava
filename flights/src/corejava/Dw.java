package corejava;

public class Dw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* I am waiting for x-mas.
		 * 
		 * I need to save $3 each day until I have $150. How many days do I have to save
		 * for till i reach $150.
		 * 
		 */ 
		int dollars=3;
		int count=1;
		do {
			
			System.out.println("This is how much I saved: "+dollars);
			dollars=3+dollars;
			count++;
		}while(dollars<150);
		
		System.out.println("I finally saved: "+dollars);
		System.out.println("This is how many days it took: "+count);

	}//class void end

}//class dw end
