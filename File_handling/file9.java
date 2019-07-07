//reading data from keyboard with InputStreamReader
import java.io.*;
class file9
{
	public static void main(String[] args) throws Exception
	{
		File f1 = new File("abc.text");
		FileWriter fw =null;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String s = br.readLine();
		try
		{
			fw = new FileWriter(f1);
			fw.write(s);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}