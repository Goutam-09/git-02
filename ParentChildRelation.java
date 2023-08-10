class ParentChildRelation
{
	public static void main(String[] args) 
	{
		c t = new c();
		t.giveMoney();	
	}
}
class p
{
	public void giveMoney()
	{
		System.out.println("P take money");
	}
}
class c extends p
{
	public void giveMoney()
	{
		super.giveMoney();
		System.out.println("c take money");
	}
}