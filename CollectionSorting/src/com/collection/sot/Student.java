package com.collection.sot;

public class Student implements Comparable<Student>{

	private String Name;
	private String departMent;
	private int year;

	public Student() {
		super();
	}

	public Student(String name, String departMent, int year) {
		super();
		Name = name;
		this.departMent = departMent;
		this.year = year;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartMent() {
		return departMent;
	}

	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", departMent=" + departMent + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
		
	}

}
