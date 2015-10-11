package solutions;

public class Permutation_String {
	
	
	public static void main(String args[]){
		StringBuffer str = new StringBuffer("abc");
		StringBuffer prmt = new StringBuffer();
		int[] used = new int[str.length()];
		
		for(int i=0;i<str.length();i++){
			used[i] = 0;
		}
		
		permute(str,prmt,used,str.length(),0);
	}
	
	public static void permute(StringBuffer str, StringBuffer prmt,int[] used,int length, int level ){
		
		if (level == length){							//if the level of the recursion matches the length print the permuted string. 
			System.out.println(prmt.toString());
			return;
		}
		
		for(int i=0; i<length; i++){					//iterate over the entire string characters but only process the ones that have not been used
			if(used[i]==0){								//if the character in the string has not been used append it and permute the rest
				prmt.append(str.charAt(i));				//append the one character that has not been used and permute the rest
				used[i]=1;
				permute(str,prmt,used,length,level+1);
				used[i]=0;								//clear the used flag and remove the character added from prmt to prepare for the next recursion
				prmt.setLength(prmt.length()-1);
			}
			
		}
		
		
	}

}
