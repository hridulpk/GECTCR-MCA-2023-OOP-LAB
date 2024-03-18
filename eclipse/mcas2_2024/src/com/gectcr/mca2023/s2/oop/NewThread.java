package com.gectcr.mca2023.s2.oop;

public class NewThread implements Runnable {
	Thread t;
	public NewThread() {
		// TODO Auto-generated constructor stub
		t=new Thread(this,"demo thread");
		System.out.println("child thread"+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("child thread:"+i*5);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Child interrupted: ");
		}
		System.out.println("Exiting child thread");
	}

}
