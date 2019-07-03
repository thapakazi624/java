class interface2 implements i1,i2 {
	public void method1()
	{
		System.out.println(i1.i);
		System.out.println(i2.i);
	}
	public static void main(String[] args) {
		interface2 obj2 = new interface2();
		obj2.method1();
	}
}