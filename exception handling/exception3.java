//uses of the throws statement
//creating our own exception
class myexception extends Exception
{
	myexception(String s)
	{
		super(s);
	}
} 
class exception3
{
	static void validage(int age) throws myexception
	{
		if(age<18)
		{
			//throws an exception made above if the above question doesnt satisfy
			throw new myexception("you are not valid to vote");
		}
		else
		{
			System.out.println("welcome to vote");
		}

	}
	public static void main(String args[])
	 {
	 	//checking for the input validations and catching the exception thrown above
		try
		{
			validage(Integer.parseInt(args[0]));
		}
		catch(myexception my)
		{
			

			System.out.println(my.getMessage());
		}
		
			finally
			{
				System.out.println("execution complete");
			}
		
	}
	
}