package oo.shopping;

public class SliverCostumer extends  Costumer{
	
	public SliverCostumer(int price){
		super(price);
	}
	
	public void information(){
		int s=(int) (price*0.9);
		System.out.println("»È¯Å"+"\t"+price+"\t"+s+"\t"+mon);
	}
}
