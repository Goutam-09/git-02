public class Rec 
{
	private int result;
	public int area(int len,int wid)
	{
		result=len*wid;
		return result;
	}
	public int perimeter(int len,int wid)
	{
		result=2*(len+wid);
		return result;
	}
    public static void main(String[] args) {
		Rec obj=new Rec();
		System.out.println(obj.area(10,20));
		System.out.println(obj.perimeter(10,20));
	}
}