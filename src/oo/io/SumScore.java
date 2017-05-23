package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class SumScore {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scaner = new Scanner(System.in);
		for(int i= 0;i<3;i++){
			System.out.println("請輸入成績:");
			String data =scaner.nextLine();
		try {
			int score = Integer.parseInt(data);
			sum = sum + score;
		} catch (Exception e) {
			System.out.println("成績格式不正確");
			i--;
		} 
	
		}
		System.out.println(sum);
	}

}
