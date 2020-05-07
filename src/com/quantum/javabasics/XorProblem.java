package com.quantum.javabasics;

public class XorProblem {
  public static void main(String[] args)
  {
	  int L = 11;
      int R = 12;
     
      
      int xored  = L ^ R;
      int significantBit = 31 - Integer.numberOfLeadingZeros(xored);
      int result = (1 << (significantBit + 1)) - 1;

      System.out.println(result);
  }
}
