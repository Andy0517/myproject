package oo.Customer;

public class GoldenCustomer extends Customer{
	public GoldenCustomer(int price){
		price=this.price;
	}

	public void print(){
		int s=(int) (price*0.9);
		int mon=(int) (price*0.05);
			System.out.println("ª÷¯Å"+"\t"+price+"\t"+s+"\t"+mon);
			
		}
}
