package com.collection.comparator;

import java.util.Comparator;

import com.collection.sot.Student;

public class SortByComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getDepartMent().compareTo(o2.getDepartMent());
	}

}
