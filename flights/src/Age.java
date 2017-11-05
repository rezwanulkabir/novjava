
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int me = 20;
		int sis = 30;
		System.out.println("my age is " + me);//concat
		System.out.println("my sis age is " + sis);
		System.out.println("total age " + (me + sis));

		int temp = me;//swap
		me = sis;
		sis = temp;
		System.out.println("my age is :" + me);
		System.out.println("sis age is :" + sis);
   
		
		if (sis>21)//loop ifelse
		{
			System.out.println("u can drink");
			
		}else {
			System.out.println("u can not drink");
		}
	}
	
}