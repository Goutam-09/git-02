class SingleTon
{
	private static SingleTon obj;
	private SingleTon()
	{

	}
	public static SingleTon getObj()
	{
		if(obj==null)
			obj=new SingleTon();
		return obj;
	}
}
class Apply
{
	public static void main(String[] args) 
	{
		System.out.println(SingleTon.getObj());
		System.out.println(SingleTon.getObj());
		System.out.println(SingleTon.getObj());
	}
}  