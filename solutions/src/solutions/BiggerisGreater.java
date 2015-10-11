package solutions;


import java.util.*;


/*Lexicographically greater string --- Given a word w, rearrange the letters of w to construct another word s in such 
 * a way that s is lexicographically greater than w. In case of multiple possible answers, find the lexicographically smallest one.
 * 
 * The following algorithm generates the next permutation lexicographically after a given permutation. It changes the given permutation in-place.
 * Find the largest index k such that a[k] < a[k + 1]. If no such index exists, the permutation is the last permutation.
 * Find the largest index l greater than k such that a[k] < a[l].
 * Swap the value of a[k] with that of a[l].
 * Reverse the sequence from a[k + 1] up to and including the final element a[n].
 * 
 */

public class BiggerisGreater {



	public static void main(String args[]){
		StringBuffer str = new StringBuffer("iotjgthvslvmjpcchhuf");


		find_Greater(str.toString());

		//combinations(str,out,str.length(),0);
	}

	public static void find_Greater(String str){


		for(int i=str.length()-2;i>=0;i--){

			//            for (int j=i-1; j>=0;j--){
			if(str.charAt(i)<str.charAt(i+1)){
				for(int j=str.length()-1;j>i;j--){
					if(str.charAt(i)<str.charAt(j)){
						String t1 = swap(str,i,j);
						String t2 = str_Sort(t1,i+1,str.length());
						System.out.println(t2);
						return;
					}
				}

			}

			//          }



		}

		System.out.println("no answer");
		return;
	}


	// Swaps two positions in a string
	public static String swap(String str, int i, int j){
		char[] c = str.toCharArray();

		char temp;

		temp = c[i];
		c[i] = c[j];
		c[j] = temp;

		String swapped =  new String(c);
		return swapped;

	}


	// Sorts a substring of a string 
	public static String str_Sort(String str, int start, int end){
		char[] c = str.substring(start,end).toCharArray();

		Arrays.sort(c);

		/*  char key;
        int i,j;

        for(i=0; i<c.length; i++){
            key = c[i];
            for(j = i - 1; (j >= 0) && (c[ j ] > key); j--){

                 c[ j+1 ] = c[ j ];
            }
            c[j+1]= key;
        }*/

		String sorted =  new String(c);  
		return str.substring(0,start)+sorted;

	}





}