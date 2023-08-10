import java.util.*;
class MyGenricFeature
{
	public static void main(String[] args) 
	{
		//ArrayList al = new ArrayList();//In this case note will come and run time exception
		ArrayList<Integer>al = new ArrayList<Integer>();//In this case note will be resolve and covert the run time exception to compile time error
		al.add(10);
		//al.add("helo");
		al.add(20);	
		al.add(30);	
		al.add(40);	
		al.add(50);
		show(al);
	}
	public static void show(ArrayList al)
	{
		int sum=0;
		for (int i=0;i<al.size();i++) 
		{ 
			sum=sum+(Integer)al.get(i);	
		}	
		System.out.println(sum);	
	}
}
