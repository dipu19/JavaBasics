package com.quantum.javabasics;

public class MakeArrayElementUnique {

	public void uniqueArrayElement(int[] array)
	{
		int length = array.length;
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(array[i] == array[j])
				{
					for(int k = j,l=k+1;k<length&l<length;k++,l++)
					{
						array[k] = array[l];
					}
					length--;
				}
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		MakeArrayElementUnique object = new MakeArrayElementUnique();
		
		int[] array = {1,3,4,5,4,3,6,10};
		
		object.uniqueArrayElement(array);
	}
}
