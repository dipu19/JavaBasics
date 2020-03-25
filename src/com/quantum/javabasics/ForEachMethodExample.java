package com.quantum.javabasics;

import java.util.ArrayList;

public class ForEachMethodExample {

	public static void main(String[] args)
	{
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Thuru");
		friends.add("Chintu");
		friends.add("Prema");
		friends.add("Wandoor");
		friends.add("Umesh");
		friends.forEach(friend->System.out.println(friend));
		friends.forEach(System.out::println);
	}
}
