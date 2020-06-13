package com.nil.generator;

import com.nil.oddeven.OddEvenNumbergenerator;

public class OddNumberGenerator implements Runnable {

	public OddEvenNumbergenerator OddEvenNumbergenerator;

	public OddNumberGenerator(OddEvenNumbergenerator oddEvenNumbergenerator) {
		super();
		OddEvenNumbergenerator = oddEvenNumbergenerator;
	}

	@Override
	public void run() {
		OddEvenNumbergenerator.printOddNumbers();
	}

}
