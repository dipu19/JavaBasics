package com.quantum.javabasics;


	class Singleton
	{
		static private Singleton obj;
		private Singleton()
		{
			System.out.println("Instance Created");
		}
		public static Singleton getInstance()
		{
			if(obj == null)
			{
				return new Singleton();
			}
			else
			{
			return obj;
			}
		}
	}

	public class SingletonDesignPattern {

		public static void main(String[] args)
		{
			Singleton obj = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();
		}
	}
