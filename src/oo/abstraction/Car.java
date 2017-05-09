package oo.abstraction;

public class Car extends Object{
	//自動繼承Object類別
    int id;
    String brand;
    int cc;
    String name;
    int status;
    float milage;
 public Car(String brand,String name,int cc){
   this.brand=brand;
   this.cc=cc;
   this.name=name;
}
public void setMilage(int m){
	milage=m;
}
public float addMilage(int m){
	milage=milage+m;	
	return milage;
}
public void maintain(){
	status=5;
}




}