package oo.shopping;

public class GoldCostumer extends Customer{
	public GoldCostumer(int price){
		price=this.price;
	}

	public void print(){
		int s=(int) (price*0.9);
		int mon=(int) (price*0.05);
			System.out.println("穠繩簪��"+"\t"+price+"\t"+s+"\t"+mon);
			
		}
}
