package solutions;

import java.util.*;

//Problem Statement : Find out the intersection of two arrays and put it another array in descending order

public class IntersectionOfArrays {

	public static void main(String[] args){
		int[] arr1={1200,1500,1122,88,1000};
		int[] arr2={1,2,3,1500,1200,5,3,10000,123,1122};
		int[] result = find_intersection(arr1,arr2);

		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"  ");
		}

	}

	public static int[] find_intersection(int[] f,int[] m){

		Arrays.sort(f);
		Arrays.sort(m);
		ArrayList<Integer> arr= new ArrayList<Integer>();

		int i=0,j=0;
		while(i<f.length && j<m.length){
			if(f[i] == m[j]){
				arr.add(f[i]);
				i++;
				j++;

			}else if(f[i]<m[j]){
				i++;
			}else{
				j++;
			}       
		}
		int[] ret_arr=new int[arr.size()];
		j=0;
		for(i=arr.size()-1;i>=0;i--){

			ret_arr[j]=arr.get(i);
			j++;
		}
		return ret_arr;

	}


}


