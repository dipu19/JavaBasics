package com.quantum.javabasics;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FractionOfInteger {
	public static void main(String[] args)
	{   DecimalFormat df = new DecimalFormat("#.00000");
       	df.setRoundingMode(RoundingMode.CEILING);

		double i =2;
		double j=5;
		double k = i/j;
		double s=k+(i/j);
		System.out.println(df.format(s));
	}
}
