class Node
{
	private Object data;
	private Node next;
	Node(Object data)
	{
		this.data=data;
	}
	public void setData(Object data)
	{
		this.data=data;
	}
	public void setNext(Node next)
	{
		this.next=next;
	}
	public Object getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}	
}
class Stack
{
	Node top;
	int size;
	Stack()
	{
		top=null;
		size=0;
	}
	public void push(Object data)
	{
		Node n = new Node(data);
		if(top==null)
		{
			top=n;
		}
		else 
		{
			n.setNext(top);
			top=n;
		}
	}
	public Object peak()
	{
		 return top.getData();
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is Empty !");
		}
		else 
		{
			System.out.println("This Object is pop from Stack: "+top.getData());
			top=top.getNext();
		}
	}
	public void reverse()
	{
		Node cur=top,pre=null,next=null;
		while(cur!=null)
		{
			next=cur.getNext();
			cur.setNext(pre);
			pre=cur;
			cur=next;
		}
		top=pre;
	}
	public String toString()
	{
		String s="";
		Node temp=top;
		if(temp==null)
			return null;
		else 
		{
			while(temp!=null)
			{
				s=s+","+temp.getData();
				temp=temp.getNext();
			}
			if(size==-1)
			return "[]";
			return "["+s.substring(1)+"]";
		}
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		System.out.println("Peak value in Stack : "+s.peak());
		s.pop();
		//s.reverse();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
}