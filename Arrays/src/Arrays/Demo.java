package Arrays;

import java.util.Stack;

class Demo
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head;
	public void add(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	public void reverse()
	{
		Stack<Integer> stk=new Stack<Integer>();
		Node temp=head;
		while(temp!=null)
		{
			stk.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null)
		{
			temp.data=stk.pop();
			temp=temp.next;
		}
	}
	public String toString()
	{
		String st="[";
		Node temp=head;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp.next!=null)
				st=st+"->";
			temp=temp.next;
		}
		return st+"]";
				
	}
	
	public static void main(String[] args) 
	{
		Demo dl=new Demo();
		dl.add(10);dl.add(20);dl.add(30);dl.add(40);dl.add(50);
		System.out.println(dl);
		dl.reverse();
		System.out.println(dl);
	}
}