//thread extendig Thread and use of stop()
class thread1 extends Thread
{
	public void run()
	{
		for (int i=0;i<5 ;i++ ) 
		{
			//after the satisfaction of this statement thread1 gets killed
			if(i==3) {stop();}

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
class threadset1
{
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		
		
		t1.start();
		t2.start();
	}
}