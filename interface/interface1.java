//creating a class that implements interface i1
class interface1 implements i1 {
	//accessing the method from interface and the value assigned
	public void method1()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		System.out.println("test");
		interface1 obj1 = new interface1();
		obj1.method1();
	}
}