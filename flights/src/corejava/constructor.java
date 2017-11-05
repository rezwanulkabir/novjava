package corejava;

public class constructor {//is an instance method that usually has the same name as class,and
	//used for assigning a new default value
	//should b always non static

	int age;
	int salary;
	int house;
	String name;
		
	constructor(){
		int age=20;
		int salary=5000;
		int house=2;
		String name="john";
		System.out.println(age);
		System.out.println(salary);
		System.out.println(house);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	constructor x=new constructor();

	}

}
