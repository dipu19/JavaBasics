package com.quantum.javabasics;

import java.util.ArrayList;

public class ConvertString {
	
	int result1;
	
	int result2;
	
	public void diff1(int ascii)
	{
		
		int dif = ascii-122;
		int  result = 96+dif;
		if(result>122)
		{
			diff1(result);
		}
		else
		{
			result1 = result;
		}
		
		
	}
	
	public void diff2(int ascii)
	{
		
		int dif = ascii-90;
		int  result = 96+dif;
		if(result>90)
		{
			diff1(result);
		}
		else
		{
			result2 = result;
		}
		
		
	}

  public String convert(String s, int k)
  {
    String s1 ="";
    int length = s.length(); 
    for(int i= 0;i<length;i++)
    {
        int asciiValue = (int)s.charAt(i);
        if(asciiValue>96&asciiValue<123)
        {
            if(asciiValue+k<123)
            {
            asciiValue = asciiValue+k;
            }
            else
            {  
                diff1(asciiValue+k);
                asciiValue = result1;
             }
        }
        if(asciiValue>64&asciiValue<91)
        {
            if(asciiValue+k<91)
            {
                asciiValue = asciiValue+k;
            }
            else
            {
                diff2(asciiValue+k);
                asciiValue = result2;
            }
        }

        char ch = (char)asciiValue;

        s1 = s1+ch;
    }
    return s1;

}
  public static void main(String[] args)
  {
	  String s = "middle-Outz";
	  ConvertString obj = new ConvertString();
	
	 System.out.print(obj.convert(s, 2));
  }
}
