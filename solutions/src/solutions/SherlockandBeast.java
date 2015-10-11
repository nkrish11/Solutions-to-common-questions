package solutions;

public class SherlockandBeast {

	
	public static void main(String args[]){
		
		int N = 5;
		
		long answer = findnum(N);
		
		System.out.println(answer);
		
		
		
		
		
	}
	
	static long findnum(int N){
		
		long Num1=0,Num2=0;
		
		if (N<3 || N==4){
			return 0;
		}
		if (N==3){
			return (555);
		}
		
		if (N==5){
			return (33333);
			
		}
		
		long temp1 = findnum(N-3);
		if (temp1 == 0){
			Num1 =0;
		}else{
			Num1 = Long.valueOf(String.valueOf(temp1)+"555");
		}
		
		long temp2 = findnum(N-5);
		if (temp2 == 0){
			Num2 =0;
		}else{
			Num2 = Long.valueOf(String.valueOf(temp2)+"33333");
		}
		
		
		return max(Num1,Num2);
		
	}
	
	static long max(long x, long y){
		if (x<y){
			return y;
		}else{
			return x;
		}
	}
}



/*  Online solution that worked for all test cases 
 * 
 * 
 * public class Solution {

    public static void main(String[] args) { 
        
        Scanner in=new Scanner(System.in);
        
        int n=0;
        
        int Testcases = in.nextInt();
        
     for(int a=0;a<Testcases;a++){
         StringBuffer answer =new StringBuffer();
         n = in.nextInt();
     int c = 5*((2*n)%3);
    if (c > n){
        System.out.println(-1);
    }else{
       
        for(int i=0;i<(n-c); i++){
            answer.append("5");
        }
        for (int j =0; j<c;j++){
            answer.append("3");
        }
        System.out.println(answer);
    }
     }
    }
}*/
