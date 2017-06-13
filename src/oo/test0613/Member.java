package oo.test0613;

public class Member {
	String id;
	private int age;
	String name;

	public Member(){
		
	}
	
	public Member(String name){
		System.out.println("member constructor");
		this.name=name;
	}

	void setAge(int age) {
		if(age<0){
			age=0;
		}
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
