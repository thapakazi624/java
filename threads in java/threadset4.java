//thread extendig Thread and use of isAlive(), join() 
class thread extends Thread
{
	public void run()
	{
		for (int i=0;i<=5; i++) 
		{
			System.out.println("Status : " + isAlive());
		}
	}
}


class threadset4
{
	public static void main(String[] args)
	 {
		thread t1 = new thread();
		t1.start();
		//the t1.isAlive is executed after the isAlive of run() hence it return false output
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("New Status : " + t1.isAlive());
	 }
}