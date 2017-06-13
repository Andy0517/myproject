package oo.test0613;

public class Membertest {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(-5);
		System.out.println(member.getAge());
		
		
		PhoneMember member2 = new PhoneMember();
		PhoneMember member3 = new PhoneMember("ANDY");
	}

}
