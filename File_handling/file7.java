//demo of reading content from one file and writing to other
import java.io.*;
class file7
{
	public static void main(String[] args) 
	{
		File infile = new File("x1.text");
		File outfile = new File("x2.text");
		FileReader fr = null;
		FileWriter fw = null;
		try
		{
			fr = new FileReader(infile);
			fw = new FileWriter(outfile);
			int ch;
			while((ch=fr.read())!=-1)
			{
				fw.write(ch);
			}

			fr.close();
			fw.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("copying the content is successfull");
		}
	}
}