package corejava;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Random rand = new Random();	
	int guess=rand.nextInt(20);
	System.out.println(guess);
	int guess1=1;
	while(guess1<20) {
		System.out.println("it took: "+guess1);
		guess1++;
	}
	}
	

}
