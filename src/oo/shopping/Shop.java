package oo.shopping;

public class Shop {
	int mon;
	public void normal(int p){
		System.out.println("�@��"+"\t"+p+"\t"+p+"\t"+mon);
	}
	public void sliver(int p){
		int s=(int) (p*0.9);
		System.out.println("�ȯ�"+"\t"+p+"\t"+s+"\t"+mon);
		
	}
	public void gold(int p){
		int s=(int) (p*0.9);
		mon=(int) (p*0.05);
		System.out.println("����"+"\t"+p+"\t"+s+"\t"+mon);
		
	}

}
