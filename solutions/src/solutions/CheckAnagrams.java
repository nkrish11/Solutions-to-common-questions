package solutions;
import java.util.*;

//Problem Statement : Check if two strings are anagrams

public class CheckAnagrams {
	
	public static void main(String[] args){
		String s1="iingasd";
		String s2="dasngii";
		System.out.println(findIfAnagram(s1,s2));
	}
	
	public static String findIfAnagram(String s1,String s2){
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length();i++){
			if(hm.containsKey(s1.charAt(i))){
				hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
			}else{
				hm.put(s1.charAt(i), 1);
			}
		}
		
		for(int i=0;i<s2.length();i++){
			if(hm.containsKey(s2.charAt(i))){
				hm.put(s2.charAt(i), hm.get(s2.charAt(i))-1);
				if(hm.get(s2.charAt(i))==0){
					hm.remove(s2.charAt(i));
				}
			}else{
				return "NO";
			}
		}
		return "YES";
	}

}
