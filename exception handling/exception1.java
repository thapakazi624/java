class exception1
{
	public static void main(String[] args) {
		 int i = 10;

		try
		{
			//since this code is not valid causes infinite loop so kept in try block
			i =i/0;
		}
		//we need to catch arithmetic exception
		catch(ArithmeticException e)
		{
			//this method prints name of exception : description of exception : stack trace
			e.printStackTrace()
			System.out.println(e);
			//this method prints name of exception : description of exception ,  but not stack trace
			// System.out.println(e.toString());
			//this method prints description of exception ,  but not name of exception and stack trace
			// System.out.println(e.getMessage());
		}
		System.out.println("value of i "+i);
	}
}