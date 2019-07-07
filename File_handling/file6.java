//java demo of filewriter 
import java.io.*;
class file6
{
	public static void main(String[] args) 
	{
		File outfile = new File("x1.text");
		FileWriter fw = null;

		try
		{
			fw = new FileWriter(outfile);
			String s = "hello World";
			fw.write(s);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("writing to the file is completed");
		}
	}
}