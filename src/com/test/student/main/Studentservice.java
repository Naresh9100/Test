package com.test.student.main;

import java.util.*;


import com.test.student.comparator.*;
import com.test.student.beans.*;
import com.test.student.customexception.*;

public class Studentservice implements Student1 {
	
	Scanner sc=new Scanner(System.in);
	
	public void showAll(ArrayList<Student> AL) {
		int flag=0;
		for (int i=0;i<AL.size();i++) {
			
			System.out.println(AL.get(i).toString());
		}
	}

	public void showAllSorted(ArrayList<Student> AL);
	Comparator<Student> AL=new Comparator<Student>() {
		public int compare(Student s1,Student s2) {
			return s1.getName().compareToIgnoreCase(s2.getName());
		}
	};
	Collection.sort(AL,Collection.reverseOrder(AL));
	showAll(AL);
}

public void updatestuid(int stuid,marks,ArrayList<Student> AL) throws CudtomException{
	int flag=0;
	int stuid;
	
	for(Student s:AL) {
		if(s.getStuid()==stuid) {
			System.out.println("Enter stuid");
			stuid=sc.nextInt();
			s.setStuid(stuid);
			flag=1;
			
			System.out.println("Data updated");
			System.out.println("\n updated data is:\n"+s.toString());
		}
	}
	if(flag!=1) {
		throw new CustomException("invalid stuid");
	}
}