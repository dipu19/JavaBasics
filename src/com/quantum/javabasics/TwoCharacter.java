package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCharacter {
	public static void main(String[] args)
	{
		String s="beabeefeab";
		Set <Character>s1=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
           {
              s1.add(s.charAt(i));
           }
		 List<Character> distinctList = new ArrayList<>(s1);
		 
	        int max = 0;
	        for(int i = 0; i < s1.size() - 1; i++) {
	            for(int j = i + 1; j < s1.size() ; j++) {
	                char c1 = distinctList.get(i);
	                char c2 = distinctList.get(j);
	                String subset = s.replaceAll("[^" + c1 + "" + c2 + "]", "");
	                if(isAlternating(subset)) {
	                    int l = subset.length();
	                    max = l > max ? l : max;
	                }
	            }
	        }System.out.println(max);
	} private static boolean isAlternating(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
	
}
