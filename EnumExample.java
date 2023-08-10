class Test
{
	enum Days
	{
		//Mon,Tue,Wed,Thu,Fri,Sat,Sun
		Jan,Feb,Mar,Apr,May,June,July,Aug,Sep,Oct,Nov
	}
	public static void main(String[] args) 
	{
		//System.out.println(Days.Mon);	
		//System.out.println(Days.Mon.ordinal());//ordinal value start from 0
		Days s[] = Days.values();
		for(Days d:s)
		{
			System.out.println(d);
		}
	}
}
