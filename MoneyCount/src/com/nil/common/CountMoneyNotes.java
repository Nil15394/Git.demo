package com.nil.common;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Nilesh
 *
 */
public class CountMoneyNotes {

	public static void countCurrency(int amount) {
		ArrayList<Integer> notes = Util.getMoneyNotes();
		System.out.println("Available Currency ->");
		Util.iterateList(notes);
		
		int[] noteCounter = new int[notes.size()];

		// count notes using Greedy approach
		for (int i = 0; i < notes.size(); i++) {
			if (amount >= notes.get(i)) {
				noteCounter[i] = amount / notes.get(i);
				amount = amount - noteCounter[i] * notes.get(i);
			}
		}

		// Print notes
		System.out.println("Currency Count ->");
		for (int i = 0; i < notes.size(); i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes.get(i) + " : " + noteCounter[i]);
			}
		}
	}

	// driver function
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		countCurrency(amount);
	}
}
