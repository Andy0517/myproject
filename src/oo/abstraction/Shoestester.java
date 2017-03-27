package oo.abstraction;

public class Shoestester {

	public static void main(String[] args) {
		Shoes s1 = new Shoes("NIKE",5200,"FLYKNIT RACER","run"); 
		Shoes s2 = new Shoes("NIKE",4000,"AIR MAX","run"); 

		int[] n = new int[5];
		System.out.println(n[2]);
		
		Shoes[] shoes= new Shoes[2];
		System.out.println(shoes[0]);
		
		shoes[0] = s1;
		shoes[1] = s2;
		
		
		shoes[0].id = 001;
		shoes[1].id = 002;
		

		
		
		
		System.out.println(shoes[1].name);
		int i;
		for(i=0;i<2;i++){
			System.out.println(shoes[i].name+"\t"+shoes[i].id);

		}
		System.out.println(i);
		class AA {
			
		}
		AA a = new AA();
	}
	}


