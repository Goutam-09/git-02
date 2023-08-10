import java.util.Scanner;
class Strongnumber
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number = ");
	  int n = sc.nextInt();
	  int r,sum = 0,temp = n;
	  while(n!=0)
	  {
	  	r = n%10;
	  	sum = sum + fact(r);
	  	n = n/10;
	  }
	  if(temp==sum)
	  {
	  	System.out.println("Strong number");
	  }
	  else
	  {
	  	System.out.println("Not a strong number");
	  }
	}
	static int fact(int n)
	{
		int i=1,f=1;
		while(i<=n)
		{
			f = f*i++;
		}
		return f;
	}
}