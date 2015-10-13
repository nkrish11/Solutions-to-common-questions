package solutions;

import java.util.*;

/*
 * Problem Statement : Find if there is a palindrome in the anagrams of a string A.
 */

public class PalindromeInAnagrams {
	
	public static void main(String[] args) {
        /*Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        ans = GOT(inputString);
        
        System.out.println(ans);
        myScan.close();
        */
		System.out.println(GOT("aaaaaccccccbbbbdddddddd"));
    }
    
    public static String GOT(String inputString){
        int count =0;
         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        
        for(int i=0;i<inputString.length();i++){
            if (hm.containsKey(inputString.charAt(i))){
                hm.put(inputString.charAt(i),hm.get(inputString.charAt(i))+1);
            }else{
                hm.put(inputString.charAt(i),1);
            }
        }
        
        Iterator<Map.Entry<Character,Integer>> it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> me = it.next();
            if(me.getValue()%2 != 0){
                count++;
            }
        }
        if (count>1){
            return "NO";
        }else{
            return "YES";
        }
        
    }

}
