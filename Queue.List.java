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
class Queue
{
	Node rear,front;
	int size;
	Queue()
	{
		rear=front=null;
		size=0;
	}
	public void insertion(Object data)
	{
		Node n = new Node(data);
		if(rear==null)
		{
			rear=n;
		}
		else 
		{
			n.setNext(rear);
			rear=n;
		}
	}
}
class Main()
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.insertion(10);
		System.out.println(q);	
	}
}