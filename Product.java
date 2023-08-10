class product
{
	private String name;
	private String color;
	private int price;
	private int weight;
	product(String n,String c,int p,int w)
	{
		name=n;
		color=c;
		price=p;
		weight=w;
	}
	public String tostring()
	{
		return "Name: "+name+"Color: "+color+"Price: "+price+"Weight: "+weight;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		product obj = new product("Dairy Milk","Blue",10,20);
		System.out.print(obj);
	}
}