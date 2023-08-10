import java.util.Scanner;
public class CheckAutomorphic
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
		Automorphic obj=new Automorphic();
		if(obj.checkMorphic(n))
			System.out.println("Given number is Automorphic number = " +n);
	    else 
	    	System.out.println("Given number is not Automorphic number = " +n);

	}
}