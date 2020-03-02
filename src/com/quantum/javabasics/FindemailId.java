package com.quantum.javabasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindemailId {

	public static void findMail(BufferedReader br,PrintWriter pw,Pattern p) throws IOException
	{
		String line=br.readLine();
		while(line!=null)
		{
			Matcher m=p.matcher(line);
			while(m.find())
			{
				pw.println(m.group());
			}
			line=br.readLine();
		}pw.flush();
	}
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("output.txt");
		Pattern p=Pattern.compile("[a-zA-Z0-9]"
                + "[a-zA-Z0-9_.]"
                + "*@[a-zA-Z0-9]"
                + "+([.][a-zA-Z]+)+");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		findMail(br,pw,p);
		
	}
}
