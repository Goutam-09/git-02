class Equalsmethod
{

	public static void main(String[] args) 
	{
		int i=150;
		int j=150;
		Integer a=150;//internally it converted into->Integer a=new Integer(150);this is called autoboxing and process done in all wrapper clases
		Integer b=150;
		Integer x=120;
		Integer y=120;
		Integer k=128;
		Integer l=128;
		System.out.println(i==j);//true
		System.out.println(a.equals(b));//true
		System.out.println(x==y);//true
		System.out.println(k==l);//false
		System.out.println(a.toString()+50);//15050
		System.out.println(a.intValue()+50);//200
		System.out.println(i.intValue()+50);//error because autoboxing and autounboxing applicable in only wrapper classes
	}
}
