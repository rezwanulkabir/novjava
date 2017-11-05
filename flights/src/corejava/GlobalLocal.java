package corejava;

public class GlobalLocal {
static int c=500;//global var can use any function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  age();
  salary();
  System.out.println(c);
	}

	public static void age() {
		
		int x=3;
		System.out.println(x);
		
	}
	
	public static void salary() {
		
		int y=300;
		System.out.println(y);
		
	}
	public static void apple() {
		
	}
}

