package com.nil.driverClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.nil.generator.EvenNumberGenerator;
import com.nil.generator.OddNumberGenerator;
import com.nil.oddeven.OddEvenNumbergenerator;

public class OddEvennumberPrintTest {
	
	public static int totalNumberOfSeqeunce = 30;
	
	public static void main(String[] args) {
		
		OddEvenNumbergenerator oddEvenNumbergenerator = new OddEvenNumbergenerator(totalNumberOfSeqeunce);
		ExecutorService service = null;
		try {
			service  = Executors.newFixedThreadPool(1);
			service.submit(new OddNumberGenerator(oddEvenNumbergenerator));
			service.submit(new EvenNumberGenerator(oddEvenNumbergenerator));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(service!=null)
				service.shutdown();
		}
	}

}
