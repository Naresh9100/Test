package com.test.student.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.test.student.beans.*;
import com.test.student.customexception.*;
import com.test.student.comparator.*;

public class StudentMangement {
	public static void main(String[] args) {
		Student s=new Student1();
		
		ArrayList<Student> AL=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		
		int stuid,marks,age;
		String name;
		System.out.print("Enter 10 Student details by id,name,marks,age");
				//add(new Student(101,"sam",700,25));
					//Student.add(new Student(102,"Sushanth",800,28));
					//Student.add(new Student(103,"Rakesh",900,27));
					//add up 10
		for(int i=0;i<10;i++) {
			stuid=sc.nextInt();
			name=sc.next();
			marks=sc.nextInt();
			age=sc.nextInt();
			AL.add(new Student(stuid,name,marks,age));
			
		}
		System.out.println("\n 10 students data successfully Added\n");
		System.out.println("Entering in the Menu \n");
		System.out.println("Enter choice:\n1:Show Student Data \n2:Show student details in dessending order by names \n3: Update stuid& marks");
		int ch=sc.nextInt();
		while(true) {
			if(ch==5) {
				break;
			}
			switch(ch) {
			
			case-1:Student1.showAll(AL);
			break;
			
			case-2:Student1.showAllsorted(AL);
			break;
			
			case-3:System.out.println("Enter stuid \n");
			stuid=sc.nextInt();
			try {
				Student1.update stuid(stuid,AL);
			}
			catch(CustomException e){
				System.out.println("Caught the exception");
				System.out.println("Exception is:"+e);
			}
			break;
			
			case-4:
				System.out.println("Invalid stuid");
				break;
				
				default:
					System.out.println("Enter choice:\n1:Show Student data \n2:show student  data in dessceinding order by names"
							+ " \n3:update stuid and marks \n4:Ivalid Studentid");
			}
		}
			
					
	}

}
