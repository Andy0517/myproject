package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class SumScore {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scaner = new Scanner(System.in);
		for(int i= 0;i<3;i++){
			System.out.println("�п�J���Z:");
			String data =scaner.nextLine();
		try {
			int score = Integer.parseInt(data);
			sum = sum + score;
		} catch (Exception e) {
			System.out.println("���Z�榡�����T");
			i--;
		} 
	
		}
		System.out.println(sum);
	}

}
