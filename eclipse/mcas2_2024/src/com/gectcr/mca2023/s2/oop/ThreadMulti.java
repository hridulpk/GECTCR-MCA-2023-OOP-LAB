package com.gectcr.mca2023.s2.oop;
import java.util.*;
public class ThreadMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();
			try {
					for(int i=1;i<=10;i++)
					{
						System.out.println("Main thread"+i*5 );
						Thread.sleep(1000);
					}
			}
			catch (InterruptedException e) {
				System.out.println("Main thread interrupted:");
			}
			System.out.println("Exiting main thread");
	}

}
