package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SinpleWrite {

	public static void main(String[] args){
	
			try{
				FileOutputStream fos = new FileOutputStream("data.txt");
				fos.write(97);
				fos.write(98);
				fos.write(99);
				fos.flush();  				//�T�O�|���ɮפ�  �n�O�o�I�I		
				fos.close();
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}

	}

}
