package solutions;

//Problem Statement : Find the greatest common divisor of an array
//Based on Euclidean Algorithm
public class GCD {
	
	public static void main(String[] args){
		int[] arr = {121,99,33};
		int gcd=arr[0];
		for(int i=1;i<arr.length;i++){
			gcd=find_gcd(gcd,arr[i]);
		}
		
		System.out.println(gcd);
	}

	public static int find_gcd(int a, int b){
		
		
		while (a!=0 && b!=0){
			int c=b;
			b=a%b;
			a=c;
		}
		return a+b;
	}
}
