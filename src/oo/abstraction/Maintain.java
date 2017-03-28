package oo.abstraction;

public class Maintain {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA","ALTIS",1800);
		c1.setMilage(250000);
		//
		float now = c1.addMilage(80);
		System.out.println("¨½µ{¼Æ¬°:"+now);

	}

}
