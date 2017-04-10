package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		
		String s="331";
		//         0123456789
		String n ="4556498331";
		System.out.println(n.length());
		System.out.println(n.substring(n.length()-3));
		
		System.out.println("請輸入發票號碼:");
		Scanner input = new Scanner(System.in);
		String number;
	    number=input.nextLine();
	   int lucky = Integer.parseInt(number.substring(number.length()-3));
	   if((lucky==331)||(lucky==821)||(lucky==886)||(lucky==554)){
		   System.out.println("恭喜中獎!");
	   }else{
		   System.out.println("哈哈!槓龜啦~");
	   }
		
		/*Scanner input = new Scanner(System.in);
	     int number = input.nextInt();
	     
	    ArrayList<String> a = new ArrayList<>();
	    a.add("331");
	    a.add("821");
	    a.add("886");
	    a.add("554");
	  */
	}

}
