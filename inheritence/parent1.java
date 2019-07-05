//super class
class parent1
{
	public int i= 10;
	parent1()
	{
		System.out.println("value of i in parent: "+i);
	}
}
//subclass that inherits parent1(single level inheritence) and acts as a base class for child2
class child1 extends parent1
{
	child1()
	{
		
		System.out.println("value of i in child1 "+i);
	}
}
//subclass that inherits child1(multilevel inheritence)
class child2 extends child1
{
	child2()
	{
		System.out.println("value of i in child2 "+i);
	}
}
//subclass that inherits super class (parent1) {heirarchial inheritence}
class child3 extends parent1
{
	
	child3()
	{
		System.out.println("value of i in child3 "+i);
	}

}

class inheritencedemo
{
	public static void main(String[] args) {
	 child1 obj1 = new child1();
	child2 obj2 = new child2();
	 child3 obj3 = new child3();

}
}