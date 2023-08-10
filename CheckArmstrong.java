public class CheckArmstrong
{
	public static void main(String[] args) {
		Armstrong obj=new Armstrong();
		if(obj.checkArmstrong(15))
			System.out.println("Given number is Armstrong");
		else 
			System.out.println("Given number is not Armstrong");
	}
}