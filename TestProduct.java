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
	public String toString()
	{
		return "1.Name: "+name+" 2.Color: "+color+" 3.Price: "+price+"4.Weight: "+weight;
	}
							//Setter method to edit private varibles
	public void setname(String n)
	{
		this.name=n;
	}
	public void setcolor(String c)
	{
		this.color=c;
	}
	public void setprice(int p)
	{
		this.price=p;
	}
	public void setweight(int w)
	{
		this.weight=w;
	}
							//getter method to print
	public String getname()
	{
		return name;
	}
	public String getcolor()
	{
		return color;
	}
	public int getprice()
	{
		return price;
	}
	public int getweight()
	{
		return weight;
	}

}
class TestProduct
{
	public static void main(String[] args) 
	{
		product obj = new product("Dairy Milk","Blue",11,20);
		product obj1 = new product("Dairy Milk","Blue",20,30);
		System.out.println(obj.getname());//use for ascees private elements
		System.out.println(obj1);
		obj.setname("Milky Bar");
		obj.setcolor("Yellow");
		obj.setprice(50);
		obj.setweight(12);
		/*System.out.print(obj.getname());
		System.out.print(obj.getcolor());
		System.out.print(obj.getprice());
		System.out.print(obj.getweight());*/
		System.out.print(obj);
		
	}
}
