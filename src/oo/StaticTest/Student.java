package oo.StaticTest;

public class Student {
		int english;
		int math;
		int chinese;
		static int pass=60;
		//�p�G�S��public,��Lpackage�����
		public Student(int english, int math, int chinese) {
			this.english = english;
			this.math = math;
			this.chinese = chinese;
		}
		
		public Student() {
			
		}
		
		protected String getScore(int score){
			if(score<pass){
				return String.valueOf(score)+"*";
			}else{
				return String.valueOf(score);
			}
		}
		
		public void print(){
			System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t");
		}

}
