package com.nil.generator;

import com.nil.oddeven.OddEvenNumbergenerator;

public class EvenNumberGenerator implements Runnable {
	
	public OddEvenNumbergenerator OddEvenNumbergenerator;

	public EvenNumberGenerator(OddEvenNumbergenerator oddEvenNumbergenerator) {
		super();
		OddEvenNumbergenerator = oddEvenNumbergenerator;
	}

	@Override
	public void run() {
		OddEvenNumbergenerator.printevenNumbers();
	}
}
