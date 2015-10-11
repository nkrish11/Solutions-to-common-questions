package solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dec_To_Binary {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		String temp=new String();
		FileReader filereader =new FileReader("C:/Users/nikhil/Desktop/file.txt");
		BufferedReader br =new BufferedReader(filereader);
		
		while((temp=br.readLine()) != null){
			if(!temp.isEmpty())
				System.out.println(Integer.toBinaryString(Integer.parseInt(temp)));
		}
		br.close();
		filereader.close();
	}

}
