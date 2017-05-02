package oo.test;
import java.util.ArrayList;

import oo.StaticTest.GraduateStudent;
import oo.StaticTest.Student;
import oo.abstraction.*;
public class tester {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA","ALTIS",1800);
		ArrayList<String> a = new ArrayList();
		//String[] number={"331","821","554"};
		a.add("331");
		a.add("821");
		//a.add(123);
		a.add("886");
		//a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2,"885");
		System.out.println(a);
		String data = a.get(3);
		//int n =(int) a.get(4);
}
}