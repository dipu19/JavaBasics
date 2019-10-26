package com.quantum.javabasics;
    /*Energy drinks require by one person to jump all the hurdles
	if his/her max height is given and by taking 1 energy drink his 
	maximum capacity of jump will increase by 1 unit */
	public class TheHurdleRace {
		public static void main(String[] args)
		{
			int[] height= {2,5,4,8,9};
			int k=5;
			int max=0;
			int energyDrinks=0;
			for(int i=0;i<height.length;i++)
			{
			  if(height[i]>max)
			  {
				  max=height[i];
			  }
			}
			if(max>k)
			{
				System.out.println(energyDrinks=max-k);
			}
			else if(max<k)
			{
				System.out.println(0);
			}
		}

	}


