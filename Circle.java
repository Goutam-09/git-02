public class Circle 
{
	private double result;
	public double area(int rad)
	{
		result=3.14*rad*rad;
		return result;
	}
	public double circumference(int rad)
	{
		result=2*3.14*rad;
		return result;
	}
    public static void main(String[] args) {
		Circle obj=new Circle();
		System.out.println(obj.area(3));
		System.out.println(obj.circumference(3));
	}
}