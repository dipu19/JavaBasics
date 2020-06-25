package com.quantum.javabasics;

import java.util.Map;
import java.util.Set;

public class SystemEnviornment {

	public static void main(String[] args)
	{
		Map<String,String> envMap = System.getenv();
		Set keySet = envMap.keySet();
		for(Object element:keySet)
		{
			System.out.println("key "+element+", value "+envMap.get(element));
		}
		
	}
}
