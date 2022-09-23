package com.test.student.beans;

public class Student {
	private int stuid;
	private String name;
	private int marks;
	private int age;
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Student[stuid="+stuid+",name="+name+",marks="+marks+",age="+age+"]"+"\n";
	}
	public Student(int stuid, String name,int marks,int age) {
		super();
		this.stuid=stuid;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	

}
