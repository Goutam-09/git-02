class NewArrayList
{
	public static void main(String[] args) 
	{
		MyArrayList m = new MyArrayList(5);
		m.add(10);
		m.add(20);
		m.add(50);
		m.add(60);
		m.add(70);
		m.add(80);
		m.add("hello");
		System.out.println("First->"+m);
		/*MyArrayList m1 = new MyArrayList(5);
		m1.add(10);
		m1.add(20);
		m1.add(30);
		m1.add("hello");
		System.out.println("Second"+m1);
		System.out.println(m1.containsAll(m));*/
		m.remove("hello");
		System.out.println(m);

	}
}

class MyArrayList
{
	private int capacity,size;
	Object value[];
	MyArrayList()
	{
		this(5);
	}

	MyArrayList(int cap)
	{
		capacity = cap;
		size = -1;
		value = new Object[capacity];
	}

	MyArrayList(MyArrayList m)
	{
		this();
		addAll(m);
	}

	public void increaseCapacity()
	{
		capacity+=5;
		Object arr[] = new Object[capacity];
		for(int i=0;i<=size;i++)
		{
			arr[i] = value[i];
		}
		value=arr;
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
				value[i]=value[i-1];
			}
			value[index]=val;
		}
	}

	public void set(Object val,int index)
	{
		if(index>=0&&index<=size)
		value[index]=val;
	}

	public void add(Object val)
	{
		if(size==capacity-1)
		{
			increaseCapacity();
		}
		value[++size] = val;		
	}

	public void addAll(MyArrayList ml)
	{
		for(int i=0;i<=ml.size;i++)
		{
			add(ml.getObject(i));
		}
	}

	public int getCapacity()
	{
		return capacity;
	}

	public int getSize()
	{
		return size;
	}

	public Object getObject(int i)
	{
		try 
		{
			return value[i];
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public int indexOf(Object ob)
	{
		for(int i=0;i<=size;i++)
		{
			if(ob.equals(value[i]))
				return i;
		}
		return -1;
	}

	public boolean contains(Object ob)
	{
		return indexOf(ob)!=-1;
	}

	public boolean containsAll(MyArrayList val)
	{
		for(int i=0;i<val.getSize();i++)
		{
			if(indexOf(val.getObject(i))==-1)
			{
				return false;
			}
		}
		return true;
	}

	public MyArrayList retainAll(MyArrayList m1)
	{
		MyArrayList al =  new MyArrayList(5);
		for(int i=0;i<=size;i++)
		{
			if(m1.contains(value[i]))
			{
				al.add(value[i]);
			}
		}
		return al;
	}

	public int LastIndexOf()
	{
		return size;
	}

	public String arrToString(MyArrayList m)
	{
		String s1="";
		return s1+m;
	}

	public MyArrayList clone()
	{
		MyArrayList m3 = new MyArrayList();
		for(int i=0;i<=size;i++)
		{
			m3.add(value[i]);
		}
		return m3;
	}

	public void clear()
	{
		capacity =5;
		value=null;
		size=-1;
	}

	public void remove(Object obj)
	{
		System.out.println(size);
		for(int i=0;i<=size;i++)
		{
			if(obj.equals(value[i]))
			{
				for(int j=i;j<=size;j++)
				{
					value[j]=value[j+1];
				}
				i--;size--;
			}
		}		
	}
	
	public String toString()
	{
		String s="";
		for(int i=0;i<=size;i++)
		{
			s=s+", "+value[i];
		}
		if(size==-1)
			return "[]";
			return "["+s.substring(1)+" ]";
	}
}