package oo.StaticTest;

import java.util.ArrayList;

public class tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu1=new Student(55,80, 75);
		Student stu2=new Student(89,60, 66);
		stu1.pass=70;
		stu1.print();
		stu2.print();
		
		
		GraduateStudent gstu1=new GraduateStudent(84, 73, 95);
		gstu1.print();
		
		
		
		//
		
		
		
		
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(55,80, 75));
		list.add(new Student(89,60, 66));
		list.add(new GraduateStudent(84, 73, 95));
		for(int i=0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}

	}

}
