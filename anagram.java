package com.klh;
import java.util.Arrays;
public class anagram {
	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		if(Anagrams(str1,str2)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
	}
	public static boolean Anagrams(String s1,String s2) {
		s1= s1.replaceAll("\\s","").toLowerCase();
		s2= s2.replaceAll("\\s","").toLowerCase();
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[]arr1=s1.toCharArray();
		char[]arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
}
