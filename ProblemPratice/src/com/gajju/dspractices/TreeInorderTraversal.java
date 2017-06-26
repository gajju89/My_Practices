package com.gajju.dspractices;

class Node
{
	private int data;
	private Node left,right;
	
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class TreeInorderTraversal {
	
	private Node node;
	
	public TreeInorderTraversal(Node node)
	{
		this.node=node;
	}
	public TreeInorderTraversal()
	{
		node=null;
	}
	
	public void addNode(Node node)
	{
		if(node==null)
			return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
