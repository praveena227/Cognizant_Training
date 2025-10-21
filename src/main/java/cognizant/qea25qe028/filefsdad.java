package cognizant.qea25qe028;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class filefsdad {

	public static void main(String args[]) {
		try {
			FileReader fr = new FileReader("C:\\Users\\2440673\\OneDrive - Cognizant\\Desktop\\note.txt");
			int charInt;

			while ((charInt = fr.read()) != -1) {
				System.out.print((char) charInt);
			}
			writeData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeData() throws IOException{
		FileWriter writeToFile = new FileWriter("C:\\Users\\2440673\\OneDrive - Cognizant\\Desktop\\note1.txt",true);
		writeToFile.write("heloooooooooo");
		writeToFile.close();
	}

}
