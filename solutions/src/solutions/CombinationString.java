package solutions;



public class CombinationString {
	
	public static void main(String args[]){
		StringBuffer str = new StringBuffer("abc");
		StringBuffer out = new StringBuffer();
		
		combinations(str,out,str.length(),0);
	}
	
	public static void combinations(StringBuffer str, StringBuffer out,int length, int start){
		
		for(int i=start;i<length;i++){
			out.append(str.charAt(i));
			System.out.println(out.toString());
			if(i<length-1){
				combinations(str, out,length, i+1);
			}
			out.setLength(out.length()-1);
		}
	}
	

}
