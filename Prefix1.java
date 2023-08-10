class Prefix1
{
	public static boolean checkChar(String s[],char ch,int index)
	{
		for(int i=0;i<s.length;i++)
		{
			if(index>=s[i].length()||s[i].charAt(index)!=ch)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String s = args[0];
		int i;
		boolean b = true;
		for(i=0;i<s.length();i++)
		{
			b = checkChar(args,s.charAt(i),i);
			if(b==false)
				break;
		}	
		System.out.print(s.substring(0,i));
	}
}