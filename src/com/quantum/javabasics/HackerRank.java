package com.quantum.javabasics;

import java.util.ArrayList;

public class HackerRank {
	public static void main(String[] args)
	{
    String str = "hackerrank";
	String s="hacckerrrank";
    if (s.length() < str.length()) {
        System.out.println("No");
    }
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
        if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                j++;
        }
    }
    System.out.println( (j == str.length() ? "YES" : "NO"));

}
}
