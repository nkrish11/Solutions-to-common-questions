package solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class K_Difference_Count {
	
	//This solution to the problem increases the space complexity to reduce the 
	//time complexity. 
	
	public static void main(String[] args) throws NumberFormatException, IOException{

		//This is just a driver function taking the input and putting it into the array 
		//to be passed to the K_difference function that finds the count.
		//The input is of the form in a file stored at the Desktop in this case:
		//difference
		//length
		//number number number number number ....
		
		int diff,length;
		
		FileReader filereader =new FileReader("C:/Users/nikhil/Desktop/file.txt");
		BufferedReader br =new BufferedReader(filereader);
		K_Difference_Count obj=new K_Difference_Count();
		
		diff = Integer.parseInt(br.readLine());
		length = Integer.parseInt(br.readLine());
		
		String temp[]=new String[length];
		int num[]=new int[length];
		
		temp=br.readLine().split(" ");
		
		for(int i=0; i<length;i++){
			num[i] = Integer.parseInt(temp[i]);
		}
		
		System.out.println(obj.K_difference(diff,length,num));
		
		br.close();
		filereader.close();
	}
	
	
	public int K_difference(int diff,int length, int num[]){
		
		//This function calculates the number of pairs in an array that have the given difference 
		//and passes this count to the calling function.
		
		Hashtable <Integer,Integer> hm = new Hashtable<Integer,Integer>();
		int count=0;
		
		//Adds all the numbers as key value pairs to a Hash table
		for(int i=0;i<length;i++){
			
			hm.put(num[i]-diff, num[i]);
		}
		
		//Checks if the numbers correspond to any key value pairs
		for(int i=0;i<length;i++){
			
			if(hm.containsKey(num[i])){
				count++;
				hm.remove(num[i]);
			}
		}
		
		return count;
		
	}

}
