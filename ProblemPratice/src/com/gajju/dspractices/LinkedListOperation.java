package com.gajju.dspractices;

import javax.xml.transform.Templates;

public class  LinkedListOperation
{
	int data;
	LinkedListOperation next;
	public LinkedListOperation()
	{
	}
	public LinkedListOperation(int data2) {
		// TODO Auto-generated constructor stub
		this.data=data2;
		this.next=null;
		
	}
	LinkedListOperation head=null;
	public  void  createList(int data)
	{
		LinkedListOperation dataNode=new LinkedListOperation(data);
	  ///Node node
	  if(head==null)
	  {
		   head=new LinkedListOperation(data);
		   return ;
		  
	  }
	  dataNode.next=null;	
	  LinkedListOperation temp=head;
	  while(temp.next!=null)
	  {
		  temp=temp.next;
	  }
	  temp.next=dataNode;
	  return;
	  
	
	  
	}
	
	public void printList()
	{
		LinkedListOperation temp=head;
		if(temp==null)
		{
			System.out.println("linked List is Empty !");
		}
		while(temp!=null)
		{
			System.out.println("data:"+temp.data);
			temp=temp.next;
			
		}
	}
	
	public LinkedListOperation removeItem()
	{
		LinkedListOperation temp=head;
		if(head==null)
		{
		return null;
		}
		head=temp.next;
		//temp=head;
		return temp;
		
		//return null;
	}
	
	public LinkedListOperation removeFronGivenPosition(int pos)
	{
		LinkedListOperation temp=head;
		if(pos==0)
		{
			head=temp.next;
			return  temp;
		}
		
	for(int i=0;temp!=null && i<pos-1;i++)
	{
		temp=temp.next;
	}
	if(temp==null || temp.next==null)
		return temp;
	
	
	LinkedListOperation pre=temp.next.next;
	LinkedListOperation det=temp.next;
	
	temp.next=pre;
	return det;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperation node=new LinkedListOperation();
		node.createList(5);
		node.createList(6);
		node.createList(7);
		node.createList(8);
		node.createList(9);
		node.createList(10);
		node.printList();
		System.out.println(node);
		//LinkedListOperation node1=;
		System.out.println("removed item:"+node.removeItem().data);
		
		System.out.println("list after remove:");
		node.printList();

		System.out.println(" remove from position:"+node.removeFronGivenPosition(2).data);
		System.out.println("list after remove pos:");
		node.printList();
	

}
}
