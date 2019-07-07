//java demo of BufferedInputSream class
import java.io.*;
class file4
{
	public static void main(String[] args) 
	{
		try
		{
			//creating FileInputstream object fin and determining file to be read f1.txt
			FileInputStream fin = new FileInputStream("f1.txt");
			//creating object of BufferInputStream class b2  associtating object fin
			BufferedInputStream b2 = new BufferedInputStream(fin);
			int ch;
			while((ch=b2.read())!=-1)
			{
				//reads from the file
				System.out.println((char)ch);
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}