import java.util.*;
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
class LinkList
{
	Node head,tail;
	int size;
	LinkList()
	{
		head=tail=null;
		size=0;
	}
	public void add(Object data,int pos)
	{
		Node n = new Node(data);
		if(head==null)
		{
			head=tail=n;
		}
		else if(pos<size)
			addFirst(data);
		else if(pos>size)
			addLast(data);
		else 
		{
			int c=1;
			Node temp=head;
			while(temp.getNext()!=null&&c<pos-1)
			{
				c++;
				temp=temp.getNext();
			}
			n.setNext(temp.getNext());
			temp.setNext(n);
			size++;
		}
	}
	public void addFirst(Object data)
	{
		Node n = new Node(data);
		if(head==null)
		{
			head=tail=n ;
		}
		else 
		{
			n.setNext(head);
			head=n;
		}
		size++;
	}
	public void addLast(Object data)
	{ 
		Node n = new Node(data);
		if(head==null)
		{
			head=tail=n;
		}
		else 
		{
			tail.setNext(n);
			tail=n;
		}
		size++;
	}
	public Object getFirst()
	{
		if(head==null)
			return null;
			return head.getData(); 
	}
	public Object getLast()
	{
		if(head==null)
			return null;
			return tail.getData(); 
	}
	public void removeFirst()
	{
		head=head.getNext();
		size--;
	}
	public void removeLast()
	{
		Node temp=head;
		while(temp.getNext().getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(null);
		size--;
	}
	public void set(Object data,int index)
	{
		Node temp=head;
		int c=-1;
		while(temp.getNext()!=null)
		{
			c++;
			if(c==index)
			{
				temp.setData(data);
			}
			temp=temp.getNext();
		}
	}
	public Object get(int index)
	{
		Node temp=head;
		int c=-1;
		while(temp.getNext()!=null)
		{	
			c++;
			if(c==index)
			{
				break;
			}
			temp=temp.getNext();
		}
		return temp.getData();
	}
	public int indexOf(Object data)
	{
		int c=-1;
		Node temp=head;
		while(temp!=null)
		{
			c++;
			if(data==temp.getData())
			{
				return c;
			}
			temp=temp.getNext();
		}
		return -1;
	}
	public int lastIndexOf()
	{
		Node temp=head;
		int c=-1;
		while(temp!=null)
		{
			c++;
			temp=temp.getNext();
		}
		return c;
	}
	public boolean contains(Object data)
	{
		return indexOf(data)!=-1;
	}
	public void reverse()
	{
		Node cur=head,pre=null,next=null;
		while(cur!=null)
		{
	        next=cur.getNext();
	        cur.setNext(pre);
	        pre=cur;
	        cur=next;
		}
		head=tail;
		tail=pre;
	}
	public void clearAll()
	{
		head=null;
		tail=null;
		size=0;
	}
	public void remove(int pos)
	{
		Node temp=head;
		int c=1;
		if(pos<size)
			removeFirst();
		else if(pos>size)
			removeLast();
	    else 
	    {
			while(temp.getNext()!=null&&c<pos-1)
			{
				c++;
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			size--;
		}
	}
	public String toString()
	{
		String s = "";
		Node temp=head;
		if(head==null)
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
		LinkList l1 = new LinkList();
		System.out.println(l1);
		l1.addFirst(10);	
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		System.out.println(l1);
		System.out.println("First: "+l1.getFirst());
		System.out.println("Last: "+l1.getLast());
	   /* l1.clearAl1();
	    System.out.println("Empty :"+l1);*/
	   // l1.removeFirst();
	  //  System.out.println("Remove First: "+l1);
	 //   l1.removeLast();
	 //   System.out.println("Remove Last: "+l1);
	  //  l1.add(100,0);
	 //   System.out.println(l1);
	   //   l1.set(500,2);
	    //  System.out.println(l1);
	      System.out.println("value at given index :"+l1.get(2));
	      System.out.println("index of given value: "+l1.indexOf(5000));
	      System.out.println("last index of : "+l1.lastIndexOf());
	      LinkList l2 = new LinkList();
	      l2.addFirst(10);	
		  l2.addFirst(20);
		  l2.addFirst(30);
		  System.out.println(l2);
		 // System.out.println(l1.contains(10));
		 // l1.reverse();
		 // System.out.println(l1);
		  l1.remove(1);
		  System.out.println(l1);
	}
} 