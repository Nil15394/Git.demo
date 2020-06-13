package com.nil.common;

import java.util.ArrayList;

public class Util {
	
	private static ArrayList<Integer> availableCurrecnyInNotes = new ArrayList<Integer>(1);
	
	public static ArrayList<Integer> getMoneyNotes() {
		availableCurrecnyInNotes.add(2000);
		availableCurrecnyInNotes.add(500);
		availableCurrecnyInNotes.add(200);
		availableCurrecnyInNotes.add(100);
		availableCurrecnyInNotes.add(50);
		availableCurrecnyInNotes.add(20);
		availableCurrecnyInNotes.add(10);

		return availableCurrecnyInNotes;	
	}
	
	public static <T> void iterateList(ArrayList<T> param) {
		for(T t : param) {
			System.out.println(t);
		}
	}

}
