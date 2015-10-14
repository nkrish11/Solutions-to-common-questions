package solutions;

//Problem Statement : Find the least common multiple
//Based on finding greatest common divisor by Euclidean Algorithm
public class LCM {
	
	public static void main(String args[]){
		int[] arr={2,4,6,8,10};
		int gcd = find_gcd(arr);
		int lcm =gcd;
		
		for(int i=0;i<arr.length;i++){
			lcm=lcm*(arr[i]/gcd);
		}
		
		System.out.println(lcm);
	}
	
	public static int find_gcd(int[] arr){
		
		int gcd=arr[0];
		for(int i=1;i<arr.length;i++){
			gcd=find_gcd_two(gcd,arr[i]);
		}
		
		return gcd;
	}
	
	public static int find_gcd_two(int a,int b){
		while(a!=0 && b!=0){
			int c=b;
			b=a%b;
			a=c;
		}
		
		return a+b;
	}

}
