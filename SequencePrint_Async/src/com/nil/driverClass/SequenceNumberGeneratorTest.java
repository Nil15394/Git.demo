package com.nil.driverClass;

import com.nil.generator.SequenceGenerator;
import com.nil.resource.NumberGenrator;

public class SequenceNumberGeneratorTest {
	
	private static final int TOTAL_NUMBER_IN_SEQUENCE = 10;
	private static final int TOTAL_NUMBER_OF_THREADS = 4;

	public static void main(String[] args) {
		
		SequenceGenerator sequenceGen = new SequenceGenerator(TOTAL_NUMBER_OF_THREADS,TOTAL_NUMBER_IN_SEQUENCE);
		
		Thread t1 = new Thread(new NumberGenrator(sequenceGen, 1));
		Thread t2 = new Thread(new NumberGenrator(sequenceGen, 2));
		Thread t3 = new Thread(new NumberGenrator(sequenceGen, 3));
		Thread t4 = new Thread(new NumberGenrator(sequenceGen, 0));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
