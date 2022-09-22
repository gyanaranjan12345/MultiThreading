package com.thread;

public class Mythread extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Mythread 1.0");
		}
	}}
class User
{
	public static void main(String[] args) throws InterruptedException 
	{	
	Mythread t1=new Mythread();
	t1.start();
	Thread.sleep(5000);
	for(int i=1; i<=5; i++)
	  {
		System.out.println("mythread 2.0");
	  }
	}}
