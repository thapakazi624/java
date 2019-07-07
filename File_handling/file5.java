//demo of filereader
import java.io.*;
class file5
{
	public static void main(String[] args) 
	{
		//creates object of File  and determine file to be read
		File infile = new File("f1.txt");
		//determining object of filreader assigning to null
		FileReader fr = null;
		try
		{
			fr = new FileReader(infile);
			int ch;
			while((ch=fr.read())!=-1)
			{
				System.out.println((char)ch);
				fr.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("reading from the file is complete");
		}
		
	}
}