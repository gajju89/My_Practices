package com.gajju.dspractices;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	class Node
	{
		int data;
		Node left,right;
		
		public Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LevelOrderTraversal tree=new LevelOrderTraversal();
		tree.insertNode(40);
		tree.insertNode(30);
		tree.insertNode(20);
		tree.insertNode(10);
		tree.insertNode(5);
		tree.insertNode(15);
		tree.insertNode(20);
		tree.insertNode(70);
		tree.insertNode(80);
		tree.insertNode(90);
		System.out.println("After Level Traverasl");
		tree.levelOrderTraversal(root);

	}
	
	void insertNode(int key) {
	    root = insert(root, key);
	 }
	
	public Node insert(Node root,int data)
	{

		if(root==null){
			root=new Node(data);
	     return root;
		}
	
	     if (data < root.data)
	         root.left = insert(root.left, data);
	     else if (data > root.data)
	         root.right = insert(root.right, data);

	     /* return the (unchanged) node pointer */
	     return root;
	
	}
	
	public void levelOrderTraversal(Node root)
	{
		if(root==null)return;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node node=q.poll();
			System.out.println(node.data+" ");
			if(root.left!=null)
			{
				q.add(root.left);
			}
			if(root.right!=null)
			{
				q.add(root.right);
			}
		}
	}

}
