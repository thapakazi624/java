//java demo of FileOutputStream class
import java.io.*;
class file1
{
	public static void main(String[] args)
	{
		FileOutputStream ofile = null;
		//value to be inseted in the file (array)
		byte b1[]={'A','B'};
		try
		{
			//determining the file name that stores above array
			ofile = new FileOutputStream("a1.text");
			//writes above values to the file
			ofile.write(b1);
			//closes file
			ofile.close();

		}	
		catch(Exception e)
		{
			System.out.println(e);

		}
	}
}