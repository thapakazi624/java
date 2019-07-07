//demo ByteArrayOutputStream class
import java.io.*;
class file8
{
	public static void main(String[] args) 
	{
		
		try
		{
			FileOutputStream fo = new FileOutputStream("xyz.text");
			FileOutputStream f1 = new FileOutputStream("xyz1.text");
			ByteArrayOutputStream b1 = new ByteArrayOutputStream();
			byte b[]= {'A','b','c'};
			b1.write(b);
			b1.writeTo(fo);
			b1.writeTo(f1);
			b1.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("writing to multiple files complete");
		}
	}
}