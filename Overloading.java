class Overloading
{
	 void show()
	{
		System.out.println("Satic");
	}
	 void show()
	{
		System.out.println("static 1");
	}
	public static void main(String[] args) 
	{
		Overloading ob1 = new Overloading();
		ob1.show();
	}
}