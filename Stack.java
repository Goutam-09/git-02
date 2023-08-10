class Stack
{
	public static void main(String[] args) 
	{
		Mystack a = new Mystack(5);
		a.push(10);
		a.push(20);
		a.push(30);
		System.out.println(a);
		a.pop();
		System.out.println("peak value: "+a.peak());
		System.out.println(a);
	}
}
class Mystack
{
	private int top,capacity;
	private Object arr[];

	Mystack(int cap)
	{
		top=-1;
		capacity=cap;
		arr = new Object[capacity];
	}
	public void increaseCapacity()
	{
		capacity+=5;
		Object val[] = new Object[capacity];
		for(int i=0;i<=top;i++)
		{
			val[i]=arr[i];
		}
		arr=val;
	}
	public void push(Object val)
	{
		if(top==capacity-1)
		{
			increaseCapacity();
		}
		arr[++top]=val;
	}
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack is Empty");
		else 
		{
			System.out.println("Pop value:"+arr[top]);
			top--;
		}
	}
	public Object peak()
	{
		if(top==-1)
			System.out.println("Stack is Empty");
		return arr[top];
	}
	public String toString()
	{
		String s="";
		for(int i=0;i<=top;i++)
		{
			s=s+", "+arr[i];
		}
		if(top==-1)
			return null;
		return s.substring(1);
	}
}