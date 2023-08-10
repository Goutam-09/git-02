class ArrayListCopy
{
	private int capacity,size;
	private Object arr[];
	ArrayListCopy()
	{
		this(5);
	}
	ArrayListCopy(int cap)
	{
		capacity=cap;
		size=-1;
		arr=new Object[capacity];
	}
	ArrayListCopy(ArrayListCopy c)
	{
		this();
		addAll(c);
	}
	public void increaseCapacity()
	{
		capacity+=5;
		Object brr[]=new Object[capacity];
		for(int i=0;i<=size;i++)
		{
			brr[i]=arr[i];
		}
		arr=brr;
	}
	public void add(Object val)
	{
		if(size==capacity-1)
		{
			increaseCapacity();
		}
		arr[++size]=val;
	}
	public void add(Object val,int index)
	{
		if(index>=0&&index<=size)
		{
			if(size==capacity-1)
			{
				increaseCapacity();
			}
			size++;
			for(int i=size;i>index;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[index]=val;
		}
	}
	public void set(Object obj,int index)
	{
		if(index>=0&&index<=size)
		{
			arr[index]=obj;
		}
	}
	public void addAll(ArrayListCopy c)
	{
		for(int i=0;i<=c.getSize();i++)
		{
			add(c.get(i));
		}
	}
	public int getSize()
	{
		return size;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public int indexOf(Object obj)
	{
		for(int i=0;i<=size;i++)
		{
			if(obj.equals(arr[i]))
				return i;
		}
		return -1;
	}
	public int lastIndexOf()
	{
		return size;
	}
	public String arrtoString(ArrayListCopy c)
	{
		String s = "";
		return s+c;
	}
	public boolean contain(Object obj)
	{
		return indexOf(obj)!=-1;
	}
	public Object get(int index)
	{
		/*try 
		{
			return arr[index];
		}
		catch(Exception e)
		{
			return null;
		}*/
		if(index>=0&&index<=size)
			return arr[index];
		else 
			return null;
	}
	public void clear()
	{
		size=-1;
		capacity=5;
		arr=null;
	}
	public void remove(Object obj)
	{	
		for(int i=0;i<=size;i++)
		{
			if(obj.equals(arr[i]))
			{
				for(int j=i;j<size;j++)
				{
					arr[j]=arr[j+1];
				}
				i--;size--;
			}
		}
	}
	public boolean containAll(ArrayListCopy c1)
	{
		for(int i=0;i<=c1.getSize();i++)
		{
			if(indexOf(c1.get(i))==-1)
				return false;
		}
		return true;
	}
	public ArrayListCopy retainsAll(ArrayListCopy c1)
	{
		ArrayListCopy c4 = new ArrayListCopy();
		for(int i=0;i<=size;i++)
		{
			if(c1.contain(arr[i]))
			{
				c4.add(arr[i]);
			}
		}
		return c4;
	}
	public ArrayListCopy clone()
	{
		ArrayListCopy c3 = new ArrayListCopy();
		for(int i=0;i<=size;i++)
		{
			c3.add(arr[i]);
		}
		return c3;
	}
	public String toString()
	{
		String s = "";
		for(int i=0;i<=size;i++)
		{
			s=s+","+arr[i];
		}
		if(size==-1)
			return "[]";
		return "["+s.substring(1)+"]";
	}
}
class Main
{
	public static void main(String[] args) 
	{
		ArrayListCopy c = new ArrayListCopy(5);
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(500);
		System.out.println("Array list 1 ->"+c);
		/*c.add(1000,1);
		System.out.println(c);
		c.set(11,0);
		System.out.println(c);*/
		ArrayListCopy c1 = new ArrayListCopy();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		//c1.addAll(c);
		System.out.println("Array list 2 ->"+c1);
		//System.out.println(c1);
		
		/*System.out.println(c.arrtoString(c));
	
		System.out.println(c.get(-12));
		//c.remove(30);
		//System.out.println(c);
		/*c.clone();
		System.out.println(c);*/
		System.out.println(c.containAll(c1));
		//System.out.println(c1.containAll(c));
		System.out.println(c1.retainsAll(c));
	}
}