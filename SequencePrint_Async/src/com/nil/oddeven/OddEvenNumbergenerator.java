package com.nil.oddeven;

public class OddEvenNumbergenerator {

	private int totalNoinSequence;
	private boolean evenFlag;
	private int number = 1;

	public OddEvenNumbergenerator(int totalNoinSequence) {
		super();
		this.totalNoinSequence = totalNoinSequence;
	}
	
	public void printOddNumbers() {
		synchronized (this) {
			while(number <= totalNoinSequence-1) {
				while(evenFlag) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				evenFlag = true;
				notifyAll();
			}
		}
	}

	public void printevenNumbers() {
		synchronized (this) {
			while(number <= totalNoinSequence-1) {
				while(!evenFlag) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				evenFlag = false;
				notifyAll();
			}
		}
	}
}
