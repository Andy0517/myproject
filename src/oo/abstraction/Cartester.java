package oo.abstraction;

public class Cartester {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA","ALTIS",1800);
		Car c2 = new Car("HONDA","ACCORD", 2000);
		Car c3 = new Car("TOYOTA","WISH", 2000);
		int[] n = new int[5];
		System.out.println(n[2]);
		
		Car[] cars= new Car[3];
		System.out.println(cars[0]);
		
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		
		cars[0].id = 001;
		cars[1].id = 002;
		cars[2].id = 003;

		
		
		
		System.out.println(cars[2].name);
		int i;
		for(i=0;i<3;i++){
			System.out.println(cars[i].name+"\t"+cars[i].id);

		}
		System.out.println(i);
		class AA {
			
		}
		AA a = new AA();
	}

}
