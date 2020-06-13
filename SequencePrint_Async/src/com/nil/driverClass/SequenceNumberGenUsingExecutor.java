package com.nil.driverClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.nil.generator.SequenceGenerator;
import com.nil.resource.NumberGenrator;

public class SequenceNumberGenUsingExecutor {
	
	private static final int TOTAL_NUMBER_IN_SEQUENCE = 20;
	private static final int TOTAL_NUMBER_OF_THREADS = 3;

	public static void main(String[] args) {
		
		SequenceGenerator sequenceGen = new SequenceGenerator(TOTAL_NUMBER_OF_THREADS,TOTAL_NUMBER_IN_SEQUENCE);
		ExecutorService executorService = null;      
		try {
			executorService = Executors.newFixedThreadPool(TOTAL_NUMBER_OF_THREADS);
			executorService.submit(new NumberGenrator(sequenceGen, 1));
			executorService.submit(new NumberGenrator(sequenceGen, 2));
			executorService.submit(new NumberGenrator(sequenceGen, 0));
		} finally {
			if(executorService!=null) {
				executorService.shutdown();
			}
		}
	}
	
}
