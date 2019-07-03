class box{
	//variables declaration
	double height;
	double width;
	double depth;

	//methods
	double voolume()
	{
		return height*width*depth;
	}

		public static void main(String[] args){
			//object
		box mybox1 = new box();
		mybox1.height = 3;
		mybox1.width = 4;
		mybox1.depth = 1;
		double vol = mybox1.voolume();
		System.out.println(vol);
	}
}