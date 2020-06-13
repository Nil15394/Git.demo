package com.collection.main;

import java.util.ArrayList;
import java.util.Collections;

import com.collection.comparator.SortByComparator;
import com.collection.sot.Student;
import com.collection.util.Common;

public class StudentApp {

	public static void main(String[] args) {
		ArrayList<Student> stoObj = new ArrayList<Student>();

		stoObj.add(new Student("Nilesh", "CS", 2017));
		stoObj.add(new Student("Rupesh", "RSS", 1965));
		stoObj.add(new Student("Chirag", "Admim", 1994));
		stoObj.add(new Student("Sagar", "BJP", 1999));
		stoObj.add(new Student("Yogesh", "NCP", 2004));
		stoObj.add(new Student("Bhupesh", "SS", 2011));

		Common.iterateList(stoObj);

		// Collections.sort(stoObj);\
		Collections.sort(stoObj, new SortByComparator().reversed());

		System.out.println("After Sorting");

		Common.iterateList(stoObj);

	}
}
