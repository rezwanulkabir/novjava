import java.util.Scanner;


public class CalculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		double weight;
		int feet;
		int inches;
		System.out.println("enter ur weight: ");
		weight=input.nextFloat();
		System.out.println("enter ur feet: ");
		feet=input.nextInt();
		System.out.println("enter ur inches: ");
		inches=input.nextInt();
		double weightinkilos=weight*0.453592;
		double heightinmeters=(((feet*12)+inches)+0.0254);
		double bmi=weightinkilos/(heightinmeters*heightinmeters);
		System.out.println("ur BMI is: "+bmi);
		if (bmi<18.5) {
		System.out.println("underweight");
	}
		else if (bmi>=18.5 && bmi <25) {
			System.out.println("normal");
		}
		else if(bmi>=25&& bmi<30) {
			System.out.println("overweight");
		}
		else if(bmi>=30) {
			System.out.println("overweight++");
		}

}
}