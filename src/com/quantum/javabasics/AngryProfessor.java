package com.quantum.javabasics;
/*a professor keep some condition if there is less than no 
of students he wants in class at the start time of class then
he will cancel class otherwise he will not cancel the class. 
 */
public class AngryProfessor {
	public static void main(String[] args)
	{
	int[] studentsArrivalTime= {-1,0,2,1};
	int studentsRequireForClass=1;

	int count=0;
	
	for(int i=0;i<studentsArrivalTime.length;i++)
	{
		if(studentsArrivalTime[i]>=0)
		{
			count++;
		}
		
	}
	if(count<studentsRequireForClass)
	{
		System.out.println("Yes class will cancel.");
	}
	else if(count>=studentsRequireForClass)
	{
		System.out.println("No class will not cancel.");
	}
}

}
