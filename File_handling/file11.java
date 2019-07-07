//demo PrintStream class
import java.io.*;
class file11
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("abc1.text");
		PrintStream p1 = new PrintStream(fout);
		p1.println(400);
		p1.println("hello world");
		p1.close();
		fout.close();
	}
}