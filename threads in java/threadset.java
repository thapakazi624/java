//thread implementing runnable
class thread1 implements Runnable
{
	public void run()
	{
		for (int i=0;i<5 ;i++ ) 
		{
			System.out.println("thread1 value is: "+i);
		}
	}
}
class thread2 implements Runnable
{
	public void run()
	{
		for (int j=0;j<5 ;j++ ) {
			System.out.println("thread2 value is: "+j);
		}
	}
}
class threadset
{
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		//if we use extends thread instead of extends runnable we dont have to create thread object, done in below two lines
		Thread tobj1 = new Thread(t1);
		Thread tobj2 = new Thread(t2);
		tobj1.start();
		tobj2.start();
	}
}