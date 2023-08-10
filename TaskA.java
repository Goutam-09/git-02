public class TaskA
{
	private int roll;
	private String nam;
	public void setA(int id,String name)
	{
		roll=id;
		nam=name;
	}
	public void getA()
	{
		System.out.println("Name="+nam+" roll="+roll);
	}
  	public static void main(String[] args) 
  	{
  		TaskA obj=new TaskA();
  		obj.setA(101,"Goutam");
  		obj.getA();
  	}
}