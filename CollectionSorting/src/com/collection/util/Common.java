package com.collection.util;

import java.util.ArrayList;

public class Common {

	public static <T> void iterateList(ArrayList<T> param) {
		for(T t : param) {
			System.out.println(t);
		}
	}
}
