package oo.StaticTest;

public class tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu1=new Student(55,80, 75);
		Student stu2=new Student(89,60, 66);
		stu1.pass=70;
		stu1.print();
		stu2.print();
}

}
