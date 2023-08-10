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

class QueueList
{
	Node rear,front;
	int size;
	QueueList()
	{
		rear=front=null;
		size=0;
	}
	public void inQueue(Object data)
	{
		Node n = new Node(data);
		if(rear==null)
		{
			front=rear=n;
		}
		else 
		{
			rear.setNext(n);
			rear=n;
		}
	}

	public Object deQueue()
	{
		if(rear==null)
			return null;
		else 
		{
			Object a=front.getData();
			front=front.getNext();
			return a;
		}
	}
	
	public String toString()
	{
		String s="";
		Node temp=front;
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
		QueueList q = new QueueList();
		q.inQueue(10);
		q.inQueue(20);
		q.inQueue(30);
		System.out.println(q);	
		q.deQueue();
		System.out.println(q);
	}
}