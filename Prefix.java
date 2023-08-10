class Prefix
{
	public static boolean checkChar(String s[],char ch,int index)
	{
		for(int i=0;i<s.length;i++)
		{
			if(index>=s[i].length()||s[i].charAt(index)!=ch)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String s = args[0];
		boolean b=true;                //  leetcode      leet      leeto
		int i;
		for(i=0;i<s.length();i++)
		{
			b = checkChar(args,s.charAt(i),i);
			if(b==false)
				break;
		}	
		System.out.println(s.substring(0,i));
	}
}