
public class MySortedList {
	private class Node
	{
		public int element;
		public Node next;
		
		public Node(int element)
		{
			this.element = element;
			this.next = null;
		}
		
		public Node(int element, Node head)
		{
			this.element = element;
			this.next = head;
		}
	}
	
	private Node head;
	
	public MySortedList()
	{
		this.head = null;
	}

	public void add(int item)
	{
		if(head == null)
		{
			head = new Node(item);
		}
		
		else if(head.element >= item)
		{
			head = new Node(item, head);
		}
		else
		{
			Node n = head.next;
			Node h = head;
			while(n != null)
			{
				if(n.element >= item)
				{
					h = new Node(item, n);
					return;
				}
				h = n;
				n = n.next;
			}
			h.next = new Node(item, null);
		}
	}
	
	public void delete(int item)
	{
		Node current = head;
		Node p = head.next;
		
		if(head == null)
		{
			System.out.println("The Linked List is Empty! ");
		return;
		}
		
		if(head.element == item)
		{
			head = p;
			return;
		}
		
		else if(p == null)
		{
			head = null;
			return;
		}
		
		else
		{
			for(;p != null; current = p, p = p.next)
			{
				if(p.element == item)
				{
					current.next = p.next;
					return;
				}
			}
		}
	}
	
	public int max()
	{
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		return current.element;
	}
	
	public int min()
	{
		return head.element;
	}
	
	public void print()
	{
		Node current = head;
		
		if(isEmpty())
		{
			System.out.println("The linked list is empty!");
			return;
		}
		
		String ans = "";
		
		while(current.next != null)
		{
			ans += current.element + " ";
			current = current.next;
		}
		System.out.println(ans);
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
}
