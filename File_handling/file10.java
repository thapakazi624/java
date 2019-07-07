//reading input from keyboard using console
import java.io.*;
class file10
{
	public static void main(String[] args) 
	{
		Console c = System.console();
		c.readLine();

		char[] s =c.readPassword();
		System.out.println("your password revealed:  "+(String.valueOf(s)));
	}
}