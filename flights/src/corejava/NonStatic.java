package corejava;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStatic x=new NonStatic();
		x.car();
        x.flower();
        x.lover();
	}
	
	public void car() {
		System.out.println("toyota");
	}
public void flower() {
	System.out.println("rose");
}
public void lover() {
	System.out.println("girls");
}
}
