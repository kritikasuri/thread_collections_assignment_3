package com.acadgild.assignment.thread;

public class main {
	
	public static void main(String[] args) {
		
		count cnt = new count();
	      try
	      {
	         while(cnt.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	   }
}
