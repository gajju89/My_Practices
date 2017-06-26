package com.gajju.dspractices;

public class TreeTraversal {
	
	class Node
	{
		int item;
		Node left,right;
		
		public Node(int item)
		{
			this.item=item;
			this.left=null;
			this.right=null;
		}
	}
	
	Node root;
	
	public Node insert(Node root,int data)
	{
		if(root==null){
			root=new Node(data);
	     return root;
		}
	
	     if (data < root.item)
	         root.left = insert(root.left, data);
	     else if (data > root.item)
	         root.right = insert(root.right, data);

	     /* return the (unchanged) node pointer */
	     return root;
	}
	void insertNode(int key) {
	    root = insert(root, key);
	 }
	  
	void preorder()  {
		preOrderTraversal(root);
	 }
	public void preOrderTraversal(Node root)
	{
		if(root==null)return;
		System.out.println("root:"+root.item);
		preOrderTraversal( root.left);
		preOrderTraversal(root.right);
	}
	
	void inorder()  {
		inOrderTraversal(root);
	 }
	public void inOrderTraversal(Node root)
	{
		if(root==null)return;
		
		preOrderTraversal( root.left);
		System.out.println("root:"+root.item);
		preOrderTraversal(root.right);
	}
	
	void postorder()  {
		inOrderTraversal(root);
	 }
	public void postOrderTraversal(Node root)
	{
		if(root==null)return;
		
		preOrderTraversal( root.left);
		preOrderTraversal(root.right);
		System.out.println("root:"+root.item);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTraversal tree=new TreeTraversal();
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
		System.out.println("Pre Order");
		tree.preorder();
		System.out.println("In Order");
		tree.inorder();
		System.out.println("Post Order");
		tree.postorder();
	}

}
