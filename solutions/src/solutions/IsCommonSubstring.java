package solutions;

import java.util.*;

/*
 * Problem Statement : You are given two strings A and B. Find if there is a common substring between the two. 
 * 					   The program should return a YES or a NO for each pair of strings A and B.
*/

public class IsCommonSubstring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	/* Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        
        for(int i=0;i<N;i++){
            
            String s1=in.nextLine();
            String s2=in.nextLine();
            System.out.println(findIfSubstring(s1,s2));
            
        }*/
    	
    	System.out.println(findIfSubstring("hello","world"));
       
        
    }
    
    
/*  
 * For two strings to have common substrings there must be atleast one character common between the two. 
 * This function puts all the characters in one string into a hashmap. Then it runs through the second string 
 * and tries to find atleast one common character by looking into the hashmap for each character in the second string.
 * The moment one such character is found "YES" is returned. Otherwise "NO" is returned.
*/    
    public static String findIfSubstring(String s1, String s2){
        HashMap<Character,Integer> hms1 = new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++){
            if(!hms1.containsKey(s1.charAt(i))){
                hms1.put(s1.charAt(i),1);
            }
        }
        
        for(int j=0;j<s2.length();j++){
            if(hms1.containsKey(s2.charAt(j))){
                return "YES";
            }
        }
        
        return "NO";
    }
}
