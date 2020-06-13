package com.nil.generator;

public class SequenceGenerator {

	private int StartingNumber = 1;
	private int totalNumberOfthreads;
	private int totalnumberInSequence;

	public SequenceGenerator(int totalNumberOfthreads, int totalnumberInSequence) {
		super();
		this.totalNumberOfthreads = totalNumberOfthreads;
		this.totalnumberInSequence = totalnumberInSequence;
	}

	public void printnumberInSequence(int result) {
		synchronized (this) {
			while (StartingNumber < totalnumberInSequence - 1) {
				while (StartingNumber % totalNumberOfthreads != result) {
					try {
						wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + ">>>>>>>" + StartingNumber++);
				notifyAll();
			}
		}
	}
}
