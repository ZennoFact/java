package animal;

import java.util.Random;

public class KyotoJungle {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		for (int i = 0; i < animals.length; i++) {
			Random r = new Random();
			if (r.nextInt(5) == 0) {
				animals[i] = new Sheep("male") ;
			} else if (r.nextInt(5) == 1) {
				animals[i] = new Sheep("female") ;
			} else if (r.nextInt(5) == 2) {
				animals[i] = new Gnu("male") ;
			} else if (r.nextInt(5) == 3) {
				animals[i] = new Gnu("female") ;
			} else {
				animals[i] = new Animal("male") ;
			}
		}
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getClass() + ", sex:" + animals[i].sex);
			
		}
	}	
}
