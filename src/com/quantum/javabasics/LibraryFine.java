package com.quantum.javabasics;
/*collecting library fine if students are returning after 
  due date.
 */
public class LibraryFine {
	public static void main(String[] args)
	{
		
			int d1=8;
			int m1=6;
			int y1=2017;
			int d2=2;
			int m2=6;
			int y2=2017;
			if(y1>y2)
			{
				System.out.println("Fine = "+10000);
			}
			else if(y1==y2||y1<y2)
			{
				if(m1==m2||m1<m2)
				{
					if(d1>d2)
					{
						System.out.println("Fine = "+15*(d1-d2));
					}
					else if(d1==d2||d1<d2)
					{
						System.out.println("Fine = "+0);
					}
				}
				else if(m1>m2)
				{
					System.out.println("Fine = "+500*(m1-m2));
				}
			}

		}
	}


