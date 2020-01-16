package com.bridgelabz.fellowshipprogramss.logical;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class StopWatch 
{
	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;


	public int start() {
	    this.startTime = System.currentTimeMillis();
	    this.running = true;
		return (int) startTime;
	}


	public int stop() {
	    this.stopTime = System.currentTimeMillis();
	    this.running = false;
		return (int) stopTime;
	}


	//elaspsed time in milliseconds
	public long getElapsedTime() {
	    long elapsed;
	    if (running) {
	         elapsed = (System.currentTimeMillis() - startTime);
	    }
	    else {
	        elapsed = (stopTime - startTime);
	    }
	    return elapsed;
	}


	//elaspsed time in seconds
	public long getElapsedTimeSeconds() {
	    long elapsed;
	    if (running) {
	        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
	    }
	    else {
	        elapsed = ((stopTime - startTime) / 1000);
	    }
	    return elapsed;
	}

	public static void main(String[] args) 
	{
	    StopWatch s = new StopWatch();
	    System.out.println("Enter Start time");
	    long startTime=Utility.integerInput();
	    s.start();
	    System.out.println(" " +s.start());
	    System.out.println("Enter Stop time");
	    long stopTime=Utility.integerInput();
	    s.stop();
	    System.out.println(" " +s.stop());
	    System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
	    System.out.println("elapsed time in 1seconds: " + s.getElapsedTimeSeconds());
	
	}
	
}