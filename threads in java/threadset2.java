//thread extendig Thread and use of stop()
class thread1 extends Thread
{
	public void run()
	{
		for (int i=0;i<5 ;i++ ) 
		{
			//since sleep throws an exception so it should be handled
			try{
				//after the satisfaction of this statement thread1 execution is blocked for 1000 miliseconds
				if(i==3) 
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

			System.out.println("thread1 value is: "+i);
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		for (int j=0;j<5 ;j++ ) {
			System.out.println("thread2 value is: "+j);
		}
	}
}
class threadset2
{
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		
		
		t1.start();
		t2.start();
	}
}