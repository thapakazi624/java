//creating class that implements from two interfaces
class interface2 implements i1,i2 {
	public void method1()
	{
		System.out.println(i1.i);//reads the value of i from interface i1
		System.out.println(i2.i);//reads the value of i from interface i2
	}
	public static void main(String[] args) {
		interface2 obj2 = new interface2();
		obj2.method1();
	}
}