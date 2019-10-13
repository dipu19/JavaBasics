package com.quantum.javabasics;
import java.util.*; 
public class LuckBalance {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of contest array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter  values to array");
		int [][] contests=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int val=sc.nextInt();
			}
		}System.out.println("Enter the value of k");
		int k=sc.nextInt();
		 List<Integer> important = new ArrayList<Integer>();
		    int totalLuck = 0;
		    for(int i = 0; i < contests.length; i++){
		         if(contests[i][1] == 1){
		             important.add(contests[i][0]);
		         }
		        totalLuck += contests[i][0];
		    }
		    int canWin = important.size() - k, score = 0;
		    Collections.sort(important);
		    for(int i = 0; i < canWin; i++){
		        score += 2 * important.get(i);
		    }

		   System.out.println(totalLuck-score);
			
		
				
	}
}
