package com.nil.resource;

import com.nil.generator.SequenceGenerator;

public class NumberGenrator implements Runnable{

	SequenceGenerator sequenceGenerator = null;
	private int result;

	public NumberGenrator(SequenceGenerator sequenceGenerator, int result) {
		super();
		this.sequenceGenerator = sequenceGenerator;
		this.result = result;
	}

	@Override
	public void run() {
		sequenceGenerator.printnumberInSequence(result);
		
	}

}
