package oo.StaticTest;

public class GraduateStudent extends Student{
	int thiese;
	public  GraduateStudent(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	@Override
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thiese);
	}

}
