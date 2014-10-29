package Jungle;

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
		
		Animal animal = new Sheep("male");
		((Sheep)animal).run();
		((Sheep)animal).move();
		
		Plant plant = new Plant(2, 4);
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Sheep ) {
				((Sheep)animals[i]).eat(plant);
			}
		}
		
		Lion lion = new Lion("male");
		lion.eat(animals[new Random().nextInt(animals.length)]);
		lion.sleep();
		
		Plant moss = new Plant(3, 2);
		moss.absorbWater("water");
	}	
}
