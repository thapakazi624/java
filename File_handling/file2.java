//demo of FileInputStream class
import java.io.*;
class file2
{
	public static void main(String[] args)
	{
		FileInputStream infile = null;
		
		try
		{
			//name of the file to be read
			infile = new FileInputStream("a1.text");
			int b;
			//determining the end of file
			while((b=infile.read())!=-1)
			{
				System.out.println((char)b);
			}
			//closing the file
			infile.close();

		}	
		catch(Exception e)
		{
			System.out.println(e);

		}
	}
}