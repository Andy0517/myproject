package oo.mid;

public class Meal {
	int number;
	int price;
	int buyprice;
	public Meal(int number,int price){
		   this.number=number;
		   this.price=price;
		}
	public void setBuyprice(int p){
		p = buyprice;
	}
	
	public int giveChange(){
		if(price>buyprice){
			int change=buyprice-price;
			return change;
		}
	}
}
