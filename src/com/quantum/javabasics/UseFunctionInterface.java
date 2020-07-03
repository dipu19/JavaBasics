package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.function.*;

class Student
{
	String name;
	int rollNo;
	int mark;
	public Student(String name, int rollNo, int mark) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.mark = mark;
	}
	
}
public class UseFunctionInterface {

	public static void main(String[] args)
	{
		Function<Integer,Integer> f = i->i*i;
		System.out.println(f.apply(4));
		
		Function<String,String> f1 = s->s.toUpperCase();
		System.out.println(f1.apply("my name is Dipu"));
		
		//Calculating ascii value of capital letter
		Function<Character,Integer> f2 =c->(int)c+32; 
		System.out.println(f2.apply('A'));
		
		ArrayList<Student>studentList = new ArrayList<Student>();
		studentList.add(new Student("Dipu",2,75));
		studentList.add(new Student("Jay",1,92));
		studentList.add(new Student("Sipu",3,95));
		studentList.add(new Student("Gopal",4,60));
		
		Function<Student,String> studentFunction = s->{
			if(s.mark >80)
			{
				return s.name+" is Distinct";
			}
			if(s.mark<80&s.mark>60)
			return s.name+" is first class";
			if(s.mark<=60&s.mark>30)
				return s.name+" is pass";
			return s.name+" is fail";
		};
		for(Student student:studentList)
		{
			System.out.println(studentFunction.apply(student));
		}
	}
}
