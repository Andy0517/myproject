package oo.shopping;

public class GoldCostumer extends  SliverCostumer{
	
		public GoldCostumer(int price) {
		super(price);
	}

		public void information(){
			int s=(int) (price*0.9);
			mon=(int) (price*0.05);
			System.out.println("ª÷¯Å"+"\t"+price+"\t"+s+"\t"+mon);
			
		}
}
