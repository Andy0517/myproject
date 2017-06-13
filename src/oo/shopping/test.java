package oo.shopping;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		System.out.println("今天，消費金額如下:");
		System.out.println("客戶等級"+"\t"+"  原價"+"\t"+"折扣價"+"\t"+"還原金");
		/*Costumer s1 = new Costumer();
		Costumer s2 = new Costumer();
		Costumer s3 = new Costumer();
		s1.normal(6000);
		s2.sliver(8000);
		s2.sliver(10000);
		s3.gold(30000);
		s1.normal(2000);
		s3.gold(10000);*/
		ArrayList<Customer> list = new ArrayList();
		list.add(new NormalCustomer(6000));
		list.add(new SliverCostumer(8000));
		list.add(new SliverCostumer(10000));
		list.add(new GoldCostumer(30000));
		list.add(new NormalCustomer(10000));
		list.add(new GoldCostumer(6000));
		for(int i=0;i<list.size();i++){
			Customer cost = list.get(i);
			if(cost instanceof SliverCostumer && !(cost instanceof GoldCostumer)){
				System.out.print("*");
			}else
			{
				System.out.print("   ");
			}
			cost.print();
		}
		System.out.println();
		for(Customer cost:list){
			if(cost instanceof SliverCostumer && !(cost instanceof GoldCostumer)){
			System.out.print("*");
			SliverCostumer sliver = (SliverCostumer)cost;
		}else
		{
			System.out.print("   ");
		}
		cost.print();
	}
		
	}

}
