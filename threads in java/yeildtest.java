//thread extendig Thread and use of yield()
class A extends Thread
{
	public void run()
	{
		for (int i=0;i<=5; i++) 
		{
			if (i==2) yield();//execution of B stops until the execution of A is completed
			
			System.out.println("value of A : " +i );
		}
		System.out.println("A exit");
	}
}
class B extends Thread
{
	public void run()
	{
		for (int j=0;j<=5; j++) 
		{

			System.out.println("value of B: "+j);
		}
		System.out.println("B exit");
	}
}

class yeildtest
{
	public static void main(String[] args)
	 {
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	 }
}