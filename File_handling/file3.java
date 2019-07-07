//java demo of BufferedOutputStream class
import java.io.*;
class file3
{
	public static void main(String[] args) 
	{
		try
		{
			//creating FileOutputstream object fout and determining file to be written f1.txt
			FileOutputStream fout = new FileOutputStream("f1.txt");
			//creating object of BufferOutputStream class b1  associtating object fout
			BufferedOutputStream b1 = new BufferedOutputStream(fout);
			String s = "EEC Classes";
			byte b[]=s.getBytes();
			//writes value into the file
			b1.write(b);
			b1.close();
			fout.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}