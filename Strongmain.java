public class Strongmain
{
	public static void main(String[] args) {
		Strong obj=new Strong();
		if(obj.checkStrong(145))
			System.out.println("Strong number");
		else 
			System.out.println("Not Strong number");
	}
}