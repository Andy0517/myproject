package oo.shopping;

public class test {

	public static void main(String[] args) {
		System.out.println("今天，消費金額如下:");
		System.out.println("客戶等級"+"\t"+"原價"+"\t"+"折扣價"+"\t"+"還原金");
		Shop s1 = new Shop();
		Shop s2 = new Shop();
		Shop s3 = new Shop();
		s1.normal(6000);
		s2.sliver(8000);
		s2.sliver(10000);
		s3.gold(30000);
		s1.normal(2000);
		s3.gold(10000);
		
	}

}
